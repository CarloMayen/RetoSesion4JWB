package neyam.currencies.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import neyam.currencies.models.Currency;
import neyam.currencies.models.Exchange;
import neyam.currencies.services.CurrencyService;

@RestController
@RequestMapping("currencies")
public class CurrencyController {
    @Autowired
    CurrencyService currencyServ;

    CurrencyController (CurrencyService currencyServ){
        this.currencyServ = currencyServ;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Currency> getAllCurrencies(){
        return currencyServ.getAll();
    }

    @GetMapping("{id}")
    public List<Currency> getAllRatesById(@PathVariable("id") String currencyId){
        return currencyServ.getAllExchangesById(currencyId);
    }

    @PostMapping("exchange")
    public Currency exchange(@Valid @RequestBody Exchange exch){
        return currencyServ.exchange(exch);
    }
}