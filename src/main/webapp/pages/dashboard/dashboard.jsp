 <button name="logout" value="Logout" ng-click="dashControl.logout()">Logout</button><br><br>

<button name="allUsers" value="All Users" ng-click="dashControl.allUsers()">All Users</button>
<button name="followers" value="Followers" ng-click="dashControl.followers()">Followers</button>
<button name="following" value="Following" ng-click="dashControl.following()">Following</button>


<h2> welcome {{dashControl.fullName}} </h2>
<%--<h1><span ng-bind="dashControl.fullName"></span> </h1>--%>



<form ng-submit="dashControl.saveStory()" method="post">
    <input ng-model="dashControl.storyInfo.story" type="text" name="story" placeholder="Enter Story"/>
    <input type="submit" name="submit" value="Save"/>
</form>

<h2>My Story</h2>
<li ng-repeat="story in dashControl.storyList">
{{story.story}}


</li>
