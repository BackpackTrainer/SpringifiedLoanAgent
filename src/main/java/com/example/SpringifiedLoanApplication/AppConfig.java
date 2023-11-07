package com.example.SpringifiedLoanApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name="trw")
    public TRWCreditAgency getTRWCreditAgency(){
        TRWCreditAgency trw = new TRWCreditAgency();
        return trw;
    }

    @Bean(name= "loanApplication")
    public LoanApplication getLoanApplication() {
        LoanApplication loanApplication = new LoanApplication();
        loanApplication.setSocialSecurityNumber("111-111-111");
        return  loanApplication;
    }

    @Bean (name= "loanAgent")
    public LoanAgent getLoanAgent() throws InvalidCreditScoreException {
        LoanAgent agent = new LoanAgent(getLoanApplication());
        agent.setAgency(getTRWCreditAgency());
        agent.setMinimumCreditScore(agent.getMinimumCreditScore());
        return agent;
    }



}
