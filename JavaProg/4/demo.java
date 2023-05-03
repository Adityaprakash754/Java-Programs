package com.rnsit.exception;
import java.util.*;
public class demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		do{
		System.out.println("Enter the values of a & b");
		a=sc.nextInt();
		b=sc.nextInt();
		
		try
		{
			c=a/b;
			System.out.println("The result is: "+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error");
			e.printStackTrace();
		}
		}while (b==0);
		
	}

}
