public class Prog4 {
    public static void test1() throws ClassNotFoundException
    {
        Class.forName("ABCD");
    }
    public static void test2() throws ClassNotFoundException
    {
        test1();
    }
    public static void main(String[] args) {
        
        try
        {
           test2();
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        }
       
    }
}