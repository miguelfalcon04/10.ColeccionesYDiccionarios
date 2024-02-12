package Ejercicios.Eje08;

public class Carta {
    private static String palo[] = {"Trébol", "Corazones", "Picas", "Diamantes"};
    private static String valor[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","k"}; 
    private static int stick = 0;
    private static int value = 0;
    private String pal;
    private String val;

    public Carta(){
        this.pal = palo[stick];
        this.val = valor[value];
        value+=1;
        if(value==13){
            value = 0;
            stick+=1;
        }
    }

    @Override
    public String toString() {
        return val + " de " + pal;
    }

}
