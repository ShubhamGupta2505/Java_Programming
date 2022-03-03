package ExceptionHandling;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task = () ->{
			String threadname = Thread.currentThread().getName();
		System.out.println("Hello "+threadname);
		};
		task.run();
		Thread thread0  = new Thread(task);
		Thread thread1  = new Thread(task);
		Thread thread2  = new Thread(task);
		thread0.start();
		thread1.start();
		thread2.start();
		System.out.println("Done!");

	}

}
