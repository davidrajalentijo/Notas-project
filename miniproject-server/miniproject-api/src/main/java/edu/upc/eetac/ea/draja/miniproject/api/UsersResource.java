package edu.upc.eetac.ea.draja.miniproject.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import edu.upc.eetac.ea.draja.miniproject.api.model.Users;
import edu.upc.eetac.ea.draja.miniproject.api.model.UsersCollection;

@Path("/users")
public class UsersResource {
	
	Manager man = new ManagerImpl();
//metodo para crear un usuario
	@POST
	@Consumes(MediaType.MINIPROJECT_API_USER)
	@Produces(MediaType.MINIPROJECT_API_USER)
	public Users crearUsuario(Users user) {
		man.crearUsuario(user);

		return user;
	}
//metodo para actualizar un usuario
	@PUT
	@Path("/{username}")
	@Consumes(MediaType.MINIPROJECT_API_USER)
	@Produces(MediaType.MINIPROJECT_API_USER)
	public Users actualizarUsuario(@PathParam("username") String username, Users user) {
		Users u = man.actualizarUsuario(username, user);

		return u;
	}
	//metodo para listar los usuarios

	@GET
	@Produces(MediaType.MINIPROJECT_API_USER_COLLECTION)
	public UsersCollection getUsers() {
		UsersCollection users = man.getUsers();

		return users;
	}
//metodo para eliminar un usuario
	@DELETE
	@Path("/{username}")
	public void eliminarUsuario(@PathParam("username") String username) {
		man.eliminarUsuario(username);
	}

}
