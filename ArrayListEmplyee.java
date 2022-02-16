class Employee {
	String name;
	int salary;
	int id;
	void setname(String name) {
		this.name = name;
	}
	String getname() {
		return name;
	}
	void setsalary(int salary) {
		this.salary = salary;
	}
	int getsalary() {
		return salary;
	}
	void setid(int id) {
		this.id = id;
	}
	int getid() {
		return id;
	}
	Employee(String name,int salary,int id) {
		this.salary = salary;
		this.id = id;
		this.name = name;
	}
}
public class ArrayListEmplyee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();

	}

}
