package inheritance;
class one{
	float calc_si(float p,int t,float roi) {
		float si=(p*t*roi)/100;
		return si;
	}
}
class two extends one{
	float calc_si(float p,int t,float roi) {
		float si=(p*t*roi)/10;
		return si;
		
	}
	void acess() {
		float result= calc_si(100,3,4.54f);
		System.out.println("si valueis:"+result);
		
		
	}
	}
public class mutiple {
	public static void main(String[] args) {
		two two=new two();
		two.acess();
		
				
		
	}
}

