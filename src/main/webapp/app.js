angular.module('angularTwitter', ['ngRoute']);

angular.module('angularTwitter').config(function ($routeProvider) {


    $routeProvider

        .when('/', {
            templateUrl: 'pages/login/login.jsp'

        })
        .when('/login', {
            //com.twitter.controller: 'LoginController as loginController',
            templateUrl: 'pages/login/login.jsp'

        })

        .when('/signup', {
            controller:'SignupController as signupControl',
            templateUrl: 'pages/signup/signup.jsp'

        });
});