angular.module('angularTwitter').factory('HttpService', HttpService);

HttpService.$inject = ['$http', '$q', '$localStorage','$location'];

function HttpService($http, $q, $localStorage, $location){
    // var userInfo = {};
    var vm = this;
    vm.url = $location.absUrl().split('#')[0];

    return {

        // getData: function(){
        //     return userInfo;
        // },
        // setData:function (data){
        //     userInfo = data;
        // },
        get: function (resourceURI) {
            return $http.get(vm.url + resourceURI)
                .then(
                    function (resp) {
                        return resp.data;
                    },
                    function (err) {
                        return $q.reject(err);
                    }
                );
        },

        post: function (resourceURI, data) {
            console.log("http"+data);
            return $http.post(vm.url+resourceURI, data)
                .then(function (resp) {
                    return resp.data;

                },
                    function(err) {
                        return $q.reject(err);
                    });


        }

    };

}