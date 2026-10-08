
    import java.util.Scanner;

class Customer {
    String name;
    int age;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Account {
    int accountNo;
    double balance;

    Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }
}

class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    double getRateOfInterest() {
        return 7.0;
    }
}

class ICICI extends RBI {
    double getRateOfInterest() {
        return 6.5;
    }
}

class PNB extends RBI {
    double getRateOfInterest() {
        return 6.0;
    }
}

public class Week7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of Interest : ");
        String name = sc.nextLine();

        RBI bank;

        if (name.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        }
        else if (name.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        }
        else if (name.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        }
        else {
            bank = new RBI();
        }

        System.out.println(name.toUpperCase() +
                " rate of interest is : " +
                bank.getRateOfInterest() + "%");

        sc.close();
    }
}

