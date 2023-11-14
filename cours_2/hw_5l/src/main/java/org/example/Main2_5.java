package org.example;

import org.example.exceptions.WrongLoginException;
import org.example.exceptions.WrongPasswordException;

import java.util.regex.Pattern;

public class Main2_5 {
    public static void main(String[] args) {
        authorization("java_skpro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        System.out.println("True");
    }

    private static void authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        validateLogin(login);
        validatePassword(password, confirmPassword);
    }

    private static void validateLogin(String login) {
        if (login.length() > 20) {
            throw new WrongLoginException();
        } else {
            String regex = "^[a-zA-Z0-9_]+$";
            if (!Pattern.matches(regex, login)) {
                throw new WrongLoginException();
            }
        }
    }

    private static void validatePassword(String password, String confirmPassword) {
        if (password.length() > 20) {
            throw new WrongPasswordException();
        } else {
            String regex = "^[a-zA-Z0-9_]+$";
            if (!Pattern.matches(regex, password) || !(password.equals(confirmPassword))) {
                throw new WrongPasswordException();
            }
        }
    }
}
