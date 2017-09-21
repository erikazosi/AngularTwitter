angular.module('angularTwitter').controller('AllUsersController', AllUsersController);
AllUsersController.$inject = ['AllUsersService', 'StorageService'];

function AllUsersController(AllUsersService, StorageService) {
    var vm = this;
    vm.getAllUsers = getAllUsers();
    vm.followNewUser = followNewUser;

    vm.userList = [];
    vm.following = {};

    function getAllUsers() {
        var data = StorageService.get('userId');
        AllUsersService.getAllUsers(data).then(
            function (resp) {
                vm.userList = resp;

            },
            function () {

            }
        );

    }

    function followNewUser(followingId, firstName, lastName) {
        var currentId = StorageService.get('userId');
        vm.following.followerId = currentId;
        vm.following.followingId = followingId;
        vm.following.followingName = firstName + " " + lastName;
        AllUsersService.followNewUser(vm.following).then(
            function(resp) {
                getAllUsers();

            }
        );

    }


}