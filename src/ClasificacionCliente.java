import java.util.Scanner;

public class ClasificacionCliente {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de puntos del cliente: ");
        int puntos = leer.nextInt();

        if (puntos < 1000) {
            System.out.println("El cliente es: Bronce");
        } else if (puntos >= 1000 && puntos <= 3000) {
            System.out.println("El cliente es: Plata");
        } else {
            System.out.println("El cliente es: Oro");
        }
    }
}