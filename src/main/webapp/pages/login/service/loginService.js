angular.module('angularTwitter').factory('LoginService', LoginService);

LoginService.$inject = ['HttpService'];

function LoginService(HttpService) {
    var vm = this;

    vm.resourceURI = 'user/login';

    return{
        loginUser: function(data) {
            return HttpService.post(vm.resourceURI, data);
        }
    }

}