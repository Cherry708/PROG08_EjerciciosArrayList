import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio7_DondeEsta {
    public static void main(String[] args){

        /*
         * Ejercicio7_DóndeEstá
         *
         * Primero, crea un ArrayList que pueda contener Integers.
         * Después, rellena el ArrayList con diez números aleatorios del 1 al 50.
         * Para finalizar, muestra el contenido del ArrayList en la pantalla,
         * de la manera que te sea más cómoda.
         * Tras hacer lo anterior,
         * pide al usuario que introduzca un número entero.
         * El programa deberá buscarese número entero en el ArrayList
         * y mostrará un mensaje  tanto  si encuentra  como si no encuentra  el número.
         * Si lo encuentra, el mensaje se mostrará tantas veces
         * como el número se encuentre en el ArrayListy
         * también el número de posición/es en el que se ha encontrado.
         *
         * Rubén Serrano Cano
         * 16/02/21
         */

        int entero;

        final int LIMITE = 100;
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


        for (int contador = 0; contador<listaNumero.size(); contador++){
            //Tras aplicar el método get, no podemos aplicar los métodos de la clase arraylist porque
            //lo que habrá devuelto el método get será un entero

            //Al hacer .get estamos buscando si el número se contiene en alguna de todas sus posiciones ya que
            //contador es tan grande como el tamaño de la arrraylist
            if (listaNumero.get(contador).equals(numero)){
                System.out.println(numero + " Está en la lista en la posición: "+contador);
            }
        }
        if (!listaNumero.contains(numero))
            System.out.println(numero+" No está en la lista");

    }

}
