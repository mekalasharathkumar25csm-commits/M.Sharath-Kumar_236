public class AE {
    
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;

            int result = a / b;  // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}


