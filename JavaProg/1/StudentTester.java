public class StudentTester{
   
   public static void main(String[] args){
        //Create an object of Student class
        Student s1= new Student();
        
        //Use setter methods to set the values
        s1.setStudentId(1001);
        s1.setName("Ram");
        s1.setQualifyingExamMarks(93.4f);
        s1.setResidentialStatus('D');
        s1.setYearOfEngg(3);

        //Use getter methods with proper escape sequences to display values
        
        System.out.println("Student Name"+"\t:"+"\t"+s1.getName());

        System.out.println("Student Id"+"\t:"+"\t"+s1.getStudentId());

        System.out.println("Qualifying marks"+"\t:"+"\t"+s1.getQualifyingExamMarks());

        System.out.println("Year of Engineering"+"\t:"+"\t"+s1.getYearOfEngg());

        System.out.println("Residential status"+"\t:"+"\t"+s1.getResidentialStatus());
   }
}