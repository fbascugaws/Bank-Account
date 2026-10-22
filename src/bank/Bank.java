package bank;

/** 
 * Bank
 */

public interface Bank {
    public void addAccount(BankAccount account);
    public BankAccount getAccount(int id);
}
