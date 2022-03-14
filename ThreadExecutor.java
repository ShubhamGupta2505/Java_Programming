package ExceptionHandling;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newFixedThreadPool(10);
		List<String> names = new ArrayList<String>();
		names.add("alok");
		names.add("alok1");
		names.add("alok2");
		names.add("alok3");
		names.add("alok4");
		
		
		
		executor.submit(()-> {
			String threadname = Thread.currentThread().getName();
			System.out.println("Hello "+threadname);
		});

	}

}
