package com.tutorial.aopdemo.console;

import com.tutorial.aopdemo.service.AccountService;

public class Account_Main {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();
        accountService.einzahlung(1000);
        accountService.abhebung(500);
    }
}
