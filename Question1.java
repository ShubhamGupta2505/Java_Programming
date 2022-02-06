import java.util.Scanner;
class shape {
	Scanner sc =new Scanner(System.in);
	void box() {                    // to dispaly box
		System.out.println("Enter the dimension of box :");
		int a = sc.nextInt();          //a is length
		int b = sc.nextInt();         //b is width
		for(int i=0;i<b;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void diamond() {
        int a, i, j, b = 1;
        System.out.print("Enter the number of rows: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();        //each size of diamond
        b = a - 1;          //spaces in the diamond in a rectangular area (2a-1)*(2a-1)
        for (j = 1; j <= a; j++) 
        {
            for (i = 1; i <= b; i++) 
            {
                System.out.print(" ");
            }
            b--;
            for (i = 1; i <= 2 * j - 1; i++) 
            {
                System.out.print("*");                
            }
            System.out.println("");
        }
        b = 1;
        for (j = 1; j <= a - 1; j++) 
        {
            for (i = 1; i <= b; i++) 
            {
                System.out.print(" ");
            }
            b++;
            for (i = 1; i <= 2 * (a - j) - 1; i++) 
            {
                System.out.print("*");
            }
            System.out.println("");
        }
	}
	void oval() {
		System.out.print("Enter width of Oval(>3) : ");
		 int width = sc.nextInt();
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
	void arrow() {
		System.out.print("Enter the value of arrow head rows: ");
		int a = sc.nextInt();
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
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s = new shape();
		boolean A = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter \n 1 for Box \n 2 for Arrow \n 3 for Diamond \n 4 for oval \n 5 for exit");
		//int choice = sc.nextInt();
		while(A) {
			System.out.println(":");
			int choice = sc.nextInt();
		switch(choice) {
		case 1 :
			s.box();
			break;
		case 2:
			s.arrow();
			break;
		case 3:
			s.diamond();
			break;
		case 4:
			s.oval();
			break;
		case 5:
			A = false;
		default :
			System.out.println("Invalid Choice");
		}
		
		//System.exit(0);

	}}

}
