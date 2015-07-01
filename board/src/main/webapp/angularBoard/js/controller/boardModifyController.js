boardApp.controller("modifyController", function($scope, $location, $http) {
	var getParam = $location.absUrl().split("=")[1];
	var url = "/board/page/"+getParam;
	$http.get(url).success(function(data) {
		console.log(data);
		$scope.boardPage = data;
	});
});