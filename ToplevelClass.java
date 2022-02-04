abstract class shapeX {            //abstract class is actually top level class
	public abstract void area();   //
	private double pi = 3.141;
	public class Circle1 extends shapeX {
		double r;
		Circle1(double r) {
			this.r = r;
		}
		public void area() {
			System.out.println("Circle area = "+(pi*r*r));
		}
	}
	public static class Rectangle1 extends shapeX {      //static nested class ()
		int length;
		int breadth;
		Rectangle1(int length,int breadth) {
			this.length = length;
			this.breadth = breadth;
		}
		public void area() {
			System.out.println("Rectangle area " +length*breadth);
		}
	}
}






public class ToplevelClass {
	public static void main(String args[]) {
		shapeX aShape =new shapeX.Rectangle1(12, 13);
		aShape.area();
		
		shapeX.Circle1 c1 = aShape.new Circle1(2.0);
		c1.area();
		
	    Rectangle1 r1 = new Rectangle1(4,6);
		r1.area();
		Circle1 c2 = new Circle1(3.0);
		c2.area();
	}

}
