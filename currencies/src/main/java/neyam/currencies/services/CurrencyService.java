package neyam.currencies.services;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import neyam.currencies.models.Currency;
import neyam.currencies.models.Exchange;

@Service
public class CurrencyService {

    private Map<String, Currency> wallet;

    public CurrencyService() {
        wallet = new HashMap<String, Currency>();

        wallet.put("USD", new Currency("USD", 1));
        wallet.put("MXN", new Currency("MXN", 17.63f));
        wallet.put("EUR", new Currency("EUR", 0.93f));
        wallet.put("CAD", new Currency("CAD", 1.36f));
    }

    public List<Currency> getAll() {
        return new LinkedList<Currency>(wallet.values());
    }

    public Currency exchange(Exchange exch) {
        float newAmount = exch.getAmount()*wallet.get(exch.getCurrencyTo().toUpperCase()).getValuesToOne()/wallet.get(exch.getCurrencyFrom().toUpperCase()).getValuesToOne();
        return new Currency(exch.getCurrencyTo().toUpperCase(), newAmount);
    }
}
