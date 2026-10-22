package bank;

import java.util.*;

/** 
 * BankAccountManager
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

    /**    (non-Javadoc)
     * 
     * @see bank.Bank#addAccount(bank.BankAccount)
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

    /**    (non-Javadoc)
     * 
     * @see bank.Bank#getAccount(int)
     */
    @Override
    public BankAccount getAccount(int id) {
        return accounts.get(id);
    }

    /**
     * 
     */
    public void listAccounts() {
        // TODO iterate thru list accounts
    }
}
