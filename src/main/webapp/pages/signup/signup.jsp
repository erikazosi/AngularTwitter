<div>
<form ng-submit="signupControl.saveUser()" method="post">
    <input type="text" name="firstName" ng-model="signupControl.userInfo.firstName" placeholder="Enter First Name"/>
    <input type="text" name="lastName" ng-model="signupControl.userInfo.lastName" placeholder="Enter Last Name"/>
    <input type="text" name="username" ng-model="signupControl.userInfo.username" placeholder="Enter Username"/>
    <input type="password" name="password" ng-model="signupControl.userInfo.password" placeholder="Enter Password"/>
    <input type="submit" name="submit" value="Sign Up"/>
</form>
</div>