import java.util.*;

class Drawing{
	int side;
	int width;
	int a;
	int r;
	Scanner sc = new Scanner(System.in);
	
	void square() {
		System.out.print("Enter the value of side: ");
		side = sc.nextInt();
		for(int i=0; i<side; i++) {
			for(int j=0; j<side; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	void oval() {
		 System.out.print("Enter the width of circle (more than 3) : ");
		 width = sc.nextInt();
		 for(int i=3; i<=width; i++)
		   {
		     for(int j=1; j<=width-i; j++)
		     System.out.print(" ");
		     for(int j=1; j<=2*i-1; j++)
		       System.out.print("*");
		     System.out.println(" ");
		   }
		 for(int i=0; i<=3; i++) {
			 for(int j=0; j<2*width-1; j++) {
				 System.out.print("*");
			 }
			 System.out.println(" ");
		 }
		 for(int i=width-1;i>=3;i--)
		   {
		     for(int j=1;j<=width-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.println(" ");
		   }
		}
	
	void diamond() {
		   System.out.print("Input number of rows (half of the diamond) : ");
		   r = sc.nextInt();
		   for(int i=0;i<=r;i++)
		   {
		     for(int j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
		 
		   for(int i=r-1;i>=1;i--)
		   {
		     for(int j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.print("\n");
		   }
	}
	
	void arrow() {
		System.out.print("Enter the value of arrow head rows: ");
		a = sc.nextInt();
		for(int i=0;i<=a;i++)
		   {
		     for(int j=1;j<=a-i;j++)
		      System.out.print(" ");
		     for(int j=1;j<=2*i-1;j++)
		       System.out.print("*");
		     System.out.println(" ");
		   }
		for (int i=0; i<a+2; i++) {
			for(int j=1; j<a-1; j++) 
				System.out.print(" ");
			System.out.println("**");
			
		}
	}
	}

public class AsterisksApplication {

	public static void main(String[] args) {
		
		Drawing dr = new Drawing();
		dr.square();
		dr.oval();
		dr.diamond();
		dr.arrow();
	}

}
