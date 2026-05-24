import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Respuestas correctas: ");
        int correctas = sc.nextInt();
        System.out.print("Respuestas incorrectas: ");
        int incorrectas = sc.nextInt();
        System.out.print("Respuestas vacías: ");
        int vacias = sc.nextInt();
        int puntaje = (correctas * 5) + (incorrectas * -2);
        System.out.println("Puntaje obtenido: " + puntaje);
        sc.close();
    }
}