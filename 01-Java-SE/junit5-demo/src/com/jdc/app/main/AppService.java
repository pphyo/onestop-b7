package com.jdc.app.main;

import java.util.Arrays;

public class AppService {

	private Message[] database = new Message[0];
	
	public void create(Message message) {
		
		Message[] temp = Arrays.copyOf(database, database.length + 1);
		
		temp[temp.length - 1] = message;
		
		database = temp;
		
	}
	
	public Message findById(int id) {
		
		for(Message message : database) {
			if(message.getId() == id) {
				return message;
			}
		}
		
		return null;
	}
	
	public long size() {
		return database.length;
	}
	
	public Message[] getAll() {
		return database;
	}

}