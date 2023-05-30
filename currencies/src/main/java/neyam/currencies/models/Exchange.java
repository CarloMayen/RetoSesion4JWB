package neyam.currencies.models;

import jakarta.validation.constraints.NotBlank;
import neyam.currencies.validation.AmountExchange;

public class Exchange {
    @AmountExchange
    private String amount;
    @NotBlank
    private String currencyFrom;
    @NotBlank
    private String currencyTo;

    public Exchange() {
    }

    public Exchange(String amount, String currencyFrom, String currencyTo) {
        this.amount = amount;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
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
