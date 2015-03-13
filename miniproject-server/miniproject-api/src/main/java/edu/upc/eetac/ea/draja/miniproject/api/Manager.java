package edu.upc.eetac.ea.draja.miniproject.api;

import java.util.List;

import edu.upc.eetac.ea.draja.miniproject.api.model.Mensajes;
import edu.upc.eetac.ea.draja.miniproject.api.model.MensajesCollection;
import edu.upc.eetac.ea.draja.miniproject.api.model.Users;
import edu.upc.eetac.ea.draja.miniproject.api.model.UsersCollection;

public interface Manager {
public UsersCollection users = new UsersCollection();
	
	//parte usuarios
	public Users crearUsuario(Users user);
	
	public Users actualizarUsuario(String username, Users user);
	
	public UsersCollection getUsers();
	
	public void eliminarUsuario(String username);
	
	//parte mensajes
	public List <Users> UsuarioByMensajes();
	
	public Mensajes CrearMensaje(String username, Mensajes mensaje);
	
	public Mensajes actualizarMensaje(String username, int mensajeid, Mensajes mensaje);
	
	public MensajesCollection getMensajesByUsuario(String username);
	
	public void eliminarMensaje(String username, int mensajeid);
}
