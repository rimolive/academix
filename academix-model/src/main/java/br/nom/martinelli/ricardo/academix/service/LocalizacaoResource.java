package br.nom.martinelli.ricardo.academix.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.nom.martinelli.ricardo.academix.model.Localizacao;
import br.nom.martinelli.ricardo.academix.repository.CampusRepository;
import br.nom.martinelli.ricardo.academix.repository.LocalizacaoRepository;

@Path("localizacao")
@Stateless
public class LocalizacaoResource {

	@Inject
	LocalizacaoRepository repositorio;
	
	@Inject
	CampusRepository campus;

	@GET
	@Path("")
	@Produces("application/json")
	public List<Localizacao> getLocalizacoes() {
		return repositorio.listarTodos();
	}
	
	@POST
	@Path("")
	@Consumes("application/json")
	public void adicionaLocalizacao(Localizacao localizacao) {
		if(repositorio.validaDados(localizacao)) {
			localizacao.setCampus(campus.comChave(localizacao.getCampus().getId()));
			repositorio.adiciona(localizacao);
		}
	}
	
	@PUT
	@Path("")
	@Consumes("application/json")
	public void alteraLocalizacao(Localizacao localizacao) {
		if(repositorio.validaDados(localizacao)) {
			localizacao.setCampus(campus.comChave(localizacao.getCampus().getId()));
			repositorio.altera(localizacao);
		}
	}

	@GET
	@Path("{id}")
	@Produces("application/json")
	public Localizacao getLocalizacao(@PathParam("id") Long id) {
		return repositorio.comChave(id);
	}

	@DELETE
	@Path("{id}")
	public void removeLocalizacao(@PathParam("id") Long id) {
		repositorio.remove(repositorio.comChave(id));
	}

}