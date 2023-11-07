

package com.example.SpringifiedLoanApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    private static final int minimumCreditScore = 720;

    @Bean(name = "trw")
    public ICreditAgency creditAgency(){
        return new TRWCreditAgency();
    }


    @Bean(name="loanAgent")
    public LoanAgent loanAgent(ICreditAgency creditAgency, IErrorLog errorLog) {
        LoanAgent agent = new LoanAgent(creditAgency, errorLog);
        agent.setAgency(creditAgency);
        agent.setMinimumCreditScore(minimumCreditScore);
        return agent;
    }

    @Bean
    public IErrorLog errorLog() {
        return new ConsoleErrorLog();
    }

}
