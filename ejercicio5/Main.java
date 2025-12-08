package ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String categoria;
        int calif;

        System.out.println("CLASIFICADOR");
        System.out.println("Ingrese una calificación: ");
        calif = sc.nextInt();

        categoria = clasificar(calif);
        System.out.println("Categoría: " + categoria);
    }
    public static String clasificar(int calif){
        if (calif >= 90 && calif <= 100) {
            return "Sobresaliente";
        } else if (calif >= 80) {
            return  "Notable";
        } else if (calif >= 70) {
            return "Aprobatorio";
        } else if (calif >= 0) {
            return "Reprobatorio";
        } else {
            return "Error";
        }


    }
}

