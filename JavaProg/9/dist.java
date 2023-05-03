package com.rnsit.converter;
import java.util.Scanner;

public class dist {

		private double convert;
		private String src;
		
		Scanner sc= new Scanner(System.in);
	public void accept() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter the src ");
		src=sc.next();
		System.out.println("Enter the distance ");
		convert=sc.nextDouble();
	}
	
	public void convert(){
		if(src.equals("m"))
		{
			System.out.println("Conveted distance is "+convert/1000+" km");
			System.out.println("Conveted distance is "+convert/1609+" km");
		}
		else if(src.equals("miles") )
		{
			System.out.println("Conveted distance is "+1.609*convert+" km");
			System.out.println("Conveted distance is "+1609*convert+" m");
		}
		else if(src.equals("km"))
		{
			System.out.println("Conveted distance is "+convert/1.609+" miles");
			System.out.println("Conveted distance is "+1000*convert+" m");
		}
		
	}

}
