package com.calculator.calculator;

public class CredentialsValidator {
    
    public static void validateCredentials(String login, String password, String confirmPassword) {
        try {
            // Проверка логина
            if (!login.matches("[a-zA-Z0-9_]+") || login.length() > 20) {
                throw new WrongLoginException("Недопустимый логин");
            }
            
            // Проверка пароля
            if (!password.matches("[a-zA-Z0-9_]+") || password.length() > 20) {
                throw new WrongPasswordException("Недопустимый пароль");
            }
            
            // Проверка совпадения пароля и подтверждения пароля
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Пример использования
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";

        validateCredentials(login, password, confirmPassword);
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
