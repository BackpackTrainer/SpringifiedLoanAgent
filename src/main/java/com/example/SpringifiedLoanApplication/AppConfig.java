package com.example.SpringifiedLoanApplication;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "trw")
    public ICreditAgency getTRW(){
        TRWCreditAgency trwCreditAgency = new TRWCreditAgency();
        return trwCreditAgency;
    }

}
