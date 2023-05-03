package com.rnsit.converter;
import java.util.Scanner;

public class curconverter {
	
	private double convert;
	private String srCurr;
	private int destCurr;

	Scanner sc= new Scanner(System.in);
	public void accept() {
		// TODO Auto-generated constructor stub		
		System.out.println("Enter the srCurr ");
		srCurr=sc.next();
		System.out.println("Enter the amt ");
		convert=sc.nextDouble();
		
	}
	public void convert(){
		if(srCurr.equals("inr"))
		{
			System.out.println("Enter the destCurr 1:dollar 2:euro 3:yen ");
			destCurr= sc.nextInt();
			
			switch(destCurr){
			case 1:
				System.out.println("Inr to dollar is "+convert/82.76);
				break;
			case 2:
				System.out.println("Inr to euro is "+convert/87.16);
				break;
			case 3:
				System.out.println("Inr to yen is "+1.67*convert);
				break;
			default :
				System.out.println("Invalid input ");
				break;
			}
		}
			else if(srCurr.equals("dollar"))
			{
				System.out.println("Dollar to Inr is "+82.76*convert);
			}
			else if(srCurr.equals("euro"))
			{
				System.out.println("Euro to Inr is "+87.16*convert);
			}
			else if(srCurr.equals("yen"))
			{
				System.out.println("Yen to Inr is "+0.6*convert);
			}
		
		
	}

}
