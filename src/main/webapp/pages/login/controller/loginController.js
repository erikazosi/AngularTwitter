angular.module('angularTwitter')
        .controller('LoginController', LoginController);
LoginController.$inject = ['LoginService','$location','StorageService'];



function LoginController(LoginService,$location,StorageService) {

    var vm=this;
    vm.loginInfo ={
        username:'',
        password:'',


    };
    vm.userId = '';

    vm.loginUser = loginUser;

    function loginUser() {
        console.log(vm.loginInfo);
        LoginService.loginUser(vm.loginInfo).then(
            function (response){
                id = response.id;

                StorageService.set('userId', id);


                $location.path("/dashboard");

            },

            function(){

            }
        );
    }
}