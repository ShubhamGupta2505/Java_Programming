package ExceptionHandling;
class Circle {
	double radius;
	final double pi = 3.141;
	
	public void steradius(double newradius) {
		if(newradius>0)
			radius = newradius;
		else
			throw new IllegalArgumentException("Radius can not be negative");
	}
	public double circleArea() {
		return pi*radius*radius;
	}
}
public class IllegalArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		c1.steradius(-5);
		double AreaC = c1.circleArea();
		System.out.println("Area"+AreaC);
		

	}

}
