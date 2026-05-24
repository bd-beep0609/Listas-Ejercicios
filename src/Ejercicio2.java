import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Debe ingresar un número positivo.");
        } else {
            int i = 0;
            System.out.println("Números impares entre 0 y " + n + ":");
            while (i <= n) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
            System.out.println();
        }
        sc.close();
    }
}

