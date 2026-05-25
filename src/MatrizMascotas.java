import java.util.Scanner;

public class MatrizMascotas {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] mascotas = new String[4][4];

        System.out.println("Por favor, ingrese el nombre de 16 mascotas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Mascota [" + i + "][" + j + "]: ");
                mascotas[i][j] = leer.nextLine();
            }
        }

        System.out.println("\nMascotas en índices impares (Simulando matriz):");
        for (int i = 1; i < 4; i += 2) {
            for (int j = 1; j < 4; j += 2) {
                System.out.print("[" + mascotas[i][j] + "] ");
            }
            System.out.println();
        }
    }
}