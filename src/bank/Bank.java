package bank;

/**
 * Bank
 * Blueprint for BankAccountManager class.
 * 
 * @author Felisa Bascug
 */

public interface Bank {
    public void addAccount(BankAccount account);
    public BankAccount getAccount(int id);
}
