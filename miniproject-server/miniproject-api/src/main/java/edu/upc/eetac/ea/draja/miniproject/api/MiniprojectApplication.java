package edu.upc.eetac.ea.draja.miniproject.api;


import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class MiniprojectApplication extends ResourceConfig{
	
	public MiniprojectApplication() {
		super();
		register(DeclarativeLinkingFeature.class); //registra modulos, registra que quiere utilizar jersey
	}
}