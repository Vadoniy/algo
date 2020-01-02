package ru.algo.lection2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.algo.lection2.factors.FactorsService;

@Configuration
public class FactorsConfig {

    @Bean(name = "factors")
    public FactorsService factorsFinder() {
        return new FactorsService();
    }
}
