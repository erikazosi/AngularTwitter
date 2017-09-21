angular.module('angularTwitter').controller('FollowingController', FollowingController);
FollowingController.$inject = ['FollowingService','StorageService'];

function FollowingController(FollowingService,StorageService) {
    var vm = this;
    vm.getFollowingUsers = getFollowingUsers();
    vm.unfollowUser = unfollowUser;
    vm.followingUserList = [];
    vm.unfollow = {};

    function getFollowingUsers() {

        var data = StorageService.get('userId');
        FollowingService.getFollowingUsers(data).then(
            function(resp) {
                vm.followingUserList = resp;
            },

            function() {

            }
        );
    }

    function unfollowUser(id) {
        vm.unfollow.unfollowingId=id;
        vm.unfollow.followerId = StorageService.get('userId');
        FollowingService.unfollowUser(vm.unfollow).then(
            function (resp) {
                getFollowingUsers();

            }
        );


    }

}
