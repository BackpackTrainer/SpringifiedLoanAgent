package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class AppConfig {

    private static final int minimumCreditScore = 720;
    @Bean
    public ICreditAgency trwCreditAgency() {
        return new TRWCreditAgency();
    }

    @Bean
    public LoanAgent loanAgent(ICreditAgency creditAgency) {
        LoanAgent agent = new LoanAgent();
        agent.setAgency(creditAgency);
        agent.setMinimumCreditScore(minimumCreditScore);
        return agent;
    }
}
