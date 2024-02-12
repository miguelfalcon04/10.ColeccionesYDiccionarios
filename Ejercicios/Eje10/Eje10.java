package Ejercicios.Eje10;

import java.util.HashMap;

public class Eje10 {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<String, String>();
        h.put("ordenador", "computer");
        h.put("gato", "cat");
        h.put("rojo", "red");
        h.put("árbol", "tree");
        h.put("pingüino", "penguin");
        h.put("sol", "sun");
        h.put("agua", "water");
        h.put("viento", "wind");
        h.put("siesta", "siesta");
        h.put("arriba", "up");
        h.put("ratón", "mouse");
        h.put("estadio", "arena");
        h.put("calumnia", "aspersion");
        h.put("aguacate", "avocado");
        h.put("cuerpo", "body");
        h.put("concurso", "contest");
        h.put("cena", "dinner");
        h.put("salida", "exit");
        h.put("lenteja", "lentil");
        h.put("cacerola", "pan");
        h.put("pastel", "pie");
        h.put("membrillo", "quince");

        System.out.print("¿Qué palabra desea traducir?: ");
        String palabra = System.console().readLine();

        if(h.containsKey(palabra)){
            System.out.println(h.get(palabra));
        }else{
            System.out.println("No se encuentra la palabra");
        }

    }
}
