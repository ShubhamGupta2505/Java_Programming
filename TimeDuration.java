package ExceptionHandling;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class TimeDuration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Period p1 = Period.ofWeeks(3);
		System.out.println(p1);
		
		Duration d1 = Duration.ofDays(7);
		System.out.println(d1);
		LocalDateTime localtime = LocalDateTime.now();
		LocalDateTime finaltime = localtime.plus(d1);
		System.out.println(localtime);
		System.out.println(finaltime);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String yourpattern = finaltime.format(df);
		System.out.println("Formatted Date :"+yourpattern);

	}

}
