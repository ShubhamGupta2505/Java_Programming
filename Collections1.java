import java.util.Arrays;
import java.util.List;
import java.util.Collections;//there is difference betweens collection and collections
import java.util.ArrayList;
public class Collections1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] suits = {"Heart","Diamond","Spade","Club"};
		List <String> l1 = Arrays.asList(suits);
		ArrayList<Double> lx = new ArrayList<Double>();
		lx.add(34.6);
		lx.add(436.6);
		lx.add(267.45);
		System.out.printf("Unsorted : %s%n", lx);
		
		System.out.printf("Unsorted : %s%n", l1);
		Collections.sort(l1);
		System.out.printf("Sorted : %s%n", l1);
		Collections.reverse(l1);
		System.out.printf("Reverse : %s%n", l1);
		Collections.sort(l1,Collections.reverseOrder());
		System.out.printf("Reverse sorted : %s%n", l1);
		

	}

}
