angular.module('angularTwitter').factory('StorageService',StorageService);

StorageService.$inject=['$rootScope'];


 function StorageService($rootScope) {

     return {
         get: function(key) {
             return localStorage.getItem(key);
         },
         set: function(key, data) {
             localStorage.setItem(key, data);
         }
     };
 }


