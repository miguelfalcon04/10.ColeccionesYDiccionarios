package Ejercicios.Eje18;

public class Elemento {

    private String nombre;
    private double precio;
    private int cantidad;
    private double total;

    public Elemento(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.total = (precio*((double)(cantidad)));
    }

    @Override
    public String toString() {
        return String.format("%s PVP: %.2f Unidades: %d Subtotal: %.2f", nombre, precio, cantidad, total);
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

}
