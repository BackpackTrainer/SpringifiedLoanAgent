package com.example.SpringifiedLoanApplication;

import java.util.ArrayList;
import java.util.List;

public class LoanApplication implements ILoanApplication{

    SocialSecurity socialSecurity= new SocialSecurity();
    private  String socialSecurityNumber ="111-11-1111";
    public String getSSN() {
//        if (socialSecurityNumber.equals(socialSecurity.listOfSSN()))
//            return socialSecurityNumber;
//        else{
//            return null;
//        }
        return socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
