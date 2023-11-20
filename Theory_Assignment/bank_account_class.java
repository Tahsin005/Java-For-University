package Theory_Assignment;
class BankAccount{
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructors
    public BankAccount(){
        this.accountNumber = "NULL";
        this.accountHolder = "UNKNOWN";
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String accountHolder, double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("Withdrawn $ : " + amount);
        }
        else{
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public double checkBalance(){
        return balance;
    }

    private double calculateInterest(){
        return balance * 0.05;
    }

    public void displayAccountInfo(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance: $ : " + balance);
        System.out.println("Balance after interest $ : " + (calculateInterest() + balance));
    }


}
public class bank_account_class{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println("Account information of person 1 : ____________________");
        b1.displayAccountInfo();

        BankAccount b2 = new BankAccount("SAVE2023NOV05", "MD. Tahsin Ferdous", 555555.0);
        System.out.println("Account information of person 2 : ____________________");
        System.out.println("Balance before withdrawing : ");
        b2.displayAccountInfo();
        System.out.println("Balance after withdrawing : ");
        b2.withdraw(200000.88);
        b2.displayAccountInfo();
    }
}
