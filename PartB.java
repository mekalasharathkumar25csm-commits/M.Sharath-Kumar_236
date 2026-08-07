package myproject;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MENU =====");
        System.out.println("1. Check Even or Odd");
        System.out.println("2. Find Largest of Three Numbers");
        System.out.println("3. Display Grade");
        System.out.println("4. Display Day of the Week");
        System.out.print("Enter your choice (1-4): ");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter a number: ");
                int num = sc.nextInt();

                if (num % 2 == 0) {
                    System.out.println(num + " is Even.");
                } else {
                    System.out.println(num + " is Odd.");
                }
                break;

            case 2:
                System.out.print("Enter first number: ");
                int a = sc.nextInt();

                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                System.out.print("Enter third number: ");
                int c = sc.nextInt();

                if (a >= b && a >= c) {
                    System.out.println("Largest number is: " + a);
                } else if (b >= a && b >= c) {
                    System.out.println("Largest number is: " + b);
                } else {
                    System.out.println("Largest number is: " + c);
                }
                break;

            case 3:
                System.out.print("Enter percentage: ");
                double percentage = sc.nextDouble();

                if (percentage >= 90) {
                    System.out.println("Grade: A");
                } else if (percentage >= 80) {
                    System.out.println("Grade: B");
                } else if (percentage >= 70) {
                    System.out.println("Grade: C");
                } else if (percentage >= 60) {
                    System.out.println("Grade: D");
                } else if (percentage >= 50) {
                    System.out.println("Grade: E");
                } else {
                    System.out.println("Grade: F");
                }
                break;

            case 4:
                System.out.print("Enter day number (1-7): ");
                int day = sc.nextInt();

                switch (day) {
                    case 1:
                        System.out.println("Sunday");
                        break;
                    case 2:
                        System.out.println("Monday");
                        break;
                    case 3:
                        System.out.println("Tuesday");
                        break;
                    case 4:
                        System.out.println("Wednesday");
                        break;
                    case 5:
                        System.out.println("Thursday");
                        break;
                    case 6:
                        System.out.println("Friday");
                        break;
                    case 7:
                        System.out.println("Saturday");
                        break;
                    default:
                        System.out.println("Invalid day number!");
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }

    

}
