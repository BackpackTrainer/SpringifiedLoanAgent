package com.example.SpringifiedLoanApplication;

public class ConsoleErrorLog implements IErrorLog{
    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
