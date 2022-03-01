package Stream;

//Demonstrate File.
import java.io.File;
class FileDemonstration {
public static void main(String args[]) {
File f1 = new File("/oop/hi.txt");
System.out.println("File Name is " + f1.getName());
System.out.println("Path of File is " + f1.getPath());
System.out.println("Parent of File is " + f1.getParent());
System.out.println("File last modified on " + f1.lastModified());
System.out.println("File size is  " + f1.length() + " Bytes");
}
}
