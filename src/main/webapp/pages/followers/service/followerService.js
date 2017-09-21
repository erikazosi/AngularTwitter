angular.module('angularTwitter').factory('FollowerService', FollowerService);

FollowerService.$inject = ['HttpService'];

function FollowerService(HttpService) {
    var vm=this;
    vm.resourceURI = 'follow/followers/';

    return{
        getFollowersList: function(data) {
            return HttpService.get(vm.resourceURI + data);
        }
    }
}