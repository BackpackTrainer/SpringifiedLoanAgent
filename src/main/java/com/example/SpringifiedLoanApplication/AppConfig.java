

package com.example.SpringifiedLoanApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private static final int minimumCreditScore = 720;

    @Bean(name = "trw")
    public ICreditAgency getTRW(){
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
