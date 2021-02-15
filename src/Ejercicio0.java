import java.util.ArrayList;

/**
 * Primero, crea un ArrayList que pueda contener Integers.
 * Después, añade diez veces el número -211 al ArrayList.
 * Para finalizar, muestra el contenido del ArrayList en la pantalla.
 * No utilices bucles ni ninguna variable para controlar el índice del ArrayList.
 * Simplemente utiliza literales para hacer referencia a cada posición.
 */

public class Ejercicio0 {
    public static void main(String[] args){

        ArrayList<Integer> listaCelda = new ArrayList<Integer>(10);

        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);
        listaCelda.add(-211);

        System.out.println("La posicion 0 contiene un " + listaCelda.get(0));
        System.out.println("La posicion 1 contiene un " + listaCelda.get(1));
        System.out.println("La posicion 2 contiene un " + listaCelda.get(2));
        System.out.println("La posicion 3 contiene un " + listaCelda.get(3));
        System.out.println("La posicion 4 contiene un " + listaCelda.get(4));
        System.out.println("La posicion 5 contiene un " + listaCelda.get(5));
        System.out.println("La posicion 6 contiene un " + listaCelda.get(6));
        System.out.println("La posicion 7 contiene un " + listaCelda.get(7));
        System.out.println("La posicion 8 contiene un " + listaCelda.get(8));
        System.out.println("La posicion 9 contiene un " + listaCelda.get(9));

    }
}
