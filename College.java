class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public String getNmae() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGPA() {
        return gpa;
    }
    public void setName(String newName) {
        this.name = newName;        
    }
    public String toString() {
        return "Student:\nID: "+id+"\nName: "+name+"\nGPA: "+gpa;
    }
}
class Undergrad extends Student {
    private int year;
    public Undergrad(int id, String name, double gpa, int year) {
        super(id, name, gpa);
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int passingYear) {
        this.year = passingYear;
    }
    public String toString() {
        return "Undergraduate "+super.toString() + "\nYear: "+year;
    }
}
class Graduate extends Student {
    private String thesisTitle;
    public Graduate(int id, String name, double gpa, String thesisTitle) {
        super(id, name, gpa);
        this.thesisTitle = thesisTitle;
    }
    public String getthesisTitle() {
        return thesisTitle;
    }
    public  void setThesisTitle(String newthesisTitle) {
        this.thesisTitle = newthesisTitle;
    }
    public String toString() {
        return "Graduate " +super.toString() + "\nThesis: "+thesisTitle;
    }
}
public class College {
    public static void main(String args[]) {
        Student s1 = new Student(10801, "Isha", 9.0); 
        Student s2 = new Student(12345, "Seema", 9.3); 
        Undergrad u1 = new Undergrad(99999, "ABC", 8.9, 2024); 
        Graduate g1 = new Graduate(100000, "XYZ", 8.5, "Inheritance"); 
        System.out.println(s1+"\n"); 
        System.out.println (s2+"\n"); 
        System.out.println(u1+"\n"); 
        System.out.println (g1);
    }
}