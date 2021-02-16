import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio8_MasAlto {
    public static void main(String[] args){
        int entero;

        final int LIMITE = 100;
        final int CANTIDAD = 10;

        Random aleatorio = new Random();
        ArrayList<Integer> listaNumero = new ArrayList<>();

        for (int contador = 0; contador<CANTIDAD; contador++){
            entero = aleatorio.nextInt(LIMITE)+1;
            listaNumero.add(entero);
        }

        System.out.println(listaNumero);

        for (int contador = 0; contador<listaNumero.size(); contador++){
            if (listaNumero.get(contador)>listaNumero.get(1)){
                System.out.println(listaNumero.get(contador)+ "Es el más grande");
            }
        }
    }
}
