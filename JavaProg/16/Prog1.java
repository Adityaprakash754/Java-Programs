//Using java collections implement comparator and comparable interface to sort an arrayList of type Laptop 
import java.util.*;
import java.io.*;
class Laptop implements Comparable <Laptop>
{
    String brand;
    int ram,cost;
    
    Scanner sc=new Scanner(System.in);
    public Laptop()
    {
        System.out.println("Enter brand,ram,cost");
        brand=sc.next();
        ram=sc.nextInt();
        cost=sc.nextInt();
    }
    
    public int compareTo(Laptop ob1)
    {
        return ((Integer)this.ram).compareTo(ob1.ram); 
    }
    
    public String toString()
    {
        return ("Brand:"+brand+" "+"Ram:"+ram+" "+"Cost:"+cost);
    }
     
}

class CostCmp implements Comparator<Laptop>
{
    public int compare (Laptop ob1,Laptop ob2)
    {
        if(ob1.cost>ob2.cost)
        return 1;
        else if(ob1.cost==ob2.cost)
        return 0;
        else
        return -1;
    }
}

class Demo {
    public static void main(String[] args) {
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of laptops");
        n=sc.nextInt();
        Laptop l1[]=new Laptop[n];
        ArrayList <Laptop> al= new ArrayList <Laptop>();
        for(i=0;i<n;i++)
        {
            l1[i]=new Laptop();
            al.add(l1[i]);
        }
        
        Collections.sort(al,new CostCmp());
        for(Laptop al1: al)
        {
            System.out.println(al1);
            
            //while using toString this step isn't required
            
            //System.out.println("Brand:"+al1.brand+" "+"Ram:"+al1.ram+" "+"Cost:"+al1.cost);
        }
        Collections.sort(al);
        for(Laptop al1: al)
        {
            System.out.println(al1);
            
            //while using toString this step isn't required
            
          //  System.out.println("Brand:"+al1.brand+" "+"Ram:"+al1.ram+" "+"Cost:"+al1.cost);
        }
        
    }
}
