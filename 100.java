import java.util.Scanner;
import java.util.Random;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean jugarDeNuevo = true;
        
        while (jugarDeNuevo) {
            int numeroAleatorio = random.nextInt(100) + 1;
            int intentos = 0;
            boolean adivinado = false;
            
            System.out.println("¡Bienvenido al juego de adivinanza de números!");
            System.out.println("He escogido un número entre 1 y 100. ¡Intenta adivinarlo!");

            while (!adivinado) {
                System.out.print("Introduce un número entre 1 y 100: ");
                
                int intento;
                
                // Validación para asegurarse de que el usuario introduce un número válido
                try {
                    intento = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, introduce un número válido.");
                    continue;
                }
                
                if (intento < 1 || intento > 100) {
                    System.out.println("El número debe estar entre 1 y 100.");
                    continue;
                }
                
                intentos++;
                
                if (intento < numeroAleatorio) {
                    System.out.println("Demasiado bajo.");
                } else if (intento > numeroAleatorio) {
                    System.out.println("Demasiado alto.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                    adivinado = true;
                }
            }
            
            // Preguntar si el usuario quiere jugar de nuevo
            System.out.print("¿Te gustaría jugar de nuevo? (sí/no): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("sí") && !respuesta.equalsIgnoreCase("si")) {
                jugarDeNuevo = false;
            }
        }
        
        System.out.println("¡Gracias por jugar! Hasta la próxima.");
        scanner.close();
    }
}
