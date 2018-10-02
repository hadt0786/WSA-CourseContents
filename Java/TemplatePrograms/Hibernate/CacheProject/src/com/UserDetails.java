package com;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Entity annotation marks this class as an entity.
@Table(name="UserDetails")
//@Table annotation specifies the table name where data of this entity is to be
//persisted.

public class UserDetails implements Serializable{
	
	@Id
	//@Id annotation marks the identifier for this entity.
	private int id;
	
	private String name;
	
	public UserDetails(){}

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
