import javax.tools.SimpleJavaFileObject;
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main (String[] args){
        /*
         * Ejercicio1
         *
         * Primero, crea un ArrayList que pueda contener Integers.
         * Después, añade diez veces el número -211 al ArrayList.
         * Para finalizar, muestra el contenido del ArrayList en la pantalla.
         * Esta vez debes utilizar un bucle, tanto para rellenar el ArrayList como para mostrarlo.
         * Y, además, en la condición del bucle deberás evitar el uso de literales
         * (en su lugar, utiliza el método size() de ArrayList).
         *
         * Ruben Serrano Cano
         * 15/02/21
         */

        int imprimir;
        imprimir = 10;
        ArrayList<Integer> listaCeldas = new ArrayList<>(10);

        for (int contador= 0; contador<imprimir; ++contador){
            listaCeldas.add(-211);
        }

        for (int contador = 0; contador<listaCeldas.size(); ++contador){
            System.out.println("La posición "+contador+" contiene un "+ listaCeldas.get(contador));
        }
    }
}
