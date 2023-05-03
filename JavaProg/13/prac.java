package com.rnsit.str_arr;

public class prac {

	
	public static void main(String[] args) {
		
		char a[]={'a','s','w','i','w','s','c'};
		int i,j,min=100,m=0;
		int b[]={0,0,0,0,0,0,0};
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<7;j++)
			{
				if(a[i]==a[j])
					break;
			}
			if(j!=7)
				break;
		}
		System.out.println(a[i]);
		
		
		for(i=0;i<6;i++)
		{
			for(j=i+1;j<7;j++)
			{
				if(a[i]==a[j])
					b[i]=j-i;
			}
			
		}
		for(i=0;i<7;i++)
		{
			if(b[i]!=0 && b[i]<min){
				min=b[i];
				m=i;
			}
		}
		System.out.println(a[m]);
	}

}
