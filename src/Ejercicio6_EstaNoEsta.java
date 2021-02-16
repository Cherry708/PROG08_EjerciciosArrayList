import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6_EstaNoEsta {
    public static void main(String[] args){

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

        for (int contador = 0; contador<listaNumero.size(); contador++) {
            if (listaNumero.get(contador).equals(numero)) {
                System.out.println(numero + " Está en la lista");
            }
        }
        if (!listaNumero.contains(numero))
         System.out.println(numero + " No está en la lista");

    }
}
