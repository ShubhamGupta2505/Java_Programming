package ExceptionHandling;
import java.io.IOException;

public class CheckPassword1 {
	int pwd = 1234556;
	static void checkpwd(int pwd) {
		if(pwd != 1234556) {
			throw new ArithmeticException("Access Denied.");
		}
		else {
			System.out.println("You are in.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*******Password********");
		
		checkpwd(12345);
		

	}

}
