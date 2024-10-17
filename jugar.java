package com.example;

import java.util.Random;
import java.util.Scanner;

public class jugar {
    public static void main(String[] args) {
        
        boolean jugar = true;
        while (jugar) {
            
       } 
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int numeroAleatorio = 0;
        boolean hasAcertado = false; // Inicializamos la variable hasAcertado
        String sc = sino;
        while (!hasAcertado) { // Cambiamos la condición a 'no ha acertado'
            System.out.print("Introduce un número: ");
            int numero = sc.nextInt();
            

             if (numeroAleatorio < numero) {
                 System.out.println( "has fallado , el numero que buscas es mas pequeño"); 
                 }else if (numeroAleatorio > numero){
                    System.out.println("has fallado el numero que busca es mas grande");
                 }
                  
               else{
                System.out.println("has acertado45" );
                hasAcertado= true;
        }   
        }
        System.out.println("quieres juaga s/n");
        sino =sc.next();
        if (sino== ("n")){
            jugar = false;
        }
    }
}