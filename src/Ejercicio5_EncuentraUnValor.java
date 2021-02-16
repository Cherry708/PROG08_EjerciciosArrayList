import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio5_EncuentraUnValor {
    public static void main(String[] args){

        /*
         * Ejercicio 5_EncuentraUnValorEnUnArrayList
         *
         * Primero, crea un ArrayList que pueda contener Integers.
         * Después, rellena el ArrayList con diez números aleatorios del 1 al 50.
         * Para finalizar, muestra el contenido del ArrayList en la pantalla,
         * de la manera que te sea más cómoda.
         *
         * Tras hacer lo anterior, pide al usuario que introduzca un número entero.
         * El programa deberá buscar ese número entero en el ArrayList y mostrará un mensaje
         * si encuentra el número (no es necesario que muestre ningún mensaje si no lo encuentra).
         * El mensaje se mostrará tantas veces como el número se encuentre en el ArrayList.
         *
         * Rubén Serrano Cano
         * 16/02/21
         */

        //ArrayList de registros para examen

        int entero;

        final int LIMITE = 50;
        final int CANTIDAD = 10;

        Scanner inputUsuario = new Scanner(System.in);
        String linea = "";
        int numero;

        Random aleatorio = new Random();
        ArrayList<Integer> listaNumero = new ArrayList<>();

        for (int contador = 0; contador<CANTIDAD; contador++){
            entero = aleatorio.nextInt(LIMITE)+1;
            listaNumero.add(entero);
        }

        System.out.println(listaNumero);
        System.out.println("Dime el número a buscar: ");
        linea = inputUsuario.nextLine();
        numero = Integer.parseInt(linea);

        if (listaNumero.contains(numero)){
            System.out.println(numero + " Está en la lista");
        }

    }
}
