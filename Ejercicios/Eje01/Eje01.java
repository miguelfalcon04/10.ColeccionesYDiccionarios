package Ejercicios.Eje01;

import java.util.ArrayList;

public class Eje01 {
    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<String>();

        array.add("Miguel");
        array.add("Antonio");
        array.add("Noelia");
        array.add("Pepe");
        array.add("Federico");
        array.add("Ben10");

        System.out.println("Contenido: ");
        for (String nombre : array) {
            System.out.println(nombre);
        }

    }
}
