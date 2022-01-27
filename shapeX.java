import java.io.*;
import javax.swing.*;
class SquareX
{
    int s;
     void sqarea(int s){
     System.out.println("The area of square is ="+(s*s));
     JOptionPane.showMessageDialog(null, "The area of square is "+(s*s) +"Result");
}
 
}

class ShapeX
{
     public static void main(String args[])
     {
       String side;
       side = JOptionPane.showInputDialog("Enter the side of square :");
       int s = Integer.parseInt(side);
       System.out.println(side);
       SquareX sq = new SquareX();    //Constructor
       sq.sqarea(s);
}

}