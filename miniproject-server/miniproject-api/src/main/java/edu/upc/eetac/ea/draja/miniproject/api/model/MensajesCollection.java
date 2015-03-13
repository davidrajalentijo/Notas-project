package edu.upc.eetac.ea.draja.miniproject.api.model;

import java.util.HashMap;

public class MensajesCollection {

	private HashMap<Integer, Mensajes> mensajes;

	public MensajesCollection() {
		super();
		mensajes = new HashMap<Integer, Mensajes>();
	}

	public HashMap<Integer, Mensajes> getMensajes() {
		return mensajes;
	}

	public void setMensajes(HashMap<Integer, Mensajes> mensajes) {
		this.mensajes = mensajes;
	}
}
