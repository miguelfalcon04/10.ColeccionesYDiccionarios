package Ejercicios.Eje08;

import java.util.ArrayList;
import java.util.Collections;

public class escoge {

    public static ArrayList<Carta> inicializArrayList(){
        ArrayList<Carta> carta = new ArrayList<Carta>();
        for (int i = 0; i < 52; i++) {
            carta.add(new Carta());
        }

        return carta;
    }
    public static void main(String[] args) {
        ArrayList<Carta> c = inicializArrayList();
        Collections.shuffle(c);

        for (int i = 0; i < 10; i++) {
            System.out.println(c.get(i));
            c.remove(i);
        }

    }
}
