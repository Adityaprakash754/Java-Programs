package com.rnsit.bank;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String bank;
		System.out.println("Enter Hdfc to open Hdfc account Icici for Icici ");
		bank=sc.next();
		account a1=MyAccount.getAccount(bank);
		a1.openAccount();
		a1.minBalance();
		a1.closeAccount();
		System.out.println("year : "+account.year);
	}

}
