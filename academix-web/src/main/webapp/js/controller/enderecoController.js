angular.module('academix').controller('EnderecoListController', function($scope, Endereco) {

	$scope.enderecos = [];
	
	$scope.$on('MSG', function(msg) {
		$scope.mensagem = msg;
	})
	
	$scope.$on('MSG_ERRO', function(erro) {
		$scope.erro = erro;
	});

	function obterEnderecos() {
//		$scope.enderecos = Endereco.jsonpquery();
		Endereco.query(
			function(enderecos) {
				$scope.enderecos = enderecos;
			},
			function(msg) {
				$scope.erro = {texto: "Ocorreu um erro. Informe ao Administrator a seguinte mensagem: " + msg.statusText};
				console.log(msg);
			}
		);
	}

	$scope.removeEndereco = function(endereco) {
		Endereco.delete({id: endereco.id},
			obterEnderecos,
			function(msg) {
				$scope.erro = {texto: "Ocorreu um erro. Informe ao Administrator a seguinte mensagem: " + msg.statusText};
				console.log(msg);
			}
		);
	}
	
	obterEnderecos();

})

.controller('EnderecoController',
		function($scope, $rootScope, $routeParams, $window, $timeout, Endereco) {
	
	if($routeParams.enderecoId) {
		Endereco.get({id: $routeParams.enderecoId},
				function(endereco) {
					$scope.endereco = endereco;
				},
				function(msg) {
					$scope.erro = {texto: "Ocorreu um erro. Informe ao Administrator a seguinte mensagem: " + msg};
					console.log(msg);
				}
			);
	} else {
		$scope.endereco = new Endereco();
	}
	
	$scope.salvaEndereco = function() {
		if($scope.endereco.id) {
			$scope.endereco.$update()
			.then(function(retorno) {
				console.log("Sucesso!");
				$window.location.href = "#/cadastros/endereco"
			}, function(msg) {
				$scope.erro = {texto: "Ocorreu um erro. Informe ao Administrator a seguinte mensagem: " + msg.data};
				console.log(msg);
				return;
			});
		} else {
			$scope.endereco.$save()
			.then(function(retorno) {
				console.log("Sucesso!");
				$window.location.href = "#/cadastros/endereco"
			}, function(msg) {
				$scope.erro = {texto: "Ocorreu um erro. Informe ao Administrator a seguinte mensagem: " + msg.data};
				console.log(msg);
				return;
			});
		}
	}

	
});