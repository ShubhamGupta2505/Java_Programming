import java.io.*;
import java.util.Scanner;

class Assignment1{
     public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int Password = 345;   //we assume Password is 345
      int PIN;
      int n=0;
      System.out.println("Enter Password(PIN) :");
      while(n<3)
{
      PIN = sc.nextInt();
      n++;
      if(PIN == Password){
        System.out.println("Welcome");
        break;
}
      else
        System.out.println("Incorrect PIN ");
}
      
}
}