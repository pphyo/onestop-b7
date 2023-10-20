package com.jdc.app.main;

import java.time.LocalDate;

public class Message {

	private int id;
	private String message;
	private String owner;
	private LocalDate sendAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalDate getSendAt() {
		return sendAt;
	}

	public void setSendAt(LocalDate sendAt) {
		this.sendAt = sendAt;
	}

}
