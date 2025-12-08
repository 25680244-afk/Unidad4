package ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inRango;
        int finRango;

        System.out.println(" == Suma de Rango con Ciclo Determinado");
        System.out.println("Ingrese el inicio del rango: ");
        inRango = scanner.nextInt();
        System.out.println("Inrese el fin del rango: ");
        finRango = scanner.nextInt();

        if (inRango>finRango){
            System.out.println("El inicio de rango debe ser menor que el fin de rango");
            return;
        }

        int suma = 0;
        for (int i = inRango; i <= finRango; i++) {
            suma = suma + i;

        }
        System.out.println("La suma de los numeros de " + inRango + " hasta " + finRango + " es: " + suma);
    }
}
