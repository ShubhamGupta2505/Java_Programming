
public class Varargs {
	public void sum(double ... args) {
		System.out.println("No. of args entered  "+ args.length);
		double sum =0;
		int i;
		for(i = 0;i<args.length;i++) {
			sum = sum + args[i];
		}
		/*
		 * 
		 */
		System.out.println("Sum = "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs v = new Varargs();
		v.sum(12,23);
		v.sum(12,2,3,456,76,32);
		System.out.println(Math.max(100,Math.max(200, 25) ));
		System.out.println(Math.max(750,Math.max(100, 250) ));

	}

}
