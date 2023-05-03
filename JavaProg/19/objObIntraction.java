// object object interaction
class Teacher
{
    Student s1 = new Student();
    void givesPen(Pen p1)
    {
        s1.recievesPen(p1);
    }
    
}
class Student
{
    void recievesPen(Pen p1)
    {
        p1.opensCap();
        p1.writing();
        p1.closeCap();
    }
}
class Pen{
    void opensCap()
    {
        System.out.println("Pen opens");
    }
    void writing()
    {
        System.out.println("Pen writing");
    }
    void closeCap()
    {
        System.out.println("Pen closes");
    }
}
class Main{
    public static void main(String[] args)
    {
        Teacher t1 =new Teacher();
        Pen p1 =new Pen();
        t1.givesPen(p1);
    }
}
