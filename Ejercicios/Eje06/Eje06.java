package Ejercicios.Eje06;

import java.util.HashMap;

public class Eje06 {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<String, Integer>();

        int oportunidades =3;
        String usuario = "";
        int contrasena = 0;
        boolean entra = false;

        h.put("Miguel", 1234);

        do {
            System.out.print("Introduzca el usuario: ");
            usuario = System.console().readLine();

            if(h.containsKey(usuario)){

                System.out.print("Introduzca la contraseña: ");
                contrasena = Integer.parseInt(System.console().readLine());
                if(h.get(usuario).equals(contrasena)){
                    System.out.println("Felicidades has accedido");
                    entra = true;
                }else{
                    oportunidades--;
                }

            }else{
                System.out.println("El usuario no existe");
            }

        } while (oportunidades!=0 && entra==false);

        if(oportunidades == 0 && entra == false){
            System.out.println("No has podido acceder");
        }

    }
}
