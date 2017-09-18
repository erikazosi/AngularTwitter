angular.module('angularTwitter').factory('DashboardService',DashboardService);

DashboardService.$inject = ['HttpService'];

function DashboardService(HttpService) {
    var vm = this;
    vm.resourceURI = 'user/loginSuccess/';

    return{
        loginSuccess: function (userId) {
            return HttpService.get(vm.resourceURI+userId);
        }
    }

}