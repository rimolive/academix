angular.module('academix', ['ngRoute','academix.services', 'ui.bootstrap'])
	.config(function($routeProvider) {
		
		$routeProvider
		
		// Secretaria
		.when('/cadastros/gradeCurricular', {
			templateUrl: 'partials/secretaria/gradeCurricular.html',
			controller: 'GradeCurricularListController',
		})
		.when('/cadastros/gradeCurricular/create', {
			templateUrl: 'partials/secretaria/gradeCurricularForm.html',
			controller: 'GradeCurricularController',
		})
		
		// Aluno
		
		// Professor
		
		// Relatorios
		
		// Cadastros
		.when('/cadastros/endereco', {
			templateUrl: 'partials/cadastros/endereco.html',
			controller: 'EnderecoListController',
		})
		.when('/cadastros/endereco/create', {
			templateUrl: 'partials/cadastros/enderecoForm.html',
			controller: 'EnderecoController',
		})
		.when('/cadastros/endereco/:enderecoId', {
			templateUrl: 'partials/cadastros/enderecoForm.html',
			controller: 'EnderecoController',
		})
		
		
		.when('/cadastros/campus', {
			templateUrl: 'partials/cadastros/campus.html',
			controller: 'CampusListController',
		})
		.when('/cadastros/campus/create', {
			templateUrl: 'partials/cadastros/campusForm.html',
			controller: 'CampusController',
		})
		.when('/cadastros/campus/:campusId', {
			templateUrl: 'partials/cadastros/campusForm.html',
			controller: 'CampusController',
		})
		
		
		.when('/cadastros/curso', {
			templateUrl: 'partials/cadastros/curso.html',
			controller: 'CursoListController',
		})
		.when('/cadastros/curso/create', {
			templateUrl: 'partials/cadastros/cursoForm.html',
			controller: 'CursoController',
		})
		.when('/cadastros/curso/:cursoId', {
			templateUrl: 'partials/cadastros/cursoForm.html',
			controller: 'CursoController',
		})
		
		
		.when('/cadastros/disciplina', {
			templateUrl: 'partials/cadastros/disciplina.html',
			controller: 'DisciplinaListController',
		})
		.when('/cadastros/disciplina/create', {
			templateUrl: 'partials/cadastros/disciplinaForm.html',
			controller: 'DisciplinaController',
		})
		.when('/cadastros/disciplina/:disciplinaId', {
			templateUrl: 'partials/cadastros/disciplinaForm.html',
			controller: 'DisciplinaController',
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
		.when('/cadastros/professor/create', {
			templateUrl: 'partials/cadastros/professorForm.html',
			controller: 'ProfessorController',
		})
		.when('/cadastros/professor/:professorId', {
			templateUrl: 'partials/cadastros/professorForm.html',
			controller: 'ProfessorController',
		})
		
		
		.when('/cadastros/localizacao', {
			templateUrl: 'partials/cadastros/localizacao.html',
			controller: 'LocalizacaoListController',
		})
		.when('/cadastros/localizacao/create', {
			templateUrl: 'partials/cadastros/localizacaoForm.html',
			controller: 'LocalizacaoController',
		})
		.when('/cadastros/localizacao/:localizacaoId', {
			templateUrl: 'partials/cadastros/localizacaoForm.html',
			controller: 'LocalizacaoController',
		});
		
});