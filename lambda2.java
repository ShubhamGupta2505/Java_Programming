import java.util.*;

//package LambdaCollection;
interface AreaC {
	double areacircle(double i);
}
interface RectangleA {
	double arearect(int l,int b);
}
public class lambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi = 3.141;
		AreaC a = (r) -> pi*r*r;
		//System.out.println(a.areacircle(4));
		//System.out.println(a.areacircle(5));
		RectangleA aa = (l,b) ->l*b;
		//System.out.println(aa.arearect(3, 34));
		List<Double> lr = new ArrayList<Double>();
		lr.add(2.0);
		lr.add(3.0);
		lr.add(5.0);
		//System.out.println(lr);
		lr.forEach(r -> System.out.println(r));
		lr.forEach(r -> System.out.println(a.areacircle(r)));

	}

}
