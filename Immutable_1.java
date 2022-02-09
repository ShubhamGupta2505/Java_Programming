//  In Java, all the wrapper classes (like Boolean, Short, Integer, Long, Float, Double, Byte, Char, and String)
 //      and String class is immutable.
//  Immutable class in java means that once an object is created, we cannot change its content.
//  Following are the requirements: 

//  The class must be declared as final so that child classes can’t be created.
//  Data members in the class must be declared private so that direct access is not allowed.
//  Data members in the class must be declared as final so that we can’t change the
//    value of it after object creation.
import java.io.*;
import java.util.*;

 final class University_1 {
	
	final private String course_name;
	public University_1(String course_name) {
		this.course_name = course_name;
	}
	public String getcourse_name() {
		return course_name;
	}
	
}

public class Immutable_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		University_1 u1 = new University_1("JAVA");
		String s = u1.getcourse_name();
		System.out.println("Course Name :"+s);

	}

}
