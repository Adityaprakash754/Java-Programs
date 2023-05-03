package com.rnsit.arr_list_loosecoup;
import java.util.*;

public class ArrayListDemo {

	
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<String>();
		AList obj = new AList();
		char ans;
		do{
			System.out.println("1:append 2:insert 3:search 4:findParticular 5:exit");
			Scanner sc = new Scanner(System.in);
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:
				obj.append(al);
				break;
			case 2:
				obj.insert(al);
				break;
			case 3:
				obj.search(al);
				break;
			case 4:
				obj.findParticular(al);
				break;
			default:
				System.exit(0);
				
			}
		}while(true);
		
	}

}