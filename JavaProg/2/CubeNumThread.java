package com.rnsit.MulThread;

public class CubeNumThread extends Thread {
	int n;
	public CubeNumThread(int n)
	{
		this.n=n;
	}
	public void run() {
		System.out.println("cube of "+this.n+" is: "+Math.pow(this.n, 3));
	}
}
