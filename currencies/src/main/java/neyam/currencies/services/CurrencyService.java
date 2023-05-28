package neyam.currencies.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import neyam.currencies.models.Currency;
import neyam.currencies.models.Exchange;
import neyam.currencies.utils.ExchangeFuncional;

@Service
public class CurrencyService {

    private Map<String, Currency> wallet;
    private final ExchangeFuncional exchg = item -> new Currency(item.getCurrencyTo().toUpperCase(),
            item.getAmount() * wallet.get(item.getCurrencyTo().toUpperCase()).getValuesToOne()
                    / wallet.get(item.getCurrencyFrom().toUpperCase()).getValuesToOne());

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

    public List<Currency> getAllExchangesById(String currency) {
        List<Currency> result = new LinkedList<Currency>();
        for (Map.Entry item : wallet.entrySet()) {
            if (item.getKey().equals(currency.toUpperCase()))
                continue;

            result.add(exchg.exchange(new Exchange(1f, currency.toUpperCase(), (String) item.getKey())));
        }
        return result;
    }

    public Currency exchange(Exchange exch) {
        return exchg.exchange(exch);
    }
}
