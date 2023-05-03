package com.rnsit.singleton;

public class SingleTon {
	static SingleTon sref = null;
	static int count=0,i=0;
	private int a,b;
	private SingleTon (int a,int b) {
		this.a=a;
		this.b=b;
		i++;
		System.out.println("Running the constructor");
	}
	public static SingleTon myMethod(int x,int y)
	{
		count++;
		if(count<=4)
		{
			sref=new SingleTon(x,y);
			return sref;
		}
		else
		{
			System.out.println("From 5th inistance onwards");
			return sref;
		}
	}
	public void display()
	{
		System.out.println("object is "+i);
		System.out.println("a and b are "+a+" "+b);
	}
}
