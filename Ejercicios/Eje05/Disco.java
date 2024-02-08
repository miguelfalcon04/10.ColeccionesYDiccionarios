package Ejercicios.Eje05;

public class Disco implements Comparable<Disco> {

    private String codigo;
    private String nombre;
    private String autor;
    private String genero;
    private int duracion;

    public Disco(String cod, String nom, String aut, String gen, int dur){
        this.codigo = cod;
        this.nombre = nom;
        this.autor = aut;
        this.genero = gen;
        this.duracion = dur;
    }

    @Override
    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.nombre;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }

    public String getAutor() {
        return autor;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Disco o) {
        return (this.nombre).compareTo(o.getNombre());
    }

}
