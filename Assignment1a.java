import java.io.*;
import java.util.Scanner;
import javax.swing.*;

class Assignment1a{
     public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int Password = 345;   //we assume Password is 345
      String PIN_string;
      int n=0;
        //upto 9 digits PIN allowed
      for(int i =0;i<3;i++){
      PIN_string = JOptionPane.showInputDialog("Enter Password(PIN) :");
      int PIN = Integer.parseInt(PIN_string);
      if(PIN == Password){
        JOptionPane.showMessageDialog(null, "Welcome ");
        break;
}
      else
        JOptionPane.showMessageDialog(null, "Incorrect PIN ");
}
      
}
}