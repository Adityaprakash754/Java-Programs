package com.rnsit.bank;

public class MyAccount {
	
	public static account getAccount(String bank) {
		if(bank.equals("Hdfc"))
			return new Hdfc();
		
		else
			return new Icici();
		
		}

}
