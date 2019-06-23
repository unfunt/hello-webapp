package com.unfunt.helloWebapp.Services;

/**
 * Created by Vova on 23.06.2019.
 */
public class LoginService {

    private static LoginService loginService = null;

    private LoginService () {

    }

    public static LoginService getInstance () {
        if (loginService == null) {
            loginService = new LoginService();
        }
        return loginService;
    }

    public boolean checkPassword (String username, String password) {
        if (username.equals(password)) {
            return true;
        }
        return false;
    }
}
