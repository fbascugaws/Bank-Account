package bank;

public class SavingsAccount extends BankAccount {
    // Fields
    private String ownerName;

    // Constructor
    public SavingsAccount(String ownerName) {
        super();
        this.ownerName = ownerName;
        System.out.println("Account Owner: " + ownerName + ".");
    }

    // Methods
    public String getOwnerName() {
        return ownerName;
    }
}
