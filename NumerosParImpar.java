package com.example;

import java.util.Scanner;

public class  NumerosParImpar {
    public static void main(String[] args) {      
    
        Scanner sc = new Scanner(System.in);
        boolean continuar = true; // Controla si se repite el proceso

        while (continuar) {
            System.out.print("Ingrese un número entero positivo: ");
            int numeroEntero = sc.nextInt();
        
            if (numeroEntero > 0) {
        
            for (int i = 1; i <= numeroEntero; i++) {
                // Verificar si el número es par o impar
                if (i % 2 == 0) {
                    System.out.println(i + " es par.");
                } else {
                    System.out.println(i + " es impar.");
                }
            }
            // para poder decir si continua o no 
			System.out.print("¿Desea continuar? (s/n): ");
                char respuesta = sc.next().charAt(0);
                if (respuesta == 'n' || respuesta == 'N') {
                    continuar = false;
                }
            } else {
                System.out.println("Por favor, introduce un número positivo.");
        }
    }
}
}
/**************************************/
/* Nom: Noemi Fernanda Ramirez Holguin */
/* DNI/NIE: 55086944N			*/
/* Data: 18/10/2024 				*/
/* Exercici: PROU2EX01			*/
/**************************************/
