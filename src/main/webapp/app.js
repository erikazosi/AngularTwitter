angular.module('angularTwitter', ['ngRoute','ngStorage']);

angular.module('angularTwitter').config(function ($routeProvider) {


    $routeProvider

        .when('/', {
            controller: 'LoginController as loginControl',
            templateUrl: 'pages/login/login.jsp'

        })
        .when('/login', {
            controller: 'LoginController as loginControl',
            templateUrl: 'pages/login/login.jsp'

        })

        .when('/signup', {
            controller:'SignupController as signupControl',
            templateUrl: 'pages/signup/signup.jsp'

        })


        .when('/dashboard',{
            controller:'DashboardController as dashControl',

            templateUrl:'pages/dashboard/dashboard.jsp'

        })

        .when('/allUsers',{
            controller:'AllUsersController as userControl',
            templateUrl:'pages/allUsers/allUsers.jsp'

        })

        .when('/followers',{
            templateUrl:'pages/followers/followers.jsp',
            controller:'FollowerController as followerControl'


        })
        .when('/following',{
            templateUrl:'pages/following/following.jsp',
            controller:'FollowingController as followingControl'
        });
});