package inheritance;
interface I1{
	int x=7;
	void sample();
	}
interface I2 extends I1{
	int y=8;
	void demo();	
}
 class multi implements I1,I2{
	public void sample() {
		System.out.println("this is from I1");
	}
 
	public void demo() {
		System.out.println("this is from I2");
		
	}
	void mymethod() {
		System.out.println("from child class");
	}
}
public class  MultipleInheritance  {
	public static void main(String[] args) {
		multi mlt=new multi();
			System.out.println(I1.x);
		System.out.println(I2.y);
		mlt.demo();
		mlt.sample();
		mlt.mymethod();
	}
}
