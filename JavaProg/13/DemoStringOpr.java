package com.rnsit.str_arr;

public class DemoStringOpr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java Developer";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		System.out.println(str.startsWith("Java"));
		System.out.println(str.endsWith("per"));
		System.out.println(str.indexOf('e'));
		// to find the index of e after index pos 7
		System.out.println(str.indexOf('e',7));
		System.out.println(str.lastIndexOf('e'));
		System.out.println(str.substring(5));
		System.out.println(str.substring(1,5));
	
	}

}
