

final class Driver {
	private int eid;
	final String ename;
	
	public int get_id() {
		return eid;
	}
	public String get_name()  {
		
		return ename;
	}
	Driver(int eid,String ename){
		this.eid = eid;
		this.ename = ename;
	}
}
public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver obj = new Driver(211,"Bhoot");

	}

}
