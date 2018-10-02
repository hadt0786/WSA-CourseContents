package com;

public class Transaction {

	private Account acc;
	
	
	public Account getAcc() {
		return acc;
	}


	public void setAcc(Account acc) {
		this.acc = acc;
	}
	
	public void transact(){
		
		System.out.println("hello "+acc.getAccHolder()+" your transaction is processed");
	}
	
}
