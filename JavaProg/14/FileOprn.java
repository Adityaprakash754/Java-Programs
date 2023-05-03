import java.util.*;
import java.io.*;
public class FileOprn {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the file");
        String fileName= sc.next();
        File f=new File(fileName);
        
        if(f.exists())
        {
            System.out.println("The file "+fileName+" exists");
            
            if(f.canRead())
            System.out.println("The file "+fileName+" is readable");
            else
            System.out.println("The file "+fileName+" isn't readable");
            
            if(f.canWrite())
            System.out.println("The file "+fileName+" is writable");
            else
            System.out.println("The file "+fileName+" isn't writable");
            
            System.out.println("The filetype is "+fileName.substring(fileName.indexOf('.') + 1));
            System.out.println("The length of the file is "+f.length());
        }
        else
        System.out.println("The file "+fileName+" doesn't exists");
    }
}