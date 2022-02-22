package Stream;
import java.util.Collections;
import java.util.*;
import java.util.function.*;
public class Predicate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 5;
		IntToDoubleFunction volCube = v -> (double)(s*s*s);
		double result = volCube.applyAsDouble(s);
		System.out.println();

	}

}
