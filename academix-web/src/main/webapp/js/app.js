angular.module('academix', ['ngRoute'])
	.config(function($routeProvider) {
		
		// Secretaria
		
		// Aluno
		
		// Professor
		
		// Relatorios
		
		// Cadastros
		$routeProvider.when('/cadastros/endereco', {
			templateUrl: 'partials/cadastros/endereco.html',
			controller: 'EnderecoListController',
		})
		.when('/cadastros/endereco/create', {
			templateUrl: 'partials/cadastros/enderecoForm.html',
			controller: 'EnderecoController',
		})
		.when('/cadastros/endereco/:id', {
			templateUrl: 'partials/cadastros/enderecoForm.html',
			controller: 'EnderecoController',
		})
		.when('/cadastros/campus', {
			templateUrl: 'partials/cadastros/campus.html',
			controller: 'CampusListController',
		})
		.when('/cadastros/campus/create', {
			templateUrl: 'partials/cadastros/campusForm.html',
			controller: 'CampusListController',
		})
		.when('/cadastros/curso', {
			templateUrl: 'partials/cadastros/curso.html',
			controller: 'CursoListController',
		})
		.when('/cadastros/curso/create', {
			templateUrl: 'partials/cadastros/cursoForm.html',
			controller: 'CursoListController',
		})
		.when('/cadastros/gradeCurricular', {
			templateUrl: 'partials/cadastros/gradeCurricular.html',
			controller: 'GradeCurricularListController',
		})
		.when('/cadastros/gradeCurricular/create', {
			templateUrl: 'partials/cadastros/gradeCurricularForm.html',
			controller: 'GradeCurricularListController',
		})
		.when('/cadastros/disciplina', {
			templateUrl: 'partials/cadastros/disciplina.html',
			controller: 'DisciplinaListController',
		})
		.when('/cadastros/disciplina/create', {
			templateUrl: 'partials/cadastros/disciplinaForm.html',
			controller: 'DisciplinaListController',
		})
		.when('/cadastros/turma', {
			templateUrl: 'partials/cadastros/turma.html',
			controller: 'TurmaListController',
		})
		.when('/cadastros/aluno', {
			templateUrl: 'partials/cadastros/aluno.html',
			controller: 'AlunoListController',
		})
		.when('/cadastros/professor', {
			templateUrl: 'partials/cadastros/professor.html',
			controller: 'ProfessorListController',
		})
		.when('/cadastros/localizacao', {
			templateUrl: 'partials/cadastros/localizacao.html',
			controller: 'LocalizacaoListController',
		});
		
});
