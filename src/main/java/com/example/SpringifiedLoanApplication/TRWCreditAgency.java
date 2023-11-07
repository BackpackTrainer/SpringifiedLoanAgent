package com.example.SpringifiedLoanApplication;

import java.util.ArrayList;
import java.util.List;

public class TRWCreditAgency implements ICreditAgency {


    @Override
    public int getCreditScore(String ssn) {

        switch (ssn) {

            case "111-11-1111":
               return  719;

            case "333-33-3333":
                return 721;
            case "444-44-4444":
                return 850;
            case "999-99-9999":
                return  851;
            case "555-55-5555":
                return 200;
            case "222-22-2222":
                return  199;
            default :
                return  750; // Default case for unknown SSN
        }
    };


}
