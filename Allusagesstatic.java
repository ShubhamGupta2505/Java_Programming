class BiCycle1 {
	protected int gear;
	protected int speed;
	protected int id =0;
	protected static int noofBicycles = 0;
	BiCycle1() {
		System.out.println("This is BiCycle ..");
	}
	BiCycle1(int g,int s) {
		this.gear = g;
		this.speed = s;
		this.id = ++noofBicycles;
		
	} 
	public static int getCount() {
		return noofBicycles;
	}
	public int getBikeId() {
		return id;
	}
	public String toString() {
		return this.gear+" "+this.speed;
	}
}
class Hero extends BiCycle1 {
	String bmodel;
	Hero(int g,int s,String bmodel) {
		super(g,s);
		this.bmodel = bmodel;
		//this.id = ++noofBiCycles;
	}
	public String toString() {
		return super.gear+" "+super.speed+" "+bmodel;
	} 
}
public class Allusagesstatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiCycle1 b1 = new BiCycle1(5,20);
		Hero h1 = new Hero(5,25,"Super");
		System.out.println(BiCycle1.getCount());
		
		Hero h2 =  new Hero(6,30,"Xtereme");

	}

}
