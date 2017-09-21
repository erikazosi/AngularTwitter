<h2>Following users</h2>
<li ng-repeat="following in followingControl.followingUserList">
    {{following.firstName}} {{following.lastName}}

    <button ng-click="userControl.unfollowUser(following.id)">Unfollow </button>


</li>
