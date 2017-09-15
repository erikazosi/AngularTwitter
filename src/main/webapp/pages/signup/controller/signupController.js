angular.module('angularTwitter')
.controller('SignupController', ['$location',SignupController]);

function SignupController($location) {

    var vm=this;

    vm.userInfo = {
        firstName:'',
        lastName:'',
        username:'',
        password:'',
    };

    vm.saveUser=saveUser;

    function saveUser() {

        /*console.log(vm.userInfo);
        vm.userInfo.newParameter = "hello123";
        console.log(vm.userInfo);*/

        var appBase = $location.absUrl().split("#!")[0];

        $http.post(appBase + "signup", vm.userInfo)

    }

}