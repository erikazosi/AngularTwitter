angular.module('angularTwitter').controller('DashboardController',DashboardController);

DashboardController.$inject = ['StorageService','DashboardService'];


function DashboardController(StorageService,DashboardService) {
    var vm = this;
    vm.getUserId = getUserId();


    function getUserId(){

        var data = StorageService.get('userId');

        DashboardService.loginSuccess(data).then(
            function(resp) {
                vm.fullName = resp.firstName + resp.lastName;


            },
            function () {


            }
        );


    }


}