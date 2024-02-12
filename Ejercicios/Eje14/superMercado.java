package Ejercicios.Eje14;

import java.util.ArrayList;
import java.util.HashMap;

public class superMercado {
    public static void main(String[] args) {
        HashMap<String,Double> m = new HashMap<String,Double>();
        m.put("avena", 2.21);
        m.put("garbanzos", 2.39);
        m.put("tomate", 1.59);
        m.put("jengibre", 3.13);
        m.put("quinoa", 4.50);
        m.put("guisantes", 1.60);

        ArrayList<Producto> p = new ArrayList<Producto>();
        String opc = "";
        int cant = 0;
        double total = 0;

        System.out.println("Escriba 'fin' para finalizar la compra");
        while (!opc.equals("fin")) {
            System.out.print("Producto: ");
            opc = System.console().readLine();

            if(!opc.equals("fin")){
                if(m.containsKey(opc)){
                    System.out.print("Cantidad: ");
                    cant = Integer.parseInt(System.console().readLine());

                    p.add(new Producto(opc, cant,m.get(opc)));
                }else{
                    System.out.println("Lo siento no tenemos este producto en nuestro catálogo");
                }
            }
        }

        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        for (Producto pro : p) {
            System.out.print(pro+"\n");
            total += pro.getTotal();
        }
        System.out.println("---------------------------------");
        System.out.printf("Total: %.2f",total);

    }
}
