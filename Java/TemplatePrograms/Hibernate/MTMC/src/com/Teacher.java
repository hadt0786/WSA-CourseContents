package com;

import java.io.Serializable;

public class Teacher implements Serializable{

	private int id;
	private String name;
	private String subject;
	
	
	public Teacher(){}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
}
