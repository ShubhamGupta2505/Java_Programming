abstract class A
{
	public final void callme()  //we cannot change its body
	{
		System.out.println("HI");
	}
	abstract void hello(); //abstract method declared
	void showme( ) {
		System.out.println("I am non abstract method of abstract base class");
	}
	
}
class Abs extends A{
	void hello() {
		System.out.println("Hello I am from Abs ");
	}
}
class Bb extends A {
	void hello() {
		System.out.println("Hello friends  ...I ma from Bb");
	}
}
class Cc extends A {
	void hello() {
		System.out.println("Hello friends  ...I ma from Cc");
	}
}
public class abstractTest {
	public static void main(String args[]) {
		/*
		Abs abs = new Abs();
		abs.callme(); //Output = hi
		Bb b2 = new Bb();
		b2.callme();// Output = ?
		abs.showme();// calling non abstract method of abstract class 
		abs.hello(); // Output =?
		Bb bb = new Bb();
		bb.callme(); //Output =? Example of static binding 
		bb.showme();
		bb.hello();
		*/
		A  a1 = new Abs();
		a1.hello(); // from Abs
		a1 = new Bb();
		a1.hello(); //from Bb
		a1 = new Cc();
		a1.hello();
	}

}
