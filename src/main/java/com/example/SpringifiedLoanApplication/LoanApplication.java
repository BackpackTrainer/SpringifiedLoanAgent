package com.example.SpringifiedLoanApplication;

public class LoanApplication implements ILoanApplication {

    private String ssn;
    public String getSSN() {
        return "dummy ssn";
    }
    public String setSSN(String ssn) {
        this.ssn = ssn;
        return ssn;
    }

}
