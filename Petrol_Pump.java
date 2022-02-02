import java.io.*;
import java.util.Scanner;
//import javax.swing.*;


class Petrol{
	float price;
	float amount;
	float quantity;
	
	Scanner sc = new Scanner(System.in);
	void setprice() {
		float p;
		Scanner sc = new Scanner(System.in);
		System.out.println("Set Today's Price :");
		p = sc.nextFloat();
		price = p;
	}
	void getprice() {
		//double price = p;
	}
	Petrol() {
		amount = 0;
		quantity = 0;
		
	}
	
	void enterQuantity() {
		System.out.println("Enter amount of petrol needed (in litre ) :");
		quantity = sc.nextFloat();
		amount = quantity * price ;
		System.out.println("Amount payable :"+amount +"Rupees. ");
		
	}	

	void enterAmount() {
		System.out.println("Enter Amount of Petrol needed (in rupees) :");
		amount = sc.nextFloat();
		quantity = amount/price;
		System.out.println("Quantity filled :  "+quantity +"litres. ");
		
	}
	
	void pay() {
		
		
	}
}


public class Petrol_Pump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Petrol p1 = new Petrol();
		double price = 0.0;
		p1.setprice();
		//System.out.println("Price of petrol per litre is :"+price);
		String choice;
		System.out.println("Enter the choice through which you want petrol : ");
		System.out.println("q for Quantity \n  a for amount");
		choice = sc.nextLine();
		switch(choice) {
		case "q":
			p1.enterQuantity();
			break;
			
		case "a" :
			p1.enterAmount();
			break;
			
		default :
			System.out.println("Invalid choice ");
			
		
		}
		

	}

}
