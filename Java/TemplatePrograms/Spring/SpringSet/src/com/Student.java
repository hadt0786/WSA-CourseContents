package com;

public class Student {
	
	int id;
	String name;
	String address;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	// override the toString() method of Object class
	
	public String toString(){
		
		
		return "\n[Student Id:"+id+" Name: "+ name +" Address:" +address+"]";
		
	}

}
