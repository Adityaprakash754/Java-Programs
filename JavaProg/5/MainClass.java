package com.rnsit.ExMultiTh;


public class MainClass {

	public static void main(String [] args)
	{
		MyThread t =new MyThread();
		t.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
