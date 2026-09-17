
    import java.util.Scanner;

interface PaymentService {
    void pay(String upiid, double amount);
    double checkbalance();
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class Wallet {

    private String name;
    private int accno;
    private String upiid;
    private double bal;

    Wallet(String name, int accno, String upiid, double bal) {
        this.name = name;
        this.accno = accno;
        this.upiid = upiid;
        this.bal = bal;
    }

    void addmoney(double amount) {
        bal = bal + amount;
    }

    void transaction(double amount) {
        bal = bal - amount;
    }

    String getUpiid() {
        return upiid;
    }

    double getBalance() {
        return bal;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("UPI ID: " + upiid);
        System.out.println("Balance: ₹" + bal);
    }
}

class UPIPayment implements PaymentService {

    private Wallet senderAccount;
    private Wallet receiverAccount;

    UPIPayment(Wallet sender, Wallet receiver) {
        senderAccount = sender;
        receiverAccount = receiver;
    }

    public void pay(String upiid, double amount) {

        try {

            if (!upiid.contains("@")) {
                throw new InvalidUPIException("Invalid UPI ID");
            }

            if (!receiverAccount.getUpiid().equals(upiid)) {
                throw new InvalidUPIException(
                    "Receiver UPI ID not found"
                );
            }

            if (amount <= 0) {
                throw new InvalidAmountException(
                    "Amount must be greater than zero"
                );
            }

            if (amount > senderAccount.getBalance()) {
                throw new InsufficientBalanceException(
                    "Insufficient balance"
                );
            }

            senderAccount.transaction(amount);
            receiverAccount.addmoney(amount);

            System.out.println("\nPayment Successful");
            System.out.println("From: " + senderAccount.getUpiid());
            System.out.println("To: " + receiverAccount.getUpiid());
            System.out.println("Amount: ₹" + amount);
        }

        catch (InvalidUPIException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }

        catch (InvalidAmountException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }

        catch (InsufficientBalanceException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }

        finally {
            System.out.println("Transaction Completed");
        }
    }

    public double checkbalance() {
        return senderAccount.getBalance();
    }
}

public class UpiPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Wallet naveenAccount = new Wallet(
            "sharath",
            101,
            "sharath@upi",
            5000
        );

        Wallet rahulAccount = new Wallet(
            "siva",
            102,
            "siva@upi",
            2000
        );

        UPIPayment paymentSystem =
            new UPIPayment(sharathAccount, sivaAccount);

        System.out.println("----- Initial Wallet Details -----");

        naveenAccount.display();

        System.out.println();

        rahulAccount.display();

        System.out.print("\nEnter Receiver UPI ID: ");
        String receiverUPI = sc.nextLine();

        System.out.print("Enter Amount: ");
        double amount = sc.nextDouble();

        paymentSystem.pay(receiverUPI, amount);

        System.out.println("\n----- Final Wallet Details -----");

        naveenAccount.display();

        System.out.println();

        rahulAccount.display();

        System.out.println(
            "\nNaveen Available Balance: ₹" +
            paymentSystem.checkbalance()
        );

        sc.close();
    }
}

