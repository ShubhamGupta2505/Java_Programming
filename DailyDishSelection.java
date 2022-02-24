//20BCE10801 Isha Singhal
//Daily Dish Selection app by MOM
//Assingment 3 (challenging Task ) 
//Date: 18/02/22

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

class Mother{
	ArrayList<String> dishes = new ArrayList<String>(Arrays.asList("Rice", "Veggies", "Upmma", "Poha", "Idli", "Dosa", "Pizza", "Burger","Pasta"));
	ArrayList<String> choices = new ArrayList<String>();
	public void random() {
		System.out.println("Todays menu is: ");
		Collections.shuffle(dishes);
		for(int i=0; i<4; i++) {
			System.out.println(dishes.get(i));
		}
		
	}
	
	public void choice() {
		for(int i=1; i<=10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Member "+i+" please enter you choice: ");
			String c = sc.next();
			choices.add(c);
		}
	}

	public void select() {
		choices.sort(null);
		int count = 1, max_count=1;
		String element="null";
		String [] choicearray = new String[choices.size()];
		choices.toArray(choicearray);
		for(int j=1; j<choicearray.length; j++) {
			if(choicearray[j].equals(choicearray[j-1])) { 
				count++;
				}
			else{
                if(count>max_count){
                    max_count = count;
                    element = choicearray[j-1];
                } 
                count = 1;
            }
		 }
		System.out.println("Today's dish is: "+element);
	}
	
}
public class DailyDishSelection {

	public static void main(String[] args) {
		Mother m = new Mother();
		m.random();
		m.choice();
		m.select();
	}

}
