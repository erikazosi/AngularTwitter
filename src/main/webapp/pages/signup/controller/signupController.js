angular.module('angularTwitter')
.controller('SignupController', ['SignupService', SignupController]);

function SignupController(SignupService) {

    var vm=this;

    vm.userInfo = {
        firstName:'',
        lastName:'',
        username:'',
        password:'',
    };


    // console.log(vm.userInfo);

     vm.saveUser=saveUser;

    function saveUser() {


        SignupService.saveNewUser(vm.userInfo);
        /*console.log(vm.userInfo);
        vm.userInfo.newParameter = "hello123";
        console.log(vm.userInfo);*/

        //var appBase = $location.absUrl().split("#!")[0];

       // $http.post(appBase + "signup", vm.userInfo);


    }




}