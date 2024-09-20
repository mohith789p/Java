// Abstract class BankAccount
abstract class BankAccount {
    protected double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(int amount);
}

// Class SavingsAccount
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    @Override
    void deposit(int amount) {
        balance += amount;
        balance += (balance * interestRate / 100); // add interest
    }
}

// Class CheckingAccount
class CheckingAccount extends BankAccount {
    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    void deposit(int amount) {
        balance += amount;
        System.out.println(amount + " is deposited to your account");
    }
}

// Main class
public class BankAccountInheritance {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(25000, 5);
        savingsAccount.deposit(1000);
        System.out.println("Savings account balance: " + savingsAccount.balance);

        CheckingAccount checkingAccount = new CheckingAccount(0);
        checkingAccount.deposit(500);
    }
}