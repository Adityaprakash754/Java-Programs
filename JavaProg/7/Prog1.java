//implement loose Coupling on arrayList of Student
import java.util.*;

class Student
{
    int usn;
    int age;
    Scanner sc= new Scanner(System.in);
    public Student(int usn,int age)
    {
        this.usn=usn;
        this.age=age;
    }
}
class ArrayListDemo
{
    public ArrayList <Student> getList()
    {
        Student s1=new Student(1234,20);
        Student s2=new Student(4567,21);
        Student s3=new Student(7891,21);
        
        ArrayList <Student> al=new ArrayList <Student>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        
        return al;
    }
}
class Demo {
    public static void main(String[] args) {
        ArrayListDemo data= new ArrayListDemo();
        ArrayList <Student> list= data.getList();
        for(Student s: list){
        System.out.println(s.usn);
        System.out.println(s.age);
        }
    }
}