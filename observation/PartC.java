package myproject;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Looping Statements =====");
        System.out.println("1. Print Multiplication Table");
        System.out.println("2. Display Numbers from 1 to N");
        System.out.println("3. Sum of First N Natural Numbers");
        System.out.println("4. Fibonacci Series");
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter a number: ");
                int table = sc.nextInt();

                System.out.println("Multiplication Table of " + table);
                for (int i = 1; i <= 10; i++) {
                    System.out.println(table + " x " + i + " = " + (table * i));
                }
                break;

            case 2:
                System.out.print("Enter N: ");
                int n1 = sc.nextInt();

                System.out.println("Numbers from 1 to " + n1 + ":");
                for (int i = 1; i <= n1; i++) {
                    System.out.print(i + " ");
                }
                break;

            case 3:
                System.out.print("Enter N: ");
                int n2 = sc.nextInt();

                int sum = 0;
                for (int i = 1; i <= n2; i++) {
                    sum += i;
                }

                System.out.println("Sum of first " + n2 + " natural numbers = " + sum);
                break;

            case 4:
                System.out.print("Enter number of terms: ");
                int terms = sc.nextInt();

                int a = 0, b = 1;

                System.out.println("Fibonacci Series:");
                for (int i = 1; i <= terms; i++) {
                    System.out.print(a + " ");
                    int c = a + b;
                    a = b;
                    b = c;
                }
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
    }


}
