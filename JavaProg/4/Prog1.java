public class Prog1 {
        public static void main(String[] args) {
            System.out.println("The Main Starts");
            int a=10,b=20;
            try{
                System.out.println("Running try block");
                /*  try with 123 it won't throw an exception */

                a = Integer.parseInt("adarsh");
                System.out.println("Exiting try block");
            }
            catch(ArithmeticException e)
            {
                System.out.println("Inside 1st Catchblock");
                e.printStackTrace();
            } 
            catch(ClassCastException e)
            {
                System.out.println("Inside 2nd Catchblock");
                e.printStackTrace();
            } 
            catch(Throwable e)
            {
                System.out.println("Inside 3rd Catchblock");
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
            System.out.println(a);
            System.out.println(b);
        }
}