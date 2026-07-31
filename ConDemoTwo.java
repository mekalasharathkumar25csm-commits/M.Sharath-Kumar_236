package myproject;

public class ConDemoTwo {
	int rollno;
	String name;
	float fee;
	public ConDemoTwo(int i,String n,float f) {
		this.rollno= i;
		this.name=" n";
		this.fee=f;
		
		
	}
	void sample() {
		System.out.println("rollno is:" + this.rollno);
		System.out.println("name is:" + this.name);
		System.out.println("fee is:" + this.fee);
	}
		public static void main(String[] args) {
			System.out.println("hello ");
			 ConDemo cd= new ConDemo();
			 cd.sample();
		}
			
	}
		


