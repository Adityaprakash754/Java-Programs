// Write a program to create employee object ,arrayList class , make use of generics and for printing objets use iterator 


import java.util.*;
class Employee
{
   int id;
   String name;
 
    public Employee(int x,String y)
    {
        id=x;
        name=y;
    }
}
class ArrayListDemo
{
    
    public ArrayList <Employee> getList()
    {
        Employee e1=new Employee (10,"aditya");
        Employee e2=new Employee (20,"prakash");
        
        ArrayList <Employee> al=new ArrayList <Employee>();
        al.add(e1);
        al.add(e2);
        return al;
    }
    public void display(ArrayList <Employee> al)
    {
        Iterator <Employee> it = al.iterator();
       
        while(it.hasNext()==true)
        {
            Employee cur;
            cur=it.next();
            System.out.println(cur.id);
            System.out.println(cur.name);
            
        }
    }
}
class Main
{
	public static void main(String[] args) {
	    ArrayListDemo data = new ArrayListDemo();
	    ArrayList <Employee> al= data.getList(); 
	    data.display(al); 
		
	}
}

