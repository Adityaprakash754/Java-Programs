import java.util.*;
public class Prog2 {
    public static void main(String[] args) {
        int c,a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b: ");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Inside Catchblock");
            e.printStackTrace();
        } 
    }
}