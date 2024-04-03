package com.tutorial.aopdemo.console;


import com.tutorial.aopdemo.service.KontoService;

public class Konto_Main {

    public static void main(String[] args) {
        KontoService kontoService = new KontoService();
        kontoService.abhebung(5);
    }
}
