package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int opcion;

        System.out.println(" == Conversor de Unidades == ");
        System.out.println("Ingrese un valor a convetir");
        valor = scanner.nextInt();


        System.out.println("\nMENU");
        System.out.println("1. Kilómetros a Millas");
        System.out.println("2. Centígrados a Fahrenheit");
        System.out.println("3. Metros a Pies");
        System.out.println("Opción:");
        opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println(" KILOMETROS A MILLAS");
                double millas = valor * 0.621371;
                System.out.println("El valor de Kilometros a Millas es: " + millas);
                break;
            case 2:
                System.out.println(" CENTIGRADOS A FAHRENHEIT");
                double fahrenheit = (valor * 1.8) + 32;
                System.out.println("El valor de Centigrados a Fahrenheit es. " + fahrenheit);
                break;
            case 3:
                System.out.println(" METROS A PIES");
                double pies = valor * 3.28084;
                System.out.println(" El valor de Metros a Pies es: " + pies);
                break;
        }
    }
}
