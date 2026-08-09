
interface A
{
    int x=20;
    void sample();

}
interface B
{
    int y=30;
    void example();
}
interface C
{
     int z=40;
     void display();
}
class Demo implements A,B,C
{
    @Override
    public void sample()
    {
        System.out.println("The sum of x and y is : "+(x+y));
        System.out.println("The product of x and z is : "+(x*z));

    }
    @Override
    public void example()
    {
        System.out.println("The difference of z and y is : "+(z-y));
    }
    @Override
    public void display()
    {
        System.out.println("The product of z and y is : "+(z*y));
    }
}
public class Interfaces2 {
    public static void main(String[] args) {

        Demo d=new Demo();
        d.sample();
        d.example();
        d.display();
        
    }
}
//output
/*The sum of x and y is : 50
The product of x and z is : 800
The difference of z and y is : 10
The product of z and y is : 1200 */