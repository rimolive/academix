package br.nom.martinelli.ricardo.academix;

import static org.junit.Assert.*;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.nom.martinelli.ricardo.model.Campus;
import br.nom.martinelli.ricardo.rest.RestApplication;
import br.nom.martinelli.ricardo.service.CampusResource;

@RunWith(Arquillian.class)
public class CampusTest {

	@Deployment
	public static Archive<?> createDeployment() {
		WebArchive archive = ShrinkWrap.create(WebArchive.class)
				.addClasses(RestApplication.class, CampusResource.class, Campus.class)
				.addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml");
		// System.out.println(archive.toString(true));
		return archive;
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}