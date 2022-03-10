package Stream;


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Battery
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test;
		test = sc.nextInt();
		for(int i =0;i<test;i++){
		    int batt;
		    batt = sc.nextInt();
		    if(batt<=15){
		        System.out.println("Yes");
		    }
		    else
		    {
		        System.out.println("No");
		    }
		}
	}
}
