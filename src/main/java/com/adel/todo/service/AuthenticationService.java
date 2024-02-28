package com.adel.todo.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean validUsername = username.equals("adel");
        boolean validPassword = password.equals("password");
        return validUsername && validPassword;
    }
}
