package neyam.currencies.models;

import jakarta.validation.constraints.NotBlank;

public class Exchange {
    @NotBlank
    private float amount;
    @NotBlank
    private String currencyFrom;
    @NotBlank
    private String currencyTo;

    public Exchange() {
    }

    public Exchange(float amount, String currencyFrom, String currencyTo) {
        this.amount = amount;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }
}
