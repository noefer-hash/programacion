package com.example;

import java.util.Scanner;

public class ConversorMonedas {

    // Definimos las tasas de cambio como constantes
    static final double DOLAR_A_EURO = 0.85;
    static final double DOLAR_A_PESO = 20.0;
    static final double EURO_A_DOLAR = 1.18;
    static final double EURO_A_PESO = 23.50;
    static final double PESO_A_DOLAR = 0.05;
    static final double PESO_A_EURO = 0.042;

    public static void main(String[] args) {
        // Creamos un escáner para leer las entradas del usuario
        Scanner scanner = new Scanner(System.in);
        int opcionSeleccionada;

        // Ciclo que mantiene el menú activo hasta que el usuario elija salir
        do {
            mostrarMenu();  // Mostramos el menú de opciones
            opcionSeleccionada = scanner.nextInt();  // Leemos la opción seleccionada por el usuario

            // Validamos si la opción está dentro del rango permitido (1 a 6)
            if (opcionSeleccionada >= 1 && opcionSeleccionada <= 6) {
                System.out.print("Por favor, introduce la cantidad a convertir: ");
                double cantidad = validarCantidad(scanner);  // Validamos que la cantidad ingresada sea válida
                double resultado = 0;  // Variable para almacenar el resultado de la conversión
                String monedaDestino = "";  // Variable para la moneda de destino

                // Realizamos la conversión dependiendo de la opción seleccionada
                switch (opcionSeleccionada) {
                    case 1: // De Dólares a Euros
                        resultado = cantidad * DOLAR_A_EURO;
                        monedaDestino = "Euros";
                        break;
                    case 2: // De Dólares a Pesos Mexicanos
                        resultado = cantidad * DOLAR_A_PESO;
                        monedaDestino = "Pesos Mexicanos";
                        break;
                    case 3: // De Euros a Dólares
                        resultado = cantidad * EURO_A_DOLAR;
                        monedaDestino = "Dólares";
                        break;
                    case 4: // De Euros a Pesos Mexicanos
                        resultado = cantidad * EURO_A_PESO;
                        monedaDestino = "Pesos Mexicanos";
                        break;
                    case 5: // De Pesos Mexicanos a Dólares
                        resultado = cantidad * PESO_A_DOLAR;
                        monedaDestino = "Dólares";
                        break;
                    case 6: // De Pesos Mexicanos a Euros
                        resultado = cantidad * PESO_A_EURO;
                        monedaDestino = "Euros";
                        break;
                }

                // Mostramos el resultado de la conversión con un formato amigable
                System.out.printf("%.2f unidades equivalen a %.2f %s.%n", cantidad, resultado, monedaDestino);

            } else if (opcionSeleccionada != 7) {  // Si el usuario elige una opción no válida
                System.out.println("Opción no válida, por favor elige un número entre 1 y 7.");
            }

        } while (opcionSeleccionada != 7);  // Salimos cuando la opción seleccionada sea 7

        System.out.println("Gracias por usar el conversor de monedas. ¡Hasta la próxima!");
        scanner.close();  // Cerramos el scanner para liberar los recursos
    }

    // Método que muestra el menú con opciones de conversión
    private static void mostrarMenu() {
        System.out.println("\n***** Conversor de Monedas *****");
        System.out.println("1. Convertir de Dólares a Euros");
        System.out.println("2. Convertir de Dólares a Pesos Mexicanos");
        System.out.println("3. Convertir de Euros a Dólares");
        System.out.println("4. Convertir de Euros a Pesos Mexicanos");
        System.out.println("5. Convertir de Pesos Mexicanos a Dólares");
        System.out.println("6. Convertir de Pesos Mexicanos a Euros");
        System.out.println("7. Salir del programa");
        System.out.print("Por favor, elige una opción (1-7): ");
    }

    // Método que valida que la cantidad introducida sea mayor a 0
    private static double validarCantidad(Scanner scanner) {
        double cantidad;
        while (true) {
            cantidad = scanner.nextDouble();  // Leemos la cantidad ingresada por el usuario
            if (cantidad > 0) {  // Si la cantidad es mayor que 0, es válida
                break;
            } else {  // Si la cantidad no es válida, pedimos al usuario que lo intente nuevamente
                System.out.print("La cantidad debe ser mayor que 0. Por favor, introduce una cantidad válida: ");
            }
        }
        return cantidad;  // Devolvemos la cantidad válida
    }
}
