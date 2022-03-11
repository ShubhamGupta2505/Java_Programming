package ExceptionHandling;
import java.io.*;

public class CheckedException {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		int k;
		try  {
		fis = new FileInputStream("C:/oop/hi.txt");
		
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		finally {
			System.out.println("I am executed after Execution");
		}
		try {
		while((k =fis.read()) !=-1) 
		{
			System.out.print((char)k);
		}
		}
		catch(IOException e1) {
			System.out.println("File for IO not Found");
		}
		
		fis.close();
		
		

	}

}
