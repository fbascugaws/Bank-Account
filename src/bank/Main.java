package bank;

/**
 * Main
 * Demonstrates the polymorphism (upcasting) and invokes functions.
 * 
 * @author Felisa Bascug
 */

public class Main {
    public static void main(String[] args) {
        // EXERCISE 1
        System.out.println("=== EXERCISE 1 TEST CASES ===");

        // 1
        System.out.println("Test Case 1");
        BankAccount acc1 = new SavingsAccount("Test0");
        System.out.println("Account Owner: " + ((SavingsAccount) acc1)
            .getOwnerName() + ".");

        // 2
        System.out.println("\nTest Case 2");
        acc1.deposit(1000.125);

        // 3
        System.out.println("\nTest Case 3");
        acc1.deposit(0);

        // 4
        System.out.println("\nTest Case 4");
        acc1.deposit(-500);

        // 5
        System.out.println("\nTest Case 5");
        acc1.withdraw(500);

        // 6
        System.out.println("\nTest Case 6");
        acc1.withdraw(1500);

        // 7
        System.out.println("\nTest Case 7");
        acc1.withdraw(-100);

        // 8
        System.out.println("\nTest Case 8");
        acc1.freezeAccount();
        acc1.deposit(11500);

        // 9
        System.out.println("\nTest Case 9");
        acc1.withdraw(500);

        // 10
        System.out.println("\nTest Case 10");
        acc1.unfreezeAccount();
        acc1.withdraw(100);

        // EXERCISE 2
        System.out.println("\n=== EXERCISE 2 TEST CASES ===");

        // 1
        System.out.println("Test Case 1");
        System.out.println("Transaction history:");
        for (Transaction t : acc1.getTransactionHistory()) {
            System.out.println(t);
        }

        // 2
        System.out.println("\nTest Case 2");
        BankAccountManager accM1 = new BankAccountManager();
        if (accM1 != null) {
            System.out.println("Bank Account Manager created");
        }

        // 3
        System.out.println("\nTest Case 3");
        accM1.addAccount(acc1);

        // 4
        System.out.println("\nTest Case 4");
        accM1.addAccount(new SavingsAccount("Test1"));

        // 5
        System.out.println("\nTest Case 5");
        accM1.listAccounts();

        // EXERCISE 3
        System.out.println("\n=== EXERCISE 3 TEST CASES ===");
        
        // 1
        System.out.println("Test Case 1");

        // 2
        System.out.println("\nTest Case 2");

        // 3
        System.out.println("\nTest Case 3");

        // 4
        System.out.println("\nTest Case 4");
        
        // 5
        System.out.println("\nTest Case 5");

        // 6
        System.out.println("\nTest Case 6");

        // 7
        System.out.println("\nTest Case 7");
    }
}
