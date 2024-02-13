package Ejercicios.Eje16;

import java.util.HashMap;

public class Eje16 {
    public static void main(String[] args) {
        HashMap<String, String> m = new HashMap<String, String>();
        m.put("España", "Madrid");
        m.put("Portugal", "Lisboa");
        m.put("Francia", "Paris");

        String palabraIntroducida = "";

        while (!palabraIntroducida.equals("salir")) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            palabraIntroducida = System.console().readLine();
            if(!palabraIntroducida.equals("salir")){
                if(m.containsKey(palabraIntroducida)){
                    System.out.printf("La capital de %s es %s\n",palabraIntroducida, m.get(palabraIntroducida));
                }else{
                    String aux = palabraIntroducida;
                    System.out.printf("No conozco la respuesta, ¿Cuál es la capital de %s?: ",palabraIntroducida);
                    palabraIntroducida = System.console().readLine();
                    System.out.println("Gracias por enseñarme nuevas capitales");
                    m.put(aux, palabraIntroducida);
                }
            }
        }

    }
}
