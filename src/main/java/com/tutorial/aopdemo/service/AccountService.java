package com.tutorial.aopdemo.service;

public class AccountService {

    public void einzahlung(double amount) {
        System.out.println("Einzahlungsbetrag: " + amount);
    }

    public void abhebung(double amount) {
        System.out.println("Abhebungsbetrag: " + amount);
    }
}
