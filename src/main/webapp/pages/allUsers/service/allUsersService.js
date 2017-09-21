angular.module('angularTwitter').factory('AllUsersService',AllUsersService);
AllUsersService.$inject = ['HttpService'];

function AllUsersService(HttpService) {
    var vm = this;

    vm.resourceURI = "user/allUsers/";

    return{
       getAllUsers: function(userId){
        return HttpService.get(vm.resourceURI+userId);

    },

        followNewUser:function(following) {
           vm.resourceURI="follow/followNewUser"
            return HttpService.post(vm.resourceURI, following);
        }

}
}