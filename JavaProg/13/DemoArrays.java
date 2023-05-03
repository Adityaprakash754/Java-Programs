package com.rnsit.str_arr;

public class DemoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int [4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		String arr1[]= new String [4];
		arr1[0]="aditya";
		arr1[1]="abhiram";
		arr1[2]="akash";
		arr1[3]="avinash";
		
		System.out.println(arr.length);
		for(int i: arr)
			System.out.println(i);
		
		System.out.println(arr1.length);
		for(Object i: arr1)
			System.out.println(i);


	}

}
