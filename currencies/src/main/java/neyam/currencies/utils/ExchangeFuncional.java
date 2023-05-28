package neyam.currencies.utils;

import neyam.currencies.models.Currency;
import neyam.currencies.models.Exchange;

@FunctionalInterface
public interface ExchangeFuncional {
    public Currency exchange(Exchange exchange);
}
