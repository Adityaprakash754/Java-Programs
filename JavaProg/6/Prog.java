//implement String operations on arrayList
import java.util.*;
class AList {
	Scanner sc=new Scanner(System.in);
	String str;
	public void append(ArrayList al)
	{
		System.out.println("Enter String");
		str=sc.next();
		al.add(str);
		System.out.println("The array elements are: "+al);
	}
	public void insert(ArrayList al)
	{
		System.out.println("Enter String");
		str=sc.next();
		
		try{
			System.out.println("Enter index to insert at ");
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
		int pos=0;
		
		for(Object i: al)
		{
		    pos++;
			if(i.equals(searchStr))
			{
				found =true;
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
		System.out.println("Enter starting letter");
		char searchChar = sc.next().charAt(0);
		
		System.out.println("The string starting with "+searchChar+" are");
		for(Object i: al)
		{
			if(((String)i).charAt(0)==searchChar)
			{
				System.out.println(i);
			}
		}
	}

}
class Demo {
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

