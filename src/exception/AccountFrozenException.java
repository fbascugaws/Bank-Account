package exception;

public class AccountFrozenException extends Exception {
    private String message;
    
    /**
     * Constructs a new AccountFrozenException 
     * with the specified detail message.
     *
     * @param message the detail message explaining 
     *      the reason for the exception
     */
    public AccountFrozenException(String message) {
        this.message = message;
    }

    /**
     * Returns the detail message explaining that the account was frozen.
     * 
     * @return the exception message
     */
    public String getMessage() {
        return message;
    }

}
