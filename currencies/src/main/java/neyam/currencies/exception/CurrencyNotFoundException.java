package neyam.currencies.exception;

public class CurrencyNotFoundException extends RuntimeException{
    private String currency;

    public CurrencyNotFoundException(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

}
