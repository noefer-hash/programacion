package com.example;
import java.util.Scanner;

public class CalcularEdad {

    // Variable global para el año actual
    static int añoActual = 2024;

    // Función para calcular la edad
    public static int calcularEdad(int añoNacimiento) {
        return añoActual - añoNacimiento;
    }

    // Función para determinar si es mayor de edad
    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el año de nacimiento al usuario
        System.out.print("Ingrese su año de nacimiento:1997 ");
        int añoNacimiento = scanner.nextInt();

        // Validar que el año de nacimiento no sea mayor al año actual
        if (añoNacimiento > añoActual) {
            System.out.println("El año de nacimiento no puede ser mayor que el año actual.");
            return;
        }

        // Calcular la edad del usuario
        int edad = calcularEdad(añoNacimiento);

        // Solicitar la edad concreta que desea comparar
        System.out.print("Ingrese una edad con la que desee comparar: ");
        int edadComparada = scanner.nextInt();

        // Mostrar la edad del usuario
        System.out.println("Tiene " + edad + " años.");

        // Mostrar si es mayor de edad o no
        if (esMayorDeEdad(edad)) {
            System.out.println("Es mayor de edad.");
        } else {
            System.out.println("Es menor de edad.");
        }

        // Mensaje especial si la edad es igual a la ingresada
        if (edad == edadComparada) {
            System.out.println("¡Tienes exactamente " + edadComparada + " años!");
        }

        scanner.close();
    }
}
