package com.example.SpringifiedLoanApplication;

import java.util.ArrayList;
import java.util.List;

public class LoanApplication implements ILoanApplication{

    SocialSecurity socialSecurity= new SocialSecurity();
    public String getSSN() {

        return socialSecurity.ListOfSSN().toString();
    }


}
