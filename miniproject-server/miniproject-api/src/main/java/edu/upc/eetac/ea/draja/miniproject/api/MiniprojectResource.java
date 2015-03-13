package edu.upc.eetac.ea.draja.miniproject.api;

import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import edu.upc.eetac.ea.draja.miniproject.api.model.Mensajes;
import edu.upc.eetac.ea.draja.miniproject.api.model.MensajesCollection;
import edu.upc.eetac.ea.draja.miniproject.api.model.Users;

@Path("/mensajes")
public class MiniprojectResource {
	Manager man = new ManagerImpl();


//metodo para crear un mensaje
	@POST
	@Path("/{username}")
	@Consumes(MediaType.MINIPROJECT_API_MENSAJES)
	@Produces(MediaType.MINIPROJECT_API_MENSAJES)
	public Mensajes CrearMensaje(@PathParam("username") String username, Mensajes mensaje) {
		man.CrearMensaje(username, mensaje);

		return mensaje;
	}
//metodo para actualizar un mensaje
	@PUT
	@Path("/{username}/{mensajeid}")
	@Consumes(MediaType.MINIPROJECT_API_MENSAJES)
	@Produces(MediaType.MINIPROJECT_API_MENSAJES)
	public Mensajes actualizarMensaje(@PathParam("username") String username, @PathParam("mensajeid") int mensajeid,Mensajes message) {
		Mensajes m = man.actualizarMensaje(username, mensajeid, message);

		return m;
	}
//metodo para listar los mensajes de un usuario
	@GET
	@Path("/{username}")
	@Produces(MediaType.MINIPROJECT_API_MENSAJES_COLLECTION)
	public MensajesCollection getMensajes(@PathParam("username") String username) {
		MensajesCollection mensajes = man.getMensajesByUsuario(username);

		return mensajes;
	}
//metodo para borrar un usuario
	@DELETE
	@Path("/{username}/{mensajeid}")
	public void eliminarMensaje(@PathParam("username") String username, @PathParam("mensajeid") int mensajeid) {
		man.eliminarMensaje(username, mensajeid);
	}


}
