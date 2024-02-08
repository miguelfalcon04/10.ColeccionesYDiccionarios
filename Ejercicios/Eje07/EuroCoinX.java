package Ejercicios.Eje07;

import java.util.ArrayList;

public class EuroCoinX {

    public static MonedaX lanzaMoneda(ArrayList<MonedaX> monedas){
        MonedaX aux = null;

        if(monedas.isEmpty()){
            aux = new MonedaX();
        }else{
            aux = new MonedaX();
            int longitud = monedas.size();
            if(aux.getFace()!= monedas.get(longitud-1).getFace() && aux.getValue()!= monedas.get(longitud-1).getValue()){
                do {
                    aux = new MonedaX();
                } while (aux.getFace() != (monedas.get(longitud-1).getFace()) && aux.getValue() != (monedas.get(longitud-1).getValue()));
            }
        }

        return aux;
    }
    public static void main(String[] args) {
        ArrayList<MonedaX> monedas = new ArrayList<MonedaX>();

        for (int i = 0; i < 6; i++) {
            monedas.add(lanzaMoneda(monedas));
            int ultimaMoneda = monedas.size();
            System.out.println(monedas.get(ultimaMoneda-1));
        }

    }
}
