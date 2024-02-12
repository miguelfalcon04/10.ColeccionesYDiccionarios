package Ejercicios.Eje07;

public class MonedaX {

    private String[] valor = {"1 céntimo","2 céntimos","5 céntimos","10 céntimos","25 céntimos","50 céntimos","1 euro","2 euros"};
    private String[] lado = {"cara","cruz"};
    private String value;
    private String face;

    public MonedaX(){
        this.value = valor[(int)(Math.random()*8)]; 
        this.face = lado[(int)(Math.random()*2)]; 
    }

    public String toString() {
        return this.value + " - " + this.face;
    }

    public String getValue() {
        return value;
    }

    public String getFace() {
        return face;
    }

}
