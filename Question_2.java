/* 
 * One interesting application of computers is to display  graphs and bar charts. Write an application  that 
 *  reads  five  numbers between  1  and  30.  For  each  number  that  is  read, your  program  should 
 *   display  the  same  number  of  adjacent  asterisks.  For  example,  if your  program  reads  the 
 *    number  7,  it  should  display  *******.  Display  the  bars  of asterisks after your read all
 *     five numbers.*/

import java.util.Scanner;
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 numbers(Between 1 to 30) :");
		int arr[] = new int[5];
		for(int i =0;i<5;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<5;i++) {
			if(arr[i] > 30) {
				System.out.println("Number is greater than 30");
				System.exit(0);
			}
			int a = arr[i];
			while(a > 0) {
				System.out.print("*");
				a--;
			}
			System.out.println();
		}

	}

}
