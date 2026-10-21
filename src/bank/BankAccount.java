package bank;

public class BankAccount {
    // Fields
    private double balance;
    private boolean isFrozen; 

    // Constructor
    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    // Methods
    public void deposit(double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.");
            System.out.println("Unable to transact.");
            return;
        } 
        
        System.out.println("Amount deposited:\n" + amount);
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            System.out.println("Unable to transact.");
        } else {
            balance += amount;
            System.out.println("Current balance:\n" + balance);
        }
    }

    public void withdraw(double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.");
            System.out.println("Unable to transact.");
            return;
        } 
        
        System.out.println("Amount withdrawn:\n" + amount);
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            System.out.println("Unable to transact.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
            System.out.println("Unable to transact.");
        } else {
            balance -= amount;
            System.out.println("Current balance:\n" + balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void freezeAccount() {
        isFrozen = true;
    }

    public void unfreezeAccount() {
        isFrozen = false;
    }

    public boolean isFrozen() {
        return isFrozen;
    }
}
