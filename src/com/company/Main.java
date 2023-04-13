package com.company;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        acronimo();
    }

    public static String acronimo() {
        System.out.println("Introduce una frase para crear su acronimo:");
        String frase = sc.nextLine();
        String[] palabras = frase.split("\\s+");
        StringBuilder acronimo = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.equalsIgnoreCase("y") &&
                    !palabra.equalsIgnoreCase("de") &&
                    !palabra.equalsIgnoreCase("del")) {
                acronimo.append(palabra.charAt(0));
            }
        }
        System.out.println("El acronimo de \"" + frase + "\" es: " + acronimo.toString().toUpperCase());
        return acronimo.toString().toUpperCase();
    }
}
