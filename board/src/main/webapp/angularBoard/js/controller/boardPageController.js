boardApp.controller("boardPageController", function($scope, $location, $http) {
	var getParam = $location.absUrl().split("=")[1];
	var url = "/board/page/"+getParam;
	$http.get(url).success(function(data) {
		$scope.boardPage = data;
	});
});