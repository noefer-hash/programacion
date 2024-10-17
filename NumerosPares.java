package com.example;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; // Controla si se repite el proceso

        while (continuar) {
            int numero;

            // Solicitar un número válido
            while (true) {
                System.out.print("Ingrese un número entero positivo: ");
                numero = scanner.nextInt();
                
                // Validar el número ingresado
                if (numero > 0) {
                    break; // Salir del bucle si el número es válido
                } else {
                    System.out.println("Por favor, ingrese un número positivo mayor que cero.");
                }
            }

            int sumaPares = 0;
            int contadorPares = 0;

            // Iterar desde 1 hasta el número ingresado
            for (int i = 1; i <= numero; i++) {
                // Verificar si el número es par
                if (i % 2 == 0) {
                    System.out.println(i); // Imprimir el número par
                    sumaPares += i;       // Sumarlo a la suma total
                    contadorPares++;      // Incrementar el contador
                } else {
                    // Imprimir que el número no es par
                    System.out.println(i + " no es un número par.");
                }
            }

            // Imprimir resultados
            System.out.println("Suma total de los números pares: " + sumaPares);
            System.out.println("Cantidad de números pares encontrados: " + contadorPares);

            // Preguntar si desea continuar
            System.out.print("¿Desea repetir el proceso? (si/no): ");
            String respuesta = scanner.next().toLowerCase();
            if (!respuesta.equals("si")) {
                continuar = false; // Salir del bucle si la respuesta es diferente de "si"
            }
        }

        System.out.println("Gracias por usar el programa. ¡Hasta luego!");
        scanner.close();
    }
}
