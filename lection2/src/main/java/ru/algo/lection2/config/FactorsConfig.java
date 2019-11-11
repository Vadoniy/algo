package ru.algo.lection2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.algo.lection2.factors.FactorsFinder;

@Configuration
public class FactorsConfig {

    @Bean(name = "factors")
    public FactorsFinder factorsFinder() {
        return new FactorsFinder();
    }
}
