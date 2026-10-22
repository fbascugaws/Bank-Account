package bank;

import java.time.*;

/**
 * Transaction
 * Transaction class represents a bank transaction with details such as type, amount, and timestamp.
 * 
 * @author Felisa Bascug
 */

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    /**
     * Constructor for Transaction that initializes the type, amount, and timestamp.
     * @param type the type of transaction (e.g., "Deposit", "Withdrawal")
     * @param amount the amount involved in the transaction
     */
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Returns a string representation of the transaction.
     * @return a string containing the type, amount, and timestamp of the transaction
     */
    @Override
    public String toString() {
        return String.format("Transaction[type=%s, amount=%.2f, timestamp=%s]", type, amount, timestamp);
    }

}
