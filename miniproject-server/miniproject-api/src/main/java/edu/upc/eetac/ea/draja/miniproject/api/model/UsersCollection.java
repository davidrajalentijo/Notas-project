package edu.upc.eetac.ea.draja.miniproject.api.model;

import java.util.HashMap;

public class UsersCollection {
	private HashMap<String, Users> users;

	public UsersCollection() {
		super();
		users = new HashMap<String, Users>();
	}

	public HashMap<String, Users> getUsers() {
		return users;
	}

	public void setUsers(HashMap<String, Users> users) {
		this.users = users;
	}

}
