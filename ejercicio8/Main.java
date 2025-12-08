package ejercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = {10, 50, 67, 89, 5, 23, 100};

        System.out.println("Ingrese un número para buscar en el arreglo: ");
        int numeroBuscado = scanner.nextInt();

        int indice = 0;
        int posicionEncontrada = -1;

        while (indice < numeros.length) {
            if (numeros[indice] == numeroBuscado) {
                posicionEncontrada = indice;
                break;
            }
            indice++;
        }

        if (posicionEncontrada != -1) {
            System.out.println("El número " + numeroBuscado + " se encontró en la posición : " + posicionEncontrada);
        } else {
            System.out.println("El número no se encontró");
        }

        scanner.close();
    }
}
