package edu.upc.eetac.ea.draja.miniproject.api;

public interface MediaType {
	public final static String MINIPROJECT_API_ERROR = "application/vnd.ea.miniproject.error+json";
	//public final static String MINIPROJECT_API_USER="application/vnd.miniproject.user+json";
	public final static String MINIPROJECT_API_USER = "application/vnd.comments.api.user+json";
	public final static String MINIPROJECT_API_USER_COLLECTION = "application/vnd.comments.api.user.collection+json";
	public final static String MINIPROJECT_API_MENSAJES= "application/vnd.comments.api.comment+json";
	public final static String MINIPROJECT_API_MENSAJES_COLLECTION = "application/vnd.comments.api.comment.collection+json";
}
