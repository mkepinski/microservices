package microservices.currencyexchangeservice.controller;

import microservices.currencyexchangeservice.model.Currency;
import microservices.currencyexchangeservice.model.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retrieveExchangeValue(@PathVariable Currency from, @PathVariable Currency to) {
        CurrencyExchange currencyExchange = new CurrencyExchange(1L, from, to, new BigDecimal("65.0"), "");
        currencyExchange.setEnvironment(String.valueOf(port));
        return currencyExchange;
    }
}
