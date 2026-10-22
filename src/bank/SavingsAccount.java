package bank;

/**
 * SavingsAccount
 * Child class of BankAccount representing a savings account with additional functionality:
 * initializing account owner.
 * 
 * @author Felisa Bascug
 */

public class SavingsAccount extends BankAccount {
    private String ownerName;

    /**
     * Constructor for SavingsAccount that initializes the account owner.   
     * @param ownerName the name of the account owner
     */
    public SavingsAccount(String ownerName) {
        super();
        this.ownerName = ownerName;
        System.out.println("Account Owner: " + ownerName + ".");
    }

    /**
     * Returns the name of the account owner.
     * @return
     */
    public String getOwnerName() {
        return ownerName;
    }
}
