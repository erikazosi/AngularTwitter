angular.module('angularTwitter').controller('FollowerController',FollowerController);

FollowerController.$inject = ['FollowerService','StorageService'];

function FollowerController(FollowerService,StorageService) {
    var vm = this;
    vm.followerList = [];
    vm.getFollowerList = getFollowerList();

    function getFollowerList() {
        var id = StorageService.get('userId');

        FollowerService.getFollowersList(id).then(
            function(resp) {
                vm.followerList = resp;

            },

            function () {


            }
        )
    }


}

