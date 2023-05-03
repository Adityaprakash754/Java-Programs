// implement usage of toString
class Student
{
    int id;
    String name;
    int age;
    public Student(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
    
    public String toString(){
    return id+" "+name+" "+age;
    }
}

class HelloWorld {
    public static void main(String[] args) {
        Student s1=new Student(1,"Ram",10);
	    Student s2=new Student(2,"Shyam",11);
		System.out.println(s1);
		System.out.println(s2);
    }
}
