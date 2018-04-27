package org.kou.jwservice.jwsproject.services;

import java.util.List;

import org.kou.jwservice.jwsproject.SQLiteOperation;
import org.kou.jwservice.jwsproject.model.Ev;

public class MessageService {

	
	public List<Ev> getAllMessages(){
		
		
		SQLiteOperation sql = new SQLiteOperation();
		
		
		return sql.selectAll();
		
	}
	
}
