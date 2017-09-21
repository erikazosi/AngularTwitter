angular.module('angularTwitter').factory('DashboardService',DashboardService);

DashboardService.$inject = ['HttpService'];

function DashboardService(HttpService) {
    var vm = this;
    vm.resourceURI = 'user/loginSuccess/';

    return{
        loginSuccess: function (userId) {
            return HttpService.get(vm.resourceURI+userId);
        },

        saveStory:function(data) {
            vm.resource = 'addStory';
            console.log(data);
            return HttpService.post(vm.resource, data);
        },

        displayStory:function(userId) {

            vm.resource = 'displayStory/';
            return HttpService.get(vm.resource+userId);
        }

    }

}