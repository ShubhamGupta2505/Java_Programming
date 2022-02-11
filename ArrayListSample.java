import java.util.*;
public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> players = new ArrayList<String>();
		//ArrayList<String> players = new ArrayList<String>();
		players.add("Sunil Gavaskar");
		players.add("Kapil Dev ");
		players.add("Rave Shastri");
		
		System.out.println(players);
		
		players.sort(null);
		System.out.println(players);
		
		String[] balls = {"fb","bb","pb","cb","sb"};
		List<String> ball_list = Arrays.asList(balls);
		System.out.println(ball_list);
		
		players.remove(2);
		System.out.println(players);

	}

}
