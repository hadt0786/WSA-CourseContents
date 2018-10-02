package com;

import java.io.Serializable;

public class Employee  implements Serializable{

	private int id;
	private String name;
	private String co_name;
	private String type;
	
	//defining constructor... 
	
	public Employee(){}

	//defining getter and setter method...

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


	public String getCo_name() {
		return co_name;
	}


	public void setCo_name(String co_name) {
		this.co_name = co_name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
