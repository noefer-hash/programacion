import java.util.Scanner;

public class ClasificacionDiasSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número del 1 al 7
        System.out.println("Ingrese un número del 1 al 7 para conocer el día de la semana:");
        int numeroDia = scanner.nextInt();
        
        // Declarar variables para el nombre del día y si es laborable o fin de semana
        String nombreDia;
        String tipoDia;
        
        // Switch-case para determinar el día de la semana y su clasificación
        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                tipoDia = "Laborable";
                break;
            case 2:
                nombreDia = "Martes";
                tipoDia = "Laborable";
                break;
            case 3:
                nombreDia = "Miércoles";
                tipoDia = "Laborable";
                break;
            case 4:
                nombreDia = "Jueves";
                tipoDia = "Laborable";
                break;
            case 5:
                nombreDia = "Viernes";
                tipoDia = "Laborable";
                break;
            case 6:
                nombreDia = "Sábado";
                tipoDia = "Fin de semana";
                break;
            case 7:
                nombreDia = "Domingo";
                tipoDia = "Fin de semana";
                break;
            default:
                // En caso de un número fuera del rango permitido
                nombreDia = "Error";
                tipoDia = "Número fuera de rango, por favor ingrese un número entre 1 y 7.";
                break;
        }
        
        // Mostrar el resultado al usuario
        if (nombreDia.equals("Error")) {
            System.out.println(tipoDia);
        } else {
            System.out.println("El día es " + nombreDia + " y es un día " + tipoDia + ".");
        }
        
        // Cerrar el escáner
        scanner.close();
    }
}
