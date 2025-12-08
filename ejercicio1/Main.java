package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleccionUsuario;
        double area= 0;

        System.out.println("¿Qué area deseas calcular?");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        eleccionUsuario = scanner.nextInt();

        if (eleccionUsuario==1){
            System.out.println("== Círculo ==");
            System.out.println("Ingresa el radio");
            double radio = scanner.nextDouble();
            area = Math.PI* Math.pow(radio,2);
            System.out.println("El área del círculo es:" + area);


        }else if (eleccionUsuario==2) {
            System.out.println(" == Rectángulo ==");
            System.out.println("Ingresa la base");
            double base = scanner.nextDouble();
            System.out.println("Ingresa la altura");
            double altura = scanner.nextDouble();
            area = base * altura;
            System.out.println("El área del Rectángulo es:" + area);
        }
        if (area > 100){
            System.out.println("El área calculada es Mayor a 100 unidades cuadradas");
        } else {
            System.out.println("El área es Menor a 100 unidades cuadradas");
        }
    }

}
