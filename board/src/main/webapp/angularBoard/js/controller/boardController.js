boardApp.controller("boardController", function($scope, $http){
	$http.get("/board/list").success(function(data){
		$scope.boardList = data;
	});

});