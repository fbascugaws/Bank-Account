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
        
        System.out.printf("Amount deposited: %.2f\n", amount);
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
        } else {
            balance += amount;
            System.out.printf("Current balance: %.2f\n", balance);
        }
    }

    public void withdraw(double amount) {
        if (isFrozen) {
            System.out.println("Account is FROZEN.");
            System.out.println("Unable to transact.");
            return;
        } 
        
        System.out.printf("Amount withdrawn: %.2f\n", amount);
        if (amount <= 0) {
            System.out.println("Invalid amount. Must be greater than 0.");
            return;
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
        System.out.printf("Current balance: %.2f\n", balance);
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
