package bank;

import java.util.*;

/**
 * BankAccountManager
 * Allows a bank account transaction, withdraw or deposit, amount, and the time
 * stamp to be recorded using List.
 */

public class BankAccountManager implements Bank {
    private Map<Integer, BankAccount> accounts;
    private int id;

    /**
     * Constructor for BankAccountManager that initializes accounts and id.
     */
    public BankAccountManager() {
        this.accounts = new HashMap();
        this.id = 0;
    }

    /**
     * An account gets stored in the Map interface and the id increments.
     * The maximum limit of created accounts is 100.
     */
    @Override
    public void addAccount(BankAccount account) {
        if (id >= 100) {
            System.out.println("Account creation limit reached.");
            return;
        }

        accounts.put(id, account);
        System.out.println("Account added successfully with ID: " + id);
        id++;
    }

    /**
     * Returns the account of a specific id.
     */
    @Override
    public BankAccount getAccount(int id) {
        return accounts.get(id);
    }

    /**
     * Display all bank accounts (ID and owner’s name) stored in the system along
     * with their balances.
     */
    public void listAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            SavingsAccount a = (SavingsAccount) getAccount(i);
            System.out.println(
                    "Account ID: " + i + ", Account Name: " + a.getOwnerName() + ", Balance: "
                            + String.format("%.2f", a.getBalance()));
        }
    }
}
