package myproject;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        
        System.out.println("\n----- Student Information -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Marks      : " + m1 + ", " + m2 + ", " + m3);
        System.out.println("Total      : " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);

        sc.close();
    }


}
