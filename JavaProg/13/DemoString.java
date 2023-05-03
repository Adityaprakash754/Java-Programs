package com.rnsit.str_arr;

public class DemoString {

	public static void main(String[] args) {
		String str1=new String("watermelon");
		String str2="watermelon";
		String str3="water";
		String str4="melon";
		String str5="water" + "melon";
		String str6=str3+"melon";
		
		System.out.println(str1==str2);
		System.out.println(str2==str5);
		System.out.println(str1==str6);

	}

}
