package com.tutorial.aopdemo.console;

import com.tutorial.aopdemo.service.UserService;

public class User_Main {

    public static void main(String[] args) {

        UserService userService = new UserService();
        userService.createUser("alice", "12345");
        userService.updateUser("alice");
        userService.deleteUser("alice");
    }
}
