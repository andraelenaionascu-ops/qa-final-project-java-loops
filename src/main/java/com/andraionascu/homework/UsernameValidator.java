package com.andraionascu.homework;

import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username;
        boolean isValid = false;
        do {
            System.out.print("Introdu un username: ");
            username = scanner.nextLine();

            // 1. Verificare Lungime
            if (username.length() < 6 || username.length() > 12) {
                System.out.println("Eroare: Username-ul trebuie sa aiba intre 6 si 12 caractere.");
                continue;
            }

            boolean hasSpace = false;
            boolean hasDigit = false;

            // 2 & 3. Verificare caractere (folosind bucla FOR)
            for (int i = 0; i < username.length(); i++) {
                char c = username.charAt(i);
                if (Character.isWhitespace(c)) {
                    hasSpace = true;
                }
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }
            }

            if (hasSpace) {
                System.out.println("Eroare: Username-ul nu poate contine spatii.");
                continue;
            }

            if (!hasDigit) {
                System.out.println("Eroare: Username-ul trebuie sa contina cel putin o cifra.");
                continue;
            }

            // Daca a trecut de toate verificarile
            isValid = true;

        } while (!isValid);

        System.out.println("Username acceptat: " + username);
        scanner.close();
    }
}
