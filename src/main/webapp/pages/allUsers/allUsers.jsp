
<h2>All users</h2>
<li ng-repeat="story in userControl.userList">
    {{story.firstName}} {{story.lastName}}

    <button ng-click="userControl.followNewUser(story.id,story.firstName,story.lastName)">Follow </button>

    <br><br>
</li>
