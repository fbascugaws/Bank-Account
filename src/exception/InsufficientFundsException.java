package exception;

/**
 * InsufficientFundsException
 * Exception class for handling withdrawal transactions 
 * with insufficient funds.
 * 
 * @author Felisa Bascug
 */

public class InsufficientFundsException extends Exception {
    private String message;

    /**
     * Constructs a new InsufficientFundsException 
     * with the specified detail message.
     *
     * @param message the detail message explaining 
     *      the reason for the exception
     */
    public InsufficientFundsException(String message) {
        this.message = message;
    }

    /**
     * Returns the detail message explaining why the funds were insufficient.
     * 
     * @return the exception message
     */
    public String getMessage() {
        return message;
    }

}
