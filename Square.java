
class Square
{
    int s;
    Square(int side)
    {
     System.out.println("Square of side " +side+ "is created ") ;
     s = side ;
     
}
     void sqarea(){
     System.out.println("The area of square is ="+(s*s));
}
 /* public static void main(String args[]){
   System.out.println("I am for testing purpose ");

} */
}

class Shape
{
     public static void main(String args[])
     {
       Square sq = new Square(25);    //Constructor
       sq.sqarea();
}

}