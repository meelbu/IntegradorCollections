package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void menu(){

    Scanner input = new Scanner(System.in).useDelimiter("\n");
    Series series = new Series();
    boolean fin = false;
    String opcion = "";




        while (!fin){
            System.out.println("\n" + "Sistema de carga de series" + "\n" + "----------------------------" + "\n" +
                    "Selecciona una opcion para iniciar con el menu:" + "\n" +
                    "- 1. Añadir una serie a la lista" + "\n" +
                    "- 2. Mostrar la lista de series" + "\n" +
                    "- 3. Mostrar la lista de series que duran menos de 15 minutos" + "\n" +
                    "- 4. Mostrar la lista de series qur duran más de 40 minutos" + "\n" +
                    "- 5. Mostrar las series de categoría ROMANCE " + "\n" +
                    "- 6. Mostrar las series de categoría DRAMA" + "\n" +
                    "- 7. Mostrar las series de categoría COMEDIA" + " \n" +
                    "- 8. Salir" + "\n" +
                    "Seleccione una de las opciones anteriores:");

            opcion = input.next();

            switch (opcion){
                case "1":
                    System.out.println("\n" + "Añadir una serie:" + "\n");
                    series.crearSerie();
                    break;

                case "2":
                    System.out.println("\n" + "Lista de series actualizada:" + "\n");
                    series.verLista();
                    break;

                case "3":
                    System.out.println("\n" + "Series de menos de 15 minutos:" + "\n");
                    series.menos15Min();
                    break;

                case "4":
                    System.out.println("\n" + "Series de mas de 40 minutos:" + "\n" );
                    series.mas40Min();
                    break;

                case "5":
                    System.out.println("\n" + "Series de categoría ROMANCE:" + "\n");
                    series.verRomance();
                    break;

                case "6":
                    System.out.println("\n" + "Series de categoría DRAMA:" + "\n");
                    series.verDrama();
                    break;

                case "7":
                    System.out.println("\n" + "Series de categoría COMEDIA"  + "\n");
                    series.verComedia();
                    break;

                case "8":
                    System.out.println("Fin del proceso.");
                    fin = true;
                    break;

                default:
                    System.out.println("ERROR - Ingrese una opcion valida.");
            }
        }
    }



}
