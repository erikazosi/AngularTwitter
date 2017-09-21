<html lang="en" ng-app="angularTwitter">
<head>

    <meta charset="UTF-8">

    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.6/angular-route.min.js"></script>

    <script src="app.js"></script>
    <script src="./pages/signup/controller/signupController.js"></script>
    <script src="./pages/signup/service/signupService.js"></script>

    <script src="./pages/login/service/loginService.js"></script>
    <script src="./pages/login/controller/loginController.js"></script>
    <script src="./pages/commons/httpService.js"></script>
    <script src="./pages/commons/storageService.js"></script>
    <script src="./pages/dashboard/controller/dashboardController.js"></script>
    <script src="./pages/dashboard/service/dashboardService.js"></script>
    <script src="./pages/allUsers/controller/allUsersController.js"></script>
    <script src="./pages/allUsers/service/allUsersService.js"></script>
    <script src="./pages/following/controller/followingController.js"></script>
    <script src="./pages/following/service/followingService.js"></script>

    <script src="./pages/followers/service/followerService.js"></script>
    <SCRIPT src="./pages/followers/controller/followerController.js"></SCRIPT>




    <%--<script src="appController.js"></script>--%>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/ngStorage/0.3.11/ngStorage.min.js"></script>


    <title>Login</title>
</head>

<body>
<div ng-view></div>
</body>

</html>

