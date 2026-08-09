
class A {
    String name = "SharathKumar";
    int age = 18;
}

class B extends A {
    int rollNo = 236;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

class C extends A {
    String subject = "Java";

    void example() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B s=new B();
        C x=new C();
        
        s.display();
        System.out.println("  "); //for space we have written this line 
        x.example();
    }
}