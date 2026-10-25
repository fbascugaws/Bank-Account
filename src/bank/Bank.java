package bank;

/**
 * Bank
 * Blueprint for BankAccountManager class.
 */

public interface Bank {
    public void addAccount(BankAccount account);

    public BankAccount getAccount(int id);
}
