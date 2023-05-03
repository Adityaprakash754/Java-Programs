package com.rnsit.converter;
import java.util.Scanner;

public class time {

	private double convert;
	private String src;
	
	Scanner sc= new Scanner(System.in);
	public void accept() {
		// TODO Auto-generated constructor stub
		System.out.println("Enter the src ");
		src=sc.next();
		System.out.println("Enter the time ");
		convert=sc.nextDouble();
	}

	
	public void convert(){
		if(src.equals("hours"))
		{
			System.out.println("Conveted time is "+convert*60+" min");
			System.out.println("Conveted time is "+convert*3600+" sec");
		}
		else if(src.equals("sec") )
		{
			System.out.println("Conveted time is "+convert/60+" min");
			System.out.println("Conveted time is "+convert/3600+" hours");
		}
		else if(src.equals("min"))
		{
			System.out.println("Conveted time is "+convert/60+" hours");
			System.out.println("Conveted time is "+60*convert+" sec");
		}
		
	}
}
