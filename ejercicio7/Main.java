package ejercicio7;

public class Main {
    public static void main(String[] args) {

        String[] letras = {"a", "k", "d", "e", "f", "i", "o", "u", "a", "e"};


        int[] contadores = new int[5];
        String[] vocales = {"a", "e", "i", "o", "u"};

        int contadorTotal = 0;


        for (int i = 0; i < letras.length; i++) {
            String letra = letras[i];


            for (int j = 0; j < vocales.length; j++) {
                if (letra.equals(vocales[j])) {
                    contadores[j]++;
                    contadorTotal++;
                    break;
                }
            }
        }
        System.out.println("\n== Contador de Vocales ==");
        System.out.println("Total de vocales encontradas: " + contadorTotal);

        for (int i = 0; i < vocales.length; i++) {
            System.out.println(vocales[i] + ": " + contadores[i] + "o casión u ocasiones encontrada");
            if (contadores[i] > 1) {
                System.out.println("La vocal * " + vocales[i] + " * se repite");
            }
        }
    }
}
