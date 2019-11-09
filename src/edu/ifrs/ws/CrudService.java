package edu.ifrs.ws;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import edu.ifrs.model.Client;

@Path("/v1")
@Stateless
public class CrudService implements CrudServiceInterface {

	@PersistenceContext(unitName = "Crud")
	private EntityManager em;

	@GET
	@Path("/create/{name}/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public Client create(String name, String email) {

		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		em.persist(client);
		return client;
	}

	@GET
	@Path("/read")
	@Produces(MediaType.APPLICATION_JSON)
	@Override
	public List<Client> read() {
		System.out.println("Hello");
		return null;
	}

	@Override
	public Client update(long id) {
		return null;
	}

	@Override
	public Client delete(long id) {
		return null;
	}

}
