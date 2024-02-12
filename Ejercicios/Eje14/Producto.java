package Ejercicios.Eje14;

public class Producto {

    private String nombre;
    private int cantidad;
    private double precio;
    private double total;


    public Producto(String nom, int cant, double prec){
        this.nombre = nom;
        this.cantidad = cant;
        this.precio = prec;
        this.total = (precio*(double)cantidad);
    }

    @Override
    public String toString() {
        return String.format("%-8s %5.2f %5d %10.2f", nombre, precio, cantidad, total);
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTotal() {
        return total;
    }

}
