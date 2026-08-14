
import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to check: ");
        int n=sc.nextInt();

        //checking for prime;
        boolean prime=true;
        if(n<=1)
        {
          prime=false;
        }
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                prime=false;
                break;
            }
        }
        //palindrome
        int rev=0,temp;
        int original=n;
        while(n>0)
        {
           temp=n%10;
           rev=rev*10+temp;
           n=n/10;
        }

        if(prime && original==rev)
        {
            System.out.println("Given number "+original+" is a prime palindrome");
        }
        else
        {
            System.out.println("It is not a prime palindrome");
        }
        sc.close();
    }
}
/*Enter a number to check: 
131
Given number 131 is a prime palindrome */
/*
Enter a number to check: 
121
It is not a prime palindrome
*/