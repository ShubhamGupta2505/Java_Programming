package Stream;
import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 4;
		int incr = 0;
		String st[] = {"Spring Roll","Pizza","Pasta"};
		Vector<String> v1 = new Vector<String>();
		Vector<Integer> v2 = new Vector<Integer>(size);
		Vector<Double> v3 = new Vector<Double>(size,incr);
		v1.add("Hello");
		v1.add("my");
		v1.add("dear");
		System.out.println(v1);
		Iterator<String> itr = v1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
