package com.rnsit.arr_List;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		
		al.add("Hello");
		al.add(new Integer(10));
		al.add(20);
		al.add(21.64);
		System.out.println("size of the list "+al.size());
		System.out.println(al.get(0));
 		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		
		for(Object l:al)
			System.out.println(l);
	}

}
