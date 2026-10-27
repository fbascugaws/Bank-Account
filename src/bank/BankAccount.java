package bank;

import java.util.*;
import exception.*;

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
    private List<Transaction> transactionHistory;
    public static final String INVALID_AMOUNT = "Invalid amount. Must be greater than 0.";
    public static final String ACCOUNT_FROZEN = "Account is FROZEN. Unable to transact.";
    public static final String INSUFFICIENT_FUNDS = "Insufficient balance.";

    /**
     * Constructor for BankAccount that initializes the balance and frozen
     * status.
     * Default balance is set to 0 and the account is not frozen.
     * ArrayList is initialized to store the transaction history.
     */
    public BankAccount() {
        this.balance = 0;
        this.isFrozen = false;
        this.transactionHistory = new ArrayList<>();
    }

    /**
     * Deposits money into the account.
     * 
     * @param amount the amount to deposit
     */
    public void deposit(double amount) throws InvalidAmountException, AccountFrozenException {
        System.out.printf("Amount deposited: %.2f\n", amount);

        try {
            if (amount <= 0) {
                throw new InvalidAmountException(INVALID_AMOUNT);
            }
            if (this.isFrozen()) {
                throw new AccountFrozenException(ACCOUNT_FROZEN);
            }

            balance += amount;
            transactionHistory.add(new Transaction("Deposit", amount));
            System.out.printf("Current balance: %.2f\n", balance);

        } catch (InvalidAmountException e) {
            System.err.println(e.getMessage());

        } catch (AccountFrozenException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Withdraws money from the account.
     * 
     * @param amount the amount to withdraw
     */
    public void withdraw(double amount) throws InvalidAmountException,
            InsufficientFundsException, AccountFrozenException {
        System.out.printf("Amount withdrawn: %.2f\n", amount);

        try {
            if (amount <= 0) {
                throw new InvalidAmountException(INVALID_AMOUNT);
            } else if (amount > balance) {
                throw new InsufficientFundsException(INSUFFICIENT_FUNDS);
            }
            if (this.isFrozen()) {
                throw new AccountFrozenException(ACCOUNT_FROZEN);
            }

            transactionHistory.add(new Transaction("Withdrawal", amount));
            balance -= amount;
            System.out.printf("Current balance: %.2f\n", balance);

        } catch (InvalidAmountException e) {
            System.err.println(e.getMessage());

        } catch (InsufficientFundsException e) {
            System.err.println(e.getMessage());
            System.out.printf("Current balance: %.2f\n", balance);

        } catch (AccountFrozenException e) {
            System.err.println(e.getMessage());

        }
        // finally {
        // System.out.printf("Current balance: %.2f\n", balance);
        // }
    }

    /**
     * Returns the current balance of the account.
     * 
     * @return the current balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the transaction history of the account.
     * 
     * @return a list of transactions
     */
    public List<Transaction> getTransactionHistory() {
        return transactionHistory;
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
     * 
     * @return true if the account is frozen, false otherwise
     */
    public boolean isFrozen() {
        return isFrozen;
    }
}
