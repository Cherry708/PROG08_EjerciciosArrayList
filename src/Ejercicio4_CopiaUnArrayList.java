import javax.naming.LimitExceededException;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio4_CopiaUnArrayList {
    public static void main(String[] args){

        /*
         * Ejercicio 4_CopiaUnArrayList
         *
         * Escribe un programa que:
         * •Cree una ArrayList de Integers.
         * •Rellene el ArrayList con diez números aleatorios del 1 al 100.
         * •Copie todos los elementos de ese ArrayList en otro ArrayList del mismo tamaño.
         * •Cambie el último valor del ArrayList original a -7.
         * •Muestre el contenido de ambas ArrayLists, de la manera que te sea más cómoda.
         *
         * Rubén Serrano Cano
         * 15/02/21
         */

        int entero;
        final int LIMITE = 100;

        Random aleatorio = new Random();
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        ArrayList<Integer> copiaListaNumeros;

        for (int contador = 0; contador<LIMITE; contador++){
            entero = aleatorio.nextInt(LIMITE)+1;
            listaNumeros.add(entero);
        }

        copiaListaNumeros = (ArrayList) listaNumeros.clone();
        listaNumeros.add(-7);

        System.out.println("Esta es la original: "+listaNumeros);
        System.out.println("Esta es la copia: "+copiaListaNumeros);

    }
}
