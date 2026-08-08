package myproject;
import java.util.Scanner;

public class PartD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Factorial");
        System.out.println("2. Prime Check");
        System.out.println("3. Maximum of Two Numbers");
        System.out.println("4. Area of Circle");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                int n = sc.nextInt();
                long fact = 1;

                for (int i = 1; i <= n; i++) {
                    fact *= i;
                }

                System.out.println("Factorial = " + fact);
                break;

            case 2:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();
                boolean prime = true;

                if (num <= 1) {
                    prime = false;
                } else {
                    for (int i = 2; i <= num / 2; i++) {
                        if (num % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                }

                if (prime)
                    System.out.println(num + " is a Prime Number.");
                else
                    System.out.println(num + " is Not a Prime Number.");
                break;

            case 3:
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                if (a > b)
                    System.out.println("Maximum = " + a);
                else
                    System.out.println("Maximum = " + b);
                break;

            case 4:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();

                double area = Math.PI * r * r;

                System.out.println("Area of Circle = " + area);
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }


}
