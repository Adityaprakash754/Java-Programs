import java.util.*;
import java.io.*;

class Employee implements Comparable <Employee>
{
    int Eid;
    String En;
    
    Scanner sc=new Scanner(System.in);
    public Employee()
    {
        System.out.println("Enter Employee's id and name");
        Eid=sc.nextInt();
        En=sc.next();
    }
    public int compareTo(Employee ob1)
    {
        return ((Integer)this.Eid).compareTo(ob1.Eid);
    }
    
    public String toString ()
    {
        return "ID: "+Eid+" Name: "+En;
    }
}

class PriorityQueueDemo
{
    public Queue <Employee> getList()
    {
        Queue  queue= new PriorityQueue ();
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of employees: ");
        n=sc.nextInt();
        Employee e1[] = new Employee [n];
        
        for(i=0;i<n;i++)
        {
            e1[i]=new Employee();
            queue.add(e1[i]);
        }
        
        return queue;
    }
}

class Demo {
    public static void main(String[] args) {
        PriorityQueueDemo obj= new PriorityQueueDemo();
        Queue queue= obj.getList();
        int s=queue.size();
       for(int i=0;i<s;i++)
       System.out.println(queue.poll());
        
    }
}