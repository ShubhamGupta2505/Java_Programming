import java.io.*;
import java.util.Scanner;
//import javax.swing.*;
class Admin {                      //Admin class for global variables
	Scanner sc = new Scanner(System.in);
	float quantity;
	float amount;
	float price;
}

class Petrols extends Admin{         //petrol class to store petrol price and calculate amount or quantity
	float price_petrol;
	void setprice(float p) {
		price_petrol = p;
	}
	float getprice() {
		return price_petrol;
	}
	Petrols() {
		amount = 0;
		quantity = 0;
		
	}
	void enterQuantity() {
		System.out.println("Enter amount of petrol needed (in litre ) :");
		quantity = sc.nextFloat();
		amount = quantity * price_petrol ;
		System.out.println("Amount payable :"+amount +"Rupees. ");
		
	}	

	void enterAmount() {
		System.out.println("Enter Amount of Petrol needed (in rupees) :");
		amount = sc.nextFloat();
		quantity = amount/price_petrol;
		System.out.println("Quantity filled :  "+quantity +"litres. ");
		
	}
	
}
class Diesel extends Admin{                     //Diesel class to store diesel price and calculate amount or quantity
	float price_diesel;
	void setprice(float d) {
		price_diesel = d;
	}
	float getprice() {
		return price_diesel;
	}
	
	Diesel() {
		amount = 0;
		quantity = 0;
		
	}
	void enterQuantity() {
		System.out.println("Enter amount of Diesel needed (in litre ) :");
		quantity = sc.nextFloat();
		amount = quantity * price_diesel ;
		System.out.println("Amount payable :"+amount +"Rupees. ");
		
	}	

	void enterAmount() {
		System.out.println("Enter Amount of Diesel needed (in rupees) :");
		amount = sc.nextFloat();
		quantity = amount/price_diesel;
		System.out.println("Quantity filled :  "+quantity +"litres. ");
		
	}
}
class CNG extends Admin{
	float price_CNG;
	void setprice(float c) {
		price_CNG = c;
	}
	float getprice() {
		return price_CNG;
	}
	
	CNG() {
		amount = 0;
		quantity = 0;
		
	}
	void enterQuantity() {
		System.out.println("Enter amount of CNG needed (in litre ) :");
		quantity = sc.nextFloat();
		amount = quantity * price_CNG;
		System.out.println("Amount payable :"+amount +"Rupees. ");
		
	}	

	void enterAmount() {
		System.out.println("Enter Amount of CNG needed (in rupees) :");
		amount = sc.nextFloat();
		quantity = amount/price_CNG;
		System.out.println("Quantity filled :  "+quantity +"litres. ");
		
	}
}


public class Petrol_Pump1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Petrols p1 = new Petrols();
		Diesel d1 = new Diesel();
		CNG c1 = new CNG();
		String choice1 ;
		p1.setprice(100);
		d1.setprice(80);
		c1.setprice(60);
		System.out.println("Today Price :");
		System.out.println("Petrol :"+p1.getprice());
		System.out.println("Diesel :"+d1.getprice());
		System.out.println("CNG :"+c1.getprice());
		System.out.println("What do you want to fill in your vehicle ?:");
		System.out.println(" 1 for Petrol \n 2 for Diesel \n 3 for CNG");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the choice through which you want petrol : ");
			System.out.println(" q for Quantity \n  a for amount");
			choice1 = sc.nextLine();
			if(choice1 == "q") {
				p1.enterQuantity();
			}
			else if(choice1 == "a") {
				p1.enterAmount();
			}
			else
			{
				System.out.println("Invalid Choice of filling");
			}
			break;
		case 2:
			System.out.println("Enter the choice through which you want Diesel : ");
			System.out.println(" q for Quantity \n  a for amount");
			String choice2 = sc.nextLine();
			if(choice2 == "q") {
				d1.enterQuantity();
			}
			else if(choice2 == "a") {
				d1.enterAmount();
			}
			else
			{
				System.out.println("Invalid Choice of filling");
			}
				break;
				
			default :
				System.out.println("Invalid choice ");
			}
			break;
		case 3 :
			
			System.out.println(" Enter the choice through which you want CNG : ");
			System.out.println(" q for Quantity \n  a for amount");
			String choice4 = sc.nextLine();
			if(choice4 == "q") {
				c1.enterQuantity();
			}
			else if(choice4 == "a") {
				c1.enterAmount();
			}
			else
			{
				System.out.println("Invalid Choice of filling");
			}
			break;
		
		default :
			System.out.println("Invalid choice !!!!");
		}
		


	
	}
