package Ejercicios.Eje04;

import java.util.ArrayList;
import java.util.Collections;

public class Eje04 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        for (int i = 1; i < 6; i++) {
            System.out.print("Palabra "+i+"º: ");
            a.add(System.console().readLine());
        }
        System.out.println("Lista tal cual: "+a);

        Collections.sort(a);
        System.out.println("Lista ordenada: "+a);

    }
}
