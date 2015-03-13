package edu.upc.eetac.ea.draja.miniproject.api.model;

public class Users {
	private int userid;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public MensajesCollection getMensajes() {
		return mensajes;
	}
	public void setMensajes(MensajesCollection mensajes) {
		this.mensajes = mensajes;
	}
	private String username;
	private String password;
	private MensajesCollection mensajes;
	public Users() {
		super();
		mensajes = new MensajesCollection();
	}

}
