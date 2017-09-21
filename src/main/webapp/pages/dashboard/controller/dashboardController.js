angular.module('angularTwitter').controller('DashboardController', DashboardController);

DashboardController.$inject = ['StorageService', 'DashboardService', '$location', '$window'];


function DashboardController(StorageService, DashboardService, $location, $window) {
    var vm = this;
    vm.getUserId = getUserId();
    vm.logout = logout;
    vm.saveStory = saveStory;
    vm.allUsers = allUsers;
    vm.following = following;
    vm.followers = followers;
    vm.storyList = [];

    vm.storyInfo = {
        story: '',
        userId: StorageService.get('userId')
    };


    function getUserId() {
        vm.id = StorageService.get('userId');

        DashboardService.loginSuccess(vm.id).then(
            function (resp) {
                vm.fullName = resp.firstName + resp.lastName;
                displayStories();

            },
            function () {


            }
        );
    }

    function displayStories() {
        vm.id = StorageService.get('userId');

        DashboardService.displayStory(vm.id).then(
            function (resp) {
                vm.storyList = resp;

            }
        );
    }

    function saveStory() {
        DashboardService.saveStory(vm.storyInfo).then(
            function (response) {
                // vm.storyList.push(response);
                displayStories();

            },

            function () {

            }
        );

    }

    function logout() {
        $window.localStorage.clear();
        $location.path('/');
    }

    function allUsers() {

        $location.path('/allUsers');

    }

    function following() {
        $location.path('/following');

    }

    function followers() {
        $location.path('/followers');

    }


}