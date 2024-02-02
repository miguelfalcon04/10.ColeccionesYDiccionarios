package Ejercicios.Eje02;

import java.util.ArrayList;

public class Eje02 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<Integer>();

        for (int i = 0; i < (int)(Math.random()*11+10); i++) {
            array.add((int)(Math.random()*101));
        }

        int suma = 0;
        int cont = 0; 
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : array) {
            suma+=num;
            cont++;
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            System.out.print(num+" ");
        }

        System.out.println();
        System.out.println("Suman: "+suma);
        System.out.println("Su media es: "+(float)suma/(float)cont);
        System.out.println("El mayor es: "+max);
        System.out.println("El mínimo es: "+min);
    }
}
