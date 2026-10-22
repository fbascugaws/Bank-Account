package bank;

/**
 * Main
 * Demonstrates the polymorphism (upcasting) and invokes functions. 
 */

public class Main {
    public static void main(String[] args) {
        // Test Case 1 
        System.out.println("Test Case 1");
        BankAccount acc1 = new SavingsAccount("Test0");

        // Test Case 2
        System.out.println("\nTest Case 2");
        acc1.deposit(1000.125);

        // Test Case 3
        System.out.println("\nTest Case 3");
        acc1.deposit(0);

        // Test Case 4
        System.out.println("\nTest Case 4");
        acc1.deposit(-500);

        // Test Case 5
        System.out.println("\nTest Case 5");
        acc1.withdraw(500);

        // Test Case 6
        System.out.println("\nTest Case 6");
        acc1.withdraw(1500);

        // Test Case 7
        System.out.println("\nTest Case 7");
        acc1.withdraw(-100);

        // Test Case 8
        System.out.println("\nTest Case 8");
        acc1.freezeAccount();
        acc1.deposit(11500);

        // Test Case 9
        System.out.println("\nTest Case 9");
        acc1.withdraw(500);

        // Test Case 10
        System.out.println("\nTest Case 10");
        acc1.unfreezeAccount();
        acc1.withdraw(100);
    }
}
