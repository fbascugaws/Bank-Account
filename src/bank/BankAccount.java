package bank;

/**
 * BankAccount
 * BankAccount class represents a bank account with basic functionalities:
 * depositing, withdrawing, and account freezing.
 * 
 * @author Felisa Bascug
 */

public class BankAccount {
    private double balance;
    private boolean isFrozen; 

    /**
     * Constructor for BankAccount that initializes the balance and frozen status.
     * Default balance is set to 0 and the account is not frozen.
     */
    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
    }

    /**
     * Deposits money into the account.
     * @param amount the amount to deposit
     */
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

    /**
     * Withdraws money from the account.
     * @param amount the amount to withdraw
     */
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

    /**
     * Returns the current balance of the account.
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Freezes the account, preventing any transactions.
     */
    public void freezeAccount() {
        isFrozen = true;
    }

    /**
     * Unfreezes the account, allowing transactions again.
     */
    public void unfreezeAccount() {
        isFrozen = false;
    }

    /**
     * Checks if the account is frozen.
     * @return true if the account is frozen, false otherwise
     */
    public boolean isFrozen() {
        return isFrozen;
    }
}
