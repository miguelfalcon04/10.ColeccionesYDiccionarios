package Ejercicios.Eje15;

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
        String codigo = "";
        int cant = 0;
        double total = 0;
        double descuento = 0;
        boolean existe = false;

        System.out.println("Escriba 'fin' para finalizar la compra");
        while (!opc.equals("fin")) {
            existe = false;
            System.out.print("Producto: ");
            opc = System.console().readLine();

            if(!opc.equals("fin")){
                if(m.containsKey(opc)){
                    System.out.print("Cantidad: ");
                    cant = Integer.parseInt(System.console().readLine());

                    for (Producto producto : p) {
                        if(opc.equals(producto.getNombre())){
                            producto.setCantidad(producto.getCantidad() + cant);
                            producto.setTotal(producto.getCantidad()*producto.getPrecio());
                            existe = true;
                        }
                    }
                    if(existe==false){
                        p.add(new Producto(opc, cant,m.get(opc)));
                    }
                }else{
                    System.out.println("Lo siento no tenemos este producto en nuestro catálogo");
                }
            }else{
                System.out.print("Introduzca código de descuento (INTRO si no tiene ninguno): ");
                codigo = System.console().readLine();
            }
        }

        System.out.println();
        System.out.println("Producto Precio Cantidad Subtotal");
        System.out.println("---------------------------------");
        for (Producto pro : p) {
            System.out.print(pro+"\n");
            total += pro.getTotal();
        }
        System.out.println("---------------------------------");
        System.out.print("Descuento: ");
        if(codigo.equals("ECODTO")){
            descuento = 0.1*total;
            System.out.printf("%.2f\n",descuento);
        }else{
            System.out.printf("%.2f\n",descuento);
        }
        System.out.println("---------------------------------");
        System.out.printf("Total: %.2f",total-descuento);

    }
}
