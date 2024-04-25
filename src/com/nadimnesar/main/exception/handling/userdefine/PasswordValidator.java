package com.nadimnesar.main.exception.handling.userdefine;

public class PasswordValidator {
    public static void main(String[] args) {
        String pass = "124";
        try {
            boolean isValid = isPasswordValid(pass);
            System.out.println(isValid);
        } catch (PasswordValidatorException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean isPasswordValid(String password) throws PasswordValidatorException {
        if (password.isEmpty()) {
            throw new PasswordValidatorException("Password can't be empty");
        } else if (password.length() < 6) {
            throw new PasswordValidatorException("Password length can't be less than 6");
        } else if (password.length() > 16) {
            throw new PasswordValidatorException("Password length can't be more than 16");
        }
        return true;
    }
}