package com;

public class Transaction {

	
	Account acc;

	public Account getAcc() {
		return acc;
	}

	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	
	public void transact(){
		
		System.out.println("welcome "+acc.getAccHolder()+" your transaction is being processed");
	}
}
