package com.rnsit.singleton;

public class demo {

	
	public static void main(String[] args) {
		SingleTon sref1=SingleTon.myMethod(1,2);
		sref1.display();
		SingleTon sref2=SingleTon.myMethod(2,3);
		sref2.display();
		SingleTon sref3=SingleTon.myMethod(3,4);
		sref3.display();
		SingleTon sref4=SingleTon.myMethod(4,5);
		sref4.display();
		SingleTon sref5=SingleTon.myMethod(5,6);
		sref5.display();
		SingleTon sref6=SingleTon.myMethod(6,7);
		sref6.display();
		
	}

}
