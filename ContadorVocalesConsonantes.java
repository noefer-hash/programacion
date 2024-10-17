package com.example;

import java.util.Scanner;

public class ContadorVocalesConsonantes {

    // Método para contar vocales
    public static int contarVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚ";
        for (int i = 0; i < frase.length(); i++) {
            if (vocales.indexOf(frase.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    // Método para contar consonantes
    public static int contarConsonantes(String frase) {
        int contador = 0;
        String consonantes = "bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ";
        for (int i = 0; i < frase.length(); i++) {
            if (consonantes.indexOf(frase.charAt(i)) != -1) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase:");
        String frase = scanner.nextLine();

        // Definimos el array con las opciones del menú
        String[] menuOpciones = {
            "Mostrar número de vocales",
            "Mostrar número de consonantes",
            "Convertir a mayúsculas",
            "Convertir a minúsculas",
            "Invertir la frase",
            "Salir"
        };

        boolean salir = false;

        // Menú de opciones
        while (!salir) {
            System.out.println("\nMenú de opciones:");
            
            // Usamos un bucle for para mostrar el menú desde el array
            for (int i = 0; i < menuOpciones.length; i++) {
                System.out.println((i + 1) + ". " + menuOpciones[i]);
            }

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Mostrar número de vocales
                    System.out.println("Número de vocales: " + contarVocales(frase));
                    break;
                case 2:
                    // Mostrar número de consonantes
                    System.out.println("Número de consonantes: " + contarConsonantes(frase));
                    break;
                case 3:
                    // Convertir a mayúsculas
                    System.out.println("Frase en mayúsculas: " + frase.toUpperCase());
                    break;
                case 4:
                    // Convertir a minúsculas
                    System.out.println("Frase en minúsculas: " + frase.toLowerCase());
                    break;
                case 5:
                    // Invertir la frase
                    String fraseInvertida = new StringBuilder(frase).reverse().toString();
                    System.out.println("Frase invertida: " + fraseInvertida);
                    break;
                case 6:
                    // Salir
                    salir = true;
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
                    break;
            }
        }

        scanner.close();
    }
}

