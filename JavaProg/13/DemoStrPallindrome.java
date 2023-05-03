package com.rnsit.str_arr;

public class DemoStrPallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="ABBA";
		String str2="";
		for(int i=str1.length()-1;i>=0;i--)
			str2+=str1.charAt(i);
		
		System.out.println("Original String " +str1);
		System.out.println("Reverse String " +str2);
		if(str1.equals(str2))
			System.out.println("Pallindrome");
		else 
			System.out.println("Not Pallindrome");
	}

}
