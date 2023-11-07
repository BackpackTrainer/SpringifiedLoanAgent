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
        return  loanApplication;
    }

    @Bean (name= "loanAgent")
    public boolean getLoanAgentResult() throws InvalidCreditScoreException {
        LoanAgent agent = new LoanAgent();
        LoanApplication loanApplication = new LoanApplication();
        agent.setAgency(getTRWCreditAgency());
        agent.setMinimumCreditScore(agent.getMinimumCreditScore());
        //agent.processLoanApplication(loanApplication);
        return agent.processLoanApplication(loanApplication);
    }



}
