package com.tutorial.aopdemo.service;

public class KontoService {
    int kontoStand = 20;

    public boolean abhebung(int betrag) {
        if (kontoStand < betrag) {
            return false;
        } else if (betrag < 0) {
            throw new IllegalArgumentException("Der Betrag darf nicht negativ sein.");
        } else {
            kontoStand = kontoStand - betrag;
            return true;
        }
    }

    public int getKontoStand() {
        return kontoStand;
    }

    public void setKontoStand(int kontoStand) {
        this.kontoStand = kontoStand;
    }
}
