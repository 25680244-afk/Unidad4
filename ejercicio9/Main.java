package ejercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nGENERAR SECUENCIA");
        System.out.println("Ingrese un número entero POSITIVO: ");

        int n = scanner.nextInt();
        generarSecuencia(n);

    }
    public static void generarSecuencia(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "= Par");
            } else {
                System.out.println(i + "= Impar");
            }
        }
    }
}
