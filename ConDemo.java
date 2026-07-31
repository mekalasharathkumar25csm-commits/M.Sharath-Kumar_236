package myproject;

public class ConDemo {
int rollno;
String name;
float fee;
public ConDemo() {
	this.rollno= 236;
	this.name=" Sharath";
	this.fee=236.56f;
	
	
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
	
	
		
	
	
	


