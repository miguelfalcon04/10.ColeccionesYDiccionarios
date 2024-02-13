package Ejercicios.Eje19;

import java.util.HashMap;

public class Eje19 {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("caliente", "hot");
        m.put("rojo", "red");
        m.put("ardiente", "hot");
        m.put("verde", "green");
        m.put("agujetas", "stiff");
        m.put("abrasador", "hot");
        m.put("hierro", "iron");
        m.put("grande", "big");

        String palabra = "";

        while (!palabra.equals("salir")) {
            System.out.print("Introduzca una palabra y le daré los sinónimos: ");
            palabra = System.console().readLine();

            if(!palabra.equals("salir")){
                for (Map.Entry entrada : m.entrySet()) {
                    
                }
            }
            
        }


        
    }
}
