angular.module('app')
    .controller('AppController', AppController);
AppController.$inject = ['$localStorage'];


function AppController($localStorage) {
    var vm = this;

    vm.data = "erika";
    vm.setLocalStorage = setLocalStorage;
    vm.getLocalStorage = getLocalStorage;

    setLocalStorage();

    function setLocalStorage() {
        $localStorage.data = vm.data;

    }

    function getLocalStorage() {
        vm.show = $localStorage.data;

    }


};


