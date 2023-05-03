package com.rnsit.quadratic;

public class demo {
	private int a,b,c;
	public demo(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}

	public void calc(){
		
		double d;
		d=Math.sqrt(Math.pow((double)b, 2)-4*(double)a*(double)c);
		if(d==0){
			double r1=-b/(2.0*a);
      	  System.out.println("the root is"+r1);
		}
		else if(d>0){
			double r1=(-b+d)/(2.0*a);
			double r2=(-b-d)/(2.0*a);
      	  System.out.println("the root1 is"+r1);
      	  System.out.println("the root2 is"+r2);
		}
		else {
			double r1=(-b)/(2.0*a);
			double r2=Math.sqrt((-1)*(Math.pow((double)b, 2)-4*(double)a*(double)c))/(2.0*a);
      	  System.out.println("the root1 is"+r1+"+i"+r2);
      	  System.out.println("the root2 is"+r1+"-i"+r2);
		}
			
	}
	

}
