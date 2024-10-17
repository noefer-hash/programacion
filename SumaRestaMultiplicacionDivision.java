package com.example;

import java.util.Scanner;

public class SumaRestaMultiplicacionDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double numero1, numero2;
        int opcion;

           // Bucle para permitir al usuario realizar hasta 5 operaciones
           for (int i = 0; i < 5; i++) {
            // Menú de opciones
            System.out.println("\nElige una operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");

            // Leer la opción del usuario
            System.out.print("Introduce tu opción: ");
            opcion = scanner.nextInt();

            // Si elige "Salir" (opción 5), se termina el programa
            if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            }

            // Solicitar los dos números al usuario
            System.out.print("Dame el valor del primer número: ");
            numero1 = scanner.nextDouble();
            System.out.print("Dame el valor del segundo número: ");
            numero2 = scanner.nextDouble();

            // Operaciones según la opción seleccionada
            switch (opcion) {
                case 1: // Suma
                    System.out.println("La suma de estos números es: " + (numero1 + numero2));
                    break;
                case 2: // Resta
                    System.out.println("La resta de estos números es: " + (numero1 - numero2));
                    break;
                case 3: // Multiplicación
                    System.out.println("La multiplicación de estos números es: " + (numero1 * numero2));
                    break;
                case 4: // División
                    if (numero2 != 0) {
                        System.out.println("La división de estos números es: " + (numero1 / numero2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            // Preguntar si desea realizar otra operación
            if (i < 4) { // Solo preguntar si no ha alcanzado el límite de 5 operaciones
                System.out.print("¿Deseas realizar otra operación? (sí/no): ");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("no")) {
                    System.out.println("Saliendo del programa...");
                    break;
                }
            }
        }

        scanner.close();
    }
}
/**************************************/
/* Nom: Noemi Fernanda Ramirez Holguin				*/
/* DNI/NIE: 55086944N			*/
/* Data: 25/10/2024 				*/
/* Exercici: PROU2EX02			*/
/**************************************/