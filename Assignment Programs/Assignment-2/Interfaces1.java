
interface A {
    int x=100;
    void display();
}

class D implements A {

    @Override
    public void display()
    {
        int y=200;
        System.out.println("The sum is : "+(x+y));
        System.out.println("The DIfference is : "+(x-y));
    }
}
public class Interfaces1 {
    public static void main(String[] args) {
        D i=new D();
        i.display();
    }
}
//output
/*
The sum is : 300
The DIfference is : -100
 */