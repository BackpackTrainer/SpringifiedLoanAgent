package com.example.SpringifiedLoanApplication;
public class TRWCreditAgency implements ICreditAgency {
        @Override
        public int getCreditScore(String ssn) {
            return switch (ssn) {
                case "111-11-1111" -> 719;
                case "333-33-3333" -> 721;
                case "444-44-4444" -> 850;
                case "999-99-9999" -> 851;
                case "555-55-5555" -> 200;
                case "222-22-2222" -> 199;
                default -> -1; // Default case for unknown SSN
            };
        }

    }
