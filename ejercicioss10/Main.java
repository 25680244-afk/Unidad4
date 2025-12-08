package ejercicioss10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float promedio;
        float[] calificaciones = new float[5];

        System.out.println("Ingrese 5 calificaciones:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Calificación " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextFloat();
        }

        promedio = calcularPromedio(calificaciones,5);

        System.out.printf("El promedio de las 5 calificaciones es:" + promedio);

    }

    public static float calcularPromedio(float[] calificaciones, int tamano) {
        float suma = 0;

        for (int i = 0; i < tamano; i++) {
            suma += calificaciones[i];
        }
        return suma / tamano;
    }

}
