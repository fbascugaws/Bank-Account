package bank;

public class Main {
    public static void main(String[] args) {
        // TC-1 
        System.out.println("Test Case 1");
        BankAccount acc1 = new SavingsAccount("Test0");

        // TC-2
        System.out.println("\nTest Case 2");
        acc1.deposit(100.125);
    }
}
