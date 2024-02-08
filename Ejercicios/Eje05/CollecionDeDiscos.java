package Ejercicios.Eje05;

import java.util.ArrayList;

public class CollecionDeDiscos {

    public static void menu(){
        System.out.println("\nCOLECCIÓN DE DISCOS");
        System.out.println("===================");
        System.out.println("1. Listado");
        System.out.println("2. Nuevo disco");
        System.out.println("3. Modificar");
        System.out.println("4. Borrar");
        System.out.println("5. Salir");
        System.out.print("Introduzca una opción: ");
    }
    public static void main(String[] args) {
        ArrayList<Disco> discos = new ArrayList<Disco>();
        int opc = -1;

        discos.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
        discos.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
        discos.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

        do {
            menu();
            opc = Integer.parseInt(System.console().readLine());

            switch (opc) {
                case 1:
                    for (Disco disco : discos) {
                        System.out.println(disco);
                    }
                    break;

                case 2:{
                    System.out.print("Código del disco: ");
                    String cod = System.console().readLine();
                    while (discos.contains(new Disco(cod,"", "", "", 0))) {
                        System.out.println("Ese código ya existe en la base de datos.");
                        System.out.print("Introduzca otro código: ");
                        cod = System.console().readLine();
                    }

                    System.out.print("Nombre del disco: ");
                    String nom = System.console().readLine();

                    System.out.print("Autor del disco: ");
                    String aut = System.console().readLine();

                    System.out.print("Género del disco: ");
                    String gen = System.console().readLine();

                    System.out.print("Duración del disco: ");
                    int dur = Integer.parseInt(System.console().readLine());

                    discos.add(new Disco(cod, nom, aut, gen, dur));
                    }
                    break;

                case 3:
                    System.out.print("Introduzca el código del disco que desea modificar: ");
                    String cod = System.console().readLine();

                    if(discos.contains(new Disco(cod, "", "", "", 0))){


                    }else{
                        System.out.println("Lo siento no existe ese disco");
                    }

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
            
        } while (opc!=5);

    }
}
