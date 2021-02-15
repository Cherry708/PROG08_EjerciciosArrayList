import java.util.ArrayList;
import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args){

        /*
         * Ejercicio 2
         *
         * Primero, crea un ArrayList que pueda contener Integers.
         * Después, rellena el ArrayList con diez números aleatorios del 1 al 100.
         * Para finalizar, muestra el contenido del ArrayList en la pantalla.
         *
         * Rubén Serrano Cano
         * 15/02/21
         */

        int entero;
        int limite = 100;
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        Random aleatorio = new Random();

        for (int contador = 0; contador<limite; contador++){
            entero = aleatorio.nextInt(limite)+1;
            listaNumeros.add(entero);
        }
        System.out.println("Este es el contenido de la lista: "+listaNumeros);

    }
}
