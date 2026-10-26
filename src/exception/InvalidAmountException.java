package exception;

public class InvalidAmountException extends Exception {
    private String message;
    
    /**
     * Constructs a new InvalidAmountException 
     * with the specified detail message.
     *
     * @param message the detail message explaining 
     *      the reason for the exception
     */
    public InvalidAmountException(String message) {
        this.message = message;
    }

    /**
     * Returns the detail message explaining why the amount was invalid.
     * 
     * @return the exception message
     */
    public String getMessage() {
        return message;
    }
}
