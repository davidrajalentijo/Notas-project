package edu.upc.eetac.ea.draja.miniproject.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response.Status;

import edu.upc.eetac.ea.draja.miniproject.api.model.Mensajes;
import edu.upc.eetac.ea.draja.miniproject.api.model.MensajesCollection;
import edu.upc.eetac.ea.draja.miniproject.api.model.Users;
import edu.upc.eetac.ea.draja.miniproject.api.model.UsersCollection;

public class ManagerImpl implements Manager{
	private static ManagerImpl instance = null;

	public ManagerImpl() {
		super();
	}

	public static ManagerImpl getInstance() {
		return instance;
	}
	public Users crearUsuario(Users user) {
		if (users.getUsers().containsKey(user.getUsername())) {
			throw new WebApplicationException("El usuario ya existe",
					Status.CONFLICT);
		} else {
			users.getUsers().put(user.getUsername(), user);
		}

		return user;
	}

	@Override
	public Users actualizarUsuario(String username, Users user) {
		if (!users.getUsers().containsKey(username)) {
			throw new WebApplicationException("El usuario no existe",
					Status.CONFLICT);
		}

		users.getUsers().remove(username);
		users.getUsers().put(username, user);

		return users.getUsers().get(username);
	}

	@Override
	public void eliminarUsuario(String username) {
		if (!users.getUsers().containsKey(username)) {
			throw new WebApplicationException("El usuario no existe",
					Status.CONFLICT);
		} else {
			users.getUsers().remove(username);
		}
	}

	@Override
	public UsersCollection getUsers() {
		return users;
	}

	@Override
	public List<Users> UsuarioByMensajes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mensajes CrearMensaje(String username, Mensajes m) {
		if (!users.getUsers().containsKey(username)) {
			throw new WebApplicationException("El usuario no existe",
					Status.CONFLICT);
		} else {
			users.getUsers().get(username).getMensajes().getMensajes()
					.put(m.getMensajeid(), m);
		}

		return m;
	}

	@Override
	public Mensajes  actualizarMensaje(String username, int mensajeid, Mensajes mensaje) {
		if (!users.getUsers().get(username).getMensajes().getMensajes()
				.containsKey(mensaje.getMensajeid())) {
			throw new WebApplicationException("Este comentario no existe",
					Status.CONFLICT);
		}

		users.getUsers().get(username).getMensajes().getMensajes()
				.remove(username);
		users.getUsers().get(username).getMensajes().getMensajes()
				.put(mensaje.getMensajeid(), mensaje);

		return users.getUsers().get(username).getMensajes().getMensajes()
				.get(mensaje.getMensajeid());
	}

	@Override
	public MensajesCollection getMensajesByUsuario(String username) {
		return users.getUsers().get(username).getMensajes();
	}

	@Override
	public void eliminarMensaje(String username, int mensajeid) {
		if (!users.getUsers().containsKey(username)) {
			throw new WebApplicationException("Este usuario no existe",
					Status.CONFLICT);
		} else if (!users.getUsers().get(username).getMensajes().getMensajes()
				.containsKey(mensajeid)) {
			throw new WebApplicationException(
					"Este usuario no tiene este comentario", Status.CONFLICT);
		} else {
			users.getUsers().get(username).getMensajes().getMensajes()
					.remove(mensajeid);
		}
	}
	
}
