package ExceptionHandling;
interface rewards {               // abstract class can be used as interface
	static int points = 0;
	abstract void points();
	static void hello() {
		System.out.println("Hello I am static member of abstract class ");
	}
}
class BonusPoint {
	public void honda() {
		int x=5;
		rewards r1 = new rewards() {
			public void points() {
				System.out.println("Your points are :"+(points+x));			}
		};
		r1.points();
		
	}
}
public class Anonymous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(rewards.points);
		BonusPoint bp = new BonusPoint();
		bp.honda();
		rewards.hello();

	}

}
