package edu.upc.eetac.ea.draja.miniproject.api.model;

public class Mensajes {
	private int mensajeid;
	public int getMensajeid() {
		return mensajeid;
	}
	public void setMensajeid(int mensajeid) {
		this.mensajeid = mensajeid;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	private String contenido;
}
