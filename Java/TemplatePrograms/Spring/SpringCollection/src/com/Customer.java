package com;

public class Customer {
	
	String name;
	int age;
	String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	// overriding toString() of Object class
	
	public String toString(){
		
		return "\n[Customer Name:" +name +" Age:" +age +"Address:" +address+"]";
		
	}

}
