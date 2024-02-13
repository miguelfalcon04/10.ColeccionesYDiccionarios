package Ejercicios.Eje18;

import java.util.ArrayList;

public class Carrito{
    private ArrayList<Elemento> carro = new ArrayList<Elemento>();

    public Carrito() {
        this.carro = new ArrayList<Elemento>();
    }

    @Override
    public String toString() {
        String ret = "";
        for (Elemento elemento : carro) {
            ret += elemento.toString()+"\n";
        }
        return ret;
    }

    public void agrega(Elemento e){
        boolean existe = false;
        for (Elemento elemento : carro) {
            if(elemento.getNombre().equals(e.getNombre())){
                existe = true;
                elemento.setCantidad(elemento.getCantidad()+e.getCantidad());
                elemento.setTotal(elemento.getCantidad()*elemento.getPrecio());
            }
        }
        if(existe == false){
            carro.add(e);
        }
    }

    public int numeroDeElementos(){
        return carro.size();
    }

    public double importeTotal() {
        double total = 0;
        for (Elemento elemento : carro) {
            total += elemento.getTotal();
        }

        return total;
    }

}
