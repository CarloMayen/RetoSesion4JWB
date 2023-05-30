package neyam.currencies.exception;

public class CurrencyAlreadyExistsException extends RuntimeException{
    private String currency;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
