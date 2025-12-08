package ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String  contrasena= "ingenieria2025";
                int intentos = 3;

                while (intentos > 0) {
                    System.out.println("Ingresa la Contraseña correcta (" + intentos + " intentos): ");
                    String entrada = sc.nextLine();

                    if (entrada.equals(contrasena)) {
                        System.out.println("Acceso concedido");
                        return;
                    }

                    intentos = intentos - 1;
                    if (intentos > 0) {
                        System.out.println("Incorrecta, intenta otra vez");
                    }
                }

                System.out.println("Acceso denegado. Contacte a soporte.");
                sc.close();
            }
        }




