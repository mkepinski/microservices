package microservices.limitsservice.configuration;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@org.springframework.context.annotation.Configuration
@ConfigurationProperties("limits-service")
@Setter
@Getter
public class Configuration {
    private int minimum;
    private int maximum;
}
