angular.module('angularTwitter').factory('FollowingService', FollowingService);
FollowingService.$inject = ['HttpService'];

function FollowingService(HttpService) {
    var vm = this;

    vm.resourceURI = "follow/followingUsers/";
    return {
        getFollowingUsers: function (data) {
            return HttpService.get(vm.resourceURI + data);
        },

        unfollowUser: function (data) {
            return HttpService.post("follow/unfollowUser", data);
        }
    };
}