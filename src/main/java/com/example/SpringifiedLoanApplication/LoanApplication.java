package com.example.SpringifiedLoanApplication;

import java.util.ArrayList;
import java.util.List;

public class LoanApplication implements ILoanApplication{

    SocialSecurity socialSecurity= new SocialSecurity();
    private  String socialSecurityNumber ="";
    public String getSSN() {
        if (socialSecurityNumber.equals(socialSecurity.ListOfSSN()))
            return socialSecurityNumber;
        return null;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
