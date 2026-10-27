package bank;

import java.time.*;
import java.time.format.DateTimeFormatter;

/**
 * Transaction
 * Transaction class represents a bank transaction with details such as type,
 * amount, and timestamp.
 * 
 * @author Felisa Bascug
 */

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime timestamp;

    /**
     * Constructor for Transaction that initializes the type, amount, 
     * and timestamp.
     * 
     * @param type   the type of transaction (e.g., "Deposit", "Withdrawal")
     * @param amount the amount involved in the transaction
     */
    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
        this.timestamp = LocalDateTime.now();
    }

    /**
     * Returns the amount deposited or withdrawn during the transaction.
     * 
     * @return the amount involved in the transaction
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Returns a string representation of the transaction.
     * 
     * @return a string containing the type, amount, and timestamp of the
     *         transaction
     */
    @Override
    public String toString() {
        // Format Date
        DateTimeFormatter formatter = DateTimeFormatter.
                ofPattern("yyyy-MM-dd HH:mm");
        String formatted = timestamp.format(formatter);

        return "Transaction[type=" + type + ", amount=" + amount + 
                ", timestamp=" + formatted + "]";
    }

}
