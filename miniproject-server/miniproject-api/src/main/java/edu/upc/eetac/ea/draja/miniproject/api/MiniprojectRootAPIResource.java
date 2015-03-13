package edu.upc.eetac.ea.draja.miniproject.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import edu.upc.eetac.ea.draja.miniproject.api.model.MiniprojectRootAPI;


@Path("/")
public class MiniprojectRootAPIResource{
	@GET
	public MiniprojectRootAPI getRootAPI() {
		MiniprojectRootAPI api = new MiniprojectRootAPI();
		return api;
	}
}