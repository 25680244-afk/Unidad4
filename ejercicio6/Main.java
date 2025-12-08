package ejercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5];
        System.out.println("Inversor de Arreglo Numérico");
        System.out.println("\nIngresa 5 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Arreglo en orden inverso:");
        for (int i = numeros.length - 1; i >= 0; i=i-1) {
            System.out.print(numeros[i] + " ");
        }
        
    }
}
