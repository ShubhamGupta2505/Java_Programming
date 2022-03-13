package ExceptionHandling;
import java.util.*;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
public class PasswordException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			String pass = "";
			System.out.print("Enter Password :");
			pass = sc.nextLine();
			if(!(pass.equals("pass123")))
				throw new MyException("Incorrect Password.");
			else
				System.out.println("Welcome User !!");
		}
		catch(MyException e) {
			System.err.println(e);
		}

	}

}
