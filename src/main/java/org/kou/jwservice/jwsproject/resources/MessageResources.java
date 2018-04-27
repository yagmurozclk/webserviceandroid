package org.kou.jwservice.jwsproject.resources;

import java.util.List;


import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.kou.jwservice.jwsproject.model.Ev;
import org.kou.jwservice.jwsproject.services.MessageService;

@Path("/messages")
public class MessageResources {
	
	MessageService messageService = new MessageService();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ev> getMessages(){
		return messageService.getAllMessages();
	}
	
}
