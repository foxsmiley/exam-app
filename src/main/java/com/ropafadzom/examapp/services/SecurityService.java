package com.ropafadzom.examapp.services;

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
