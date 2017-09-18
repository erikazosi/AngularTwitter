
<form ng-submit="loginControl.loginUser()" method="post">

<input type="text" name="username" ng-model="loginControl.loginInfo.username" placeholder="Enter Username"/>
<input type="password" name="password" ng-model="loginControl.loginInfo.password" placeholder="Enter Password"/>
<input type="submit" name="submit" value="Login"/>
<br><br>
</form>
<a href="#!signup">Signup</a>
