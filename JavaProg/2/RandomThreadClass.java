package com.rnsit.MulThread;

import java.util.*;
public class RandomThreadClass extends Thread {
	public void run() {
		
		Random rand;
		int i=0,m;
		do
		{
			rand= new Random();
			m=rand.nextInt(100);
			System.out.println(m+" ");
			i++;
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			SquareNumThread s =new SquareNumThread(m);
			s.start();
			
			CubeNumThread c =new CubeNumThread(m);
			c.start();
		}while(i<10);
	}
}
