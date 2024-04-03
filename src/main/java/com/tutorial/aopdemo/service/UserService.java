package com.tutorial.aopdemo.service;

public class UserService {

    public void createUser(String username, String password) {
        System.out.println("Benutzer wird erstellt: " + username);
    }

    public void updateUser(String username) {
        System.out.println("Benutzer wird aktualisiert: " + username);
    }

    public void deleteUser(String username) {
        System.out.println("Benutzer wird gelöscht: " + username);
    }
}
