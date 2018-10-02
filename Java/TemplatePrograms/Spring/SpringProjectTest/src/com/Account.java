package com;

public class Account {
	
	int accNo;
	String accHolder;
	
	
	
	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public String getAccHolder() {
		return accHolder;
	}



	public void setAccHolder(String accHolder) {
		this.accHolder = accHolder;
	}



	public void withdraw(){
		
		
		System.out.println("welcome "+getAccHolder()+" your account no is "+accNo);
	}

}
