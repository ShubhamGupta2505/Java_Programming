package Stream;
import java.util.*;
public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t1 = new TreeSet<Integer>();
		t1.add(12);
		t1.add(65);
		t1.add(2);
		t1.add(99);
		t1.add(46);
		t1.add(4);
		System.out.println(t1);
		System.out.println(t1.contains(15));
		Iterator<Integer> itr = t1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(t1.remove(4));
		System.out.println(t1);
		int t2 = t1.first();
		System.out.println(t2);
		int t3 = t1.hashCode();
		System.out.println(t3);
		System.out.println(t1.higher(7));

	}

}
