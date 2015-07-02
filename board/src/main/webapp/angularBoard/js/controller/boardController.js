boardApp.controller("boardController", function($scope, $http){
	$scope.dynamicPopover = {
		    content: 'Hello, World!',
		    templateUrl: 'imgPopoverTemplate.html',
		  };
	$http.get("/board/list").success(function(data){
		$scope.boardList = data;
	});

});