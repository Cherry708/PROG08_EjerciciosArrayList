import java.util.ArrayList;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args){

        /*
         * Ejercicio 3
         *
         * Primero, crea un ArrayList que pueda contener Integers.
         * Después, rellena el ArrayList con mil números aleatorios del 10 al 99.
         * Para finalizar, muestra el contenido del ArrayList en la pantalla,
         * de la manera que te sea más cómoda.
         *
         * Rubén Serrano Cano
         * 15/02/21
         */

        int entero;
        final int LIMITE = 1000;

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int contador = 0; contador<LIMITE; contador++){
            entero = aleatorio.nextInt(90)+10;
            listaNumeros.add(entero);
        }

        System.out.println("Este es el contenido de la lista: "+listaNumeros);


    }
}
