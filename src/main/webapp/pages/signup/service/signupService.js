angular.module('angularTwitter').factory('SignupService',SignupService);

SignupService.$inject = ['HttpService', '$localStorage'];

function SignupService(HttpService,$localStorage) {

    var vm=this;
    vm.resourceURI = 'user/signup';

    return{
        saveNewUser: function (data) {
            return HttpService.post(vm.resourceURI, data);

        }
    }

}
