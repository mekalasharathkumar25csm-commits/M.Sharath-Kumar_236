

class account{
    int accno;
    int balance;
    String acctype;
    public account(int accno,int balance,String acctype){
        this.accno=accno;
        this.balance=balance;
        this.acctype=acctype;
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("balance after deposit is:"+balance);
    }
    void calinterest(){
    }
    void withdraw(int amount){
        if (balance>=amount) {
            balance=balance-amount;
            System.out.println("balance after deposit is :"+balance);
            
        }
        else
            System.out.println("insufficent balance");
    }
    void transfer(account recevier,int amount){
        if (balance>=amount) {
            balance=balance-amount;
            recevier.balance=recevier.balance+amount;
        
            System.out.println("balance after transfer is :"+recevier.balance);
            
        }
        else
            System.out.println("insufficent balance");

    }
    void display(){
        System.out.println(accno);
        System.out.println(acctype);
        System.out.println(balance);
    }
}
class savingaccount extends account{
    double interest;
    public savingaccount(int accno,int balance,double interest){
        super(accno, balance, "saving");
        this.interest=interest;
    }
    @Override
    void calinterest(){
        interest=interest*balance/100;
        System.out.println("interest is:"+interest);

    }
}
class currentaccount extends account{
    int overdraft;

public currentaccount(int accno,int balance, int overdraft){
    super(accno, balance,"current account");
}
public void withdraw(double amount) {
        if (amount <= balance + overdraft) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}
    
        public class BankManagement {
    public static void main(String[] args) {

        savingaccount s1 = new savingaccount(101, 20000, 5);
        currentaccount c1 = new currentaccount(102, 15000, 5000);

        System.out.println("Savings Account");
        s1.display();

        s1.deposit(5000);
        s1.withdraw(3000);
        s1.calinterest();

        System.out.println("\nCurrent Account");
        c1.display();

        c1.deposit(2000);
        c1.withdraw(18000);

        System.out.println("\nTransfer Money");
        s1.transfer(c1, 4000);

        System.out.println("\nFinal Details");

        s1.display();
        c1.display();
    }
}


