package Stream;
import java.util.Collections;
import java.util.*;
import java.util.function.Predicate;
import java.util.function.*;
public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		IntToDoubleFunction volCube = v -> (double)(s*s*s);
		double result = volCube.applyAsDouble(s);
		System.out.println("The approxiamte volme "+result);
		List<String> names = new ArrayList<String>();
		Collections.addAll(names, "alok","Shubham","Ram","Sam");
		Predicate<String> pd1 = (p) ->p.length()>10;
		names.stream().filter(pd1).forEach(System.out::println);
		
		Consumer<String> con = cs -> System.out.println(cs+" Hello");
		names.stream().forEach(con);

	}

}

