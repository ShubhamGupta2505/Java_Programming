/* Implement the following hierarchy using Java Inheritance.The class Student is the parentclass.
 *   Note that all the variables are private and hence the child classes can only use them through accessor 
 *   and mutator methods
 *   */

//import java.io.*;
import java.util.*;

class Student {
	Scanner sc = new Scanner(System.in);
	private String name;
	private int id;
	private double gpa;
	
	Student(String name,int id,double gpa) {         //Constructor for Student
		this.gpa = gpa;
		this.id = id;
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return name;
	}
	
	double getGPA() {
		return gpa;
	}
	
	int getid() {
		return id;
	}
	
	public String toString() {
		return this.id+" "+this.name+" "+this.gpa;
	}
	
}
class Undergrad extends Student {
	private int year;
	
	Undergrad(String name,int id,double gpa,int year) {    //Constructor  for Undergrad
		super(name,id,gpa);
		this.year = year;	
	}
	
	void setyear(int year) {
		this.year = year;
	}
	
	int getyear() {
		return year;
	}
	
	public String toString() {
		return "Under Graduate Student :"+super.toString()+"  "+this.year;
	}
}

class Graduate extends Student {
	private String thesistitle;
	Graduate(String name,int id,double gpa,String thesistitle) {      //Constructor for Graduate
		super(name,id,gpa);
		this.thesistitle = thesistitle;
	}
	void set_thesisTitle(String thesistitle) {
		this.thesistitle = thesistitle;
	}
	String get_thesisTitle() {
		return thesistitle;
	}
	public String toString() {
		return "Graduate Student :"+super.toString()+" "+this.thesistitle;
	}
}
public class Question5 {

	public static void main(String[] args) {
		// TODO 
		Student s1 = new Student("Shubham",123,8.6);
		System.out.println(s1);
		Undergrad u1 = new Undergrad("Ram",122,7.7,2012);
		System.out.println(u1);
		Graduate g1 = new Graduate("Sam",121,8.6,"Light theory");
		System.out.println(g1);
		//s1 = new Undergrad(2016);
		

	}

}
