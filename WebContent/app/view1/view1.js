'use strict';
var application = angular.module('myApp.view1', ['ngRoute'])
application.config(['$routeProvider', function($routeProvider) {
  $routeProvider.when('/view1', {
    templateUrl: 'view1/view1.html',
    controller: 'View1Ctrl'
  });
}])
application.controller('View1Ctrl', [ '$scope', function($scope) {
$scope.name = '';
$scope.names = [{name:"Chris"}, {name:"Calvin"}];
$scope.addName = function() {
$scope.names.push( {'name':$scope.name} );
$scope.name = '';
};
}]);

var services = angular.module('myApp.services', ['ngResource']);

services.factory('RequestRecord', ['$resource',
  function($resource){
    return $resource('/ShapesComputations/rest/requestrecord', {}, {
      query: {
    	  		method:'GET',
    	  		params:{},
    	  		isArray:false}
    });
  }]);

application.controller('RequestRecordCtrl', ['$scope', 'RequestRecord', function($scope, RequestRecord) {
	  $scope.request = RequestRecord.query();
	}]);











