package com.rnsit.deptstr;
import java.util.Scanner;
public class demo {

		public static void main(String[] args) {
			int op,codeNo,price;
			
		Scanner sc= new Scanner(System.in);
		store s=new store();
		while(true){
			System.out.println("Enter 1:to add 2:to delete 3:to display and exit");
			op=sc.nextInt();
			switch(op){
			case 1:
				System.out.println("Enter codeNo and price to add to list");
				codeNo=sc.nextInt();
				price=sc.nextInt();
				s.add(codeNo,price);
				break;
			case 2:
				System.out.println("Enter codeNo to delete from the list");
				codeNo=sc.nextInt();
				s.delete(codeNo);
				break;
			case 3:
				s.display();
				System.exit(0);
			default:
				System.exit(0);	
			}
			op=4;
		}

	}

}
