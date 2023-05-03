package com.rnsit.converter;
import java.util.Scanner;
public class tester {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		curconverter c = new curconverter();
		dist d = new dist();
		time t = new time();
		Scanner sc= new Scanner(System.in);
		int i;
		
		System.out.println("Enter 1: to convert currency 2: to convert dist 3: to convert time ");
		i= sc.nextInt();
		
		if(i==1)
		{
			
			c.accept();
			c.convert();
		}
		else if(i==2)
		{
			
			d.accept();
			d.convert();
		}
		else if(i==3)
		{
			
			t.accept();
			t.convert();
		}
		
	}	

}
