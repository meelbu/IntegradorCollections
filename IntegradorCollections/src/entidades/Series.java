package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {


        private String nombre;
        private String categoria;
        private int duracion;

        private ArrayList<Series> listaSeries;

        public Series(){
            this.listaSeries= new ArrayList<>();
        }

        public Series(String nombre, String categoria, int duracion) {
            this.nombre = nombre;
            this.categoria = categoria;
            this.duracion = duracion;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getCategoria() {
            return categoria;
        }

        public void setCategoria(String categoria) {
            this.categoria = categoria;
        }

        public int getDuracion() {
            return duracion;
        }

        public void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public ArrayList<Series> getListaSeries() {
            return listaSeries;
        }

        public void setListaSeries(ArrayList<Series> listaSeries) {
            this.listaSeries = listaSeries;
        }

        public void crearSerie(){
            Series series = new Series();
            Scanner input = new Scanner(System.in).useDelimiter("\n");

            System.out.println("Ingrese el nombre de la serie que desea cargar:");
            nombre = input.next();
            series.setNombre(nombre);

            System.out.println("Ingrese la categoria de la serie:");
            categoria = input.next();
            series.setCategoria(categoria);

            System.out.println("Ingrese su duracion en minutos:");
            duracion = input.nextInt();
            series.setDuracion(duracion);

            añadirSerie(series);

        }

        public void añadirSerie(Series series){
            this.listaSeries.add(series);
        }

    public void verLista(){
            for (Series ser: listaSeries){
                System.out.println(ser);
            }
    }

        public void menos15Min(){
            for (Series ser : listaSeries) {
                if (ser.getDuracion() <= 15){
                    System.out.println(ser);
                }
            }
        }

        public void mas40Min(){
            for (Series ser : listaSeries) {
                if (ser.getDuracion()>= 40){
                    System.out.println(ser);
                }
            }
        }

        public void verRomance(){
            for (Series ser : listaSeries) {
                if (ser.getCategoria().equalsIgnoreCase("romance")){
                    System.out.println(ser);
                }
            }
        }

        public void verDrama(){
            for (Series ser : listaSeries) {
                if (ser.getCategoria().equalsIgnoreCase("drama")){
                    System.out.println(ser);
                }
            }
        }

        public void verComedia(){
            for (Series ser : listaSeries) {
                if (ser.getCategoria().equalsIgnoreCase("comedia")){
                    System.out.println(ser);
                }
            }
        }

        @Override
        public String toString() {
            return
                    "Nombre:" + nombre + "\n" +
                            "Categoría:" + categoria + "\n" +
                            "Duración:" + duracion + "\n";
        }
    }

