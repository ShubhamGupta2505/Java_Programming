class employee {
	String eid;
	double salary;
	employee(String eid,double salary){
		this.eid = eid;
		this.salary = salary;
	}
	void seteid(String eid) {
		this.eid = eid;
	}
	void setsalary(double salary) {
		this.salary = salary;
	}
	String geteid() {
		return eid;
	}
	double getsalary() {
		return salary;
	}
}
class manager extends employee {
	double bonuses;
	manager(String eid,double salary,double bonuses) {
		super(eid,salary);
		this.bonuses = bonuses;
	}
	void setbonuses(double bonuses) {
		this.bonuses = bonuses;
	}
	double getbonuses() {
		return bonuses;
	}
	double getsalary() {
		salary = salary + bonuses ;
		return salary;
	}
}
public class Office {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee("A3SA",45000);
		manager m1 = new manager("A3SB",60000,4000);
		
		e1 = m1;
		double sal = e1.getsalary();
		System.out.println(sal);

	}

}
