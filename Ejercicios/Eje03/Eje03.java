package Ejercicios.Eje03;

import java.util.ArrayList;
import java.util.Collections;

public class Eje03 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 1; i < 6; i++) {
            System.out.print("Numero "+i+"º: ");
            int opc = Integer.parseInt(System.console().readLine());
            array.add(opc);
        }

        System.out.println("Lista original: " + array);

        Collections.sort(array);

        System.out.println("Lista ordenada de menor a mayor: " + array);

        ArrayList<Integer> b = new ArrayList<Integer>();

        for(int n : array) {
        b.add(0, n);
        }

        System.out.print("Lista ordenada de mayor a menor: " + b);

    }
}
