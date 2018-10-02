package com.emertxe;

import java.io.Serializable;

/*
 * @author : vikash 
 * This class is pojo class
 * purpose: to implement ORDER by and Group By example
 * */
public class UserDetails implements Serializable{

	
	// Vaariable declaration
	
	private int id;
	private String name;
	
	// constructor definition
	
	public UserDetails(){}

	//defining getter and setter method
	
	
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

	
	
	
}
