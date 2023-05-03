package com.rnsit.deptstr;

public class store {
	private int codeNo[]=new int[100];
	private int[] price=new int[100];
	private int i=0;

	public void add(int x,int y) {
		codeNo[i]=x;
		price[i]=y;
		i++;
		
	}
	public void delete(int x)
	{
		int j;
		for(j=0;j<i;j++)
		{
			if(codeNo[j]==x)
			{
				price[j]=0;
				break;
			}
		}
	}
	public void display()
	{
		int j,val=0;
		for(j=0;j<i;j++)
			val+=price[j];
		
		System.out.println("Item List ");
		System.out.println("Code No"+"		"+"Price");
		for(j=0;j<i;j++)
		{
			if(price[j]!=0)
			{
				System.out.println(codeNo[j]+"		"+price[j]);
			}
		}
		System.out.println("Total value of order is: "+val);
	}
	
}
