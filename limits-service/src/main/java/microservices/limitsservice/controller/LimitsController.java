package microservices.limitsservice.controller;

import microservices.limitsservice.configuration.Configuration;
import microservices.limitsservice.model.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits limits() {
        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}
