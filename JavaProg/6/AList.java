package com.rnsit.arr_list_loosecoup;
import java.util.*;
public class AList {
	Scanner sc=new Scanner(System.in);
	String str;
	public void append(ArrayList al)
	{
		char ans;
		do{
			System.out.println("Enter String");
			str=sc.next();
			al.add(str);
			System.out.println("Do you want to append more?");
			ans=sc.next().charAt(0);
		}while(ans=='y');
		System.out.println("The array elements are: "+al);
	}
	public void insert(ArrayList al)
	{
		System.out.println("Enter String");
		str=sc.next();
		
		try{
			System.out.println("Enter index to insert");
			int index= sc.nextInt();
			al.add(index,str);
			System.out.println("The array elem are "+al);	
		}
		catch(Exception e){
			System.out.println("Invalid Index");
		}
	}
	
	
	public void search(ArrayList al)
	{
		String searchStr;
		System.out.println("Enter String for search");
		searchStr=sc.next();
		boolean found =false;
		Iterator <String> it=al.iterator();
		String curitem=" ";
		int pos=0;
		
		while(it.hasNext()==true)
		{
			pos=pos+1;
			curitem=(String)it.next();
			if(curitem.equals(searchStr))
			{
				found=true;
				break;
			}
		}
		if(found)
			System.out.println("found at position "+pos);
		else
			System.out.println("not found");
	}
	public  void findParticular(ArrayList al)
	{
		String [] str_list= new String[al.size()];
		str_list=(String[])al.toArray(str_list);
		System.out.println("Enter starting letter");
		String searchChar = sc.next();
		
		System.out.println("The string starting with "+searchChar+" are");
		for(int i=0;i<str_list.length;i++)
		{
			if(str_list[i].startsWith(searchChar))
			{
				System.out.println(str_list[i]);
			}
		}
	}

}
