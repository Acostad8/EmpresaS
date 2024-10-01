package Cine.Services;

import Cine.models.Autor;
import Cine.models.Pelicula;

import java.util.HashMap;
import java.util.Scanner;

public class ServicePelicula {
    private Scanner sc;
    private Pelicula pelicula;
    private HashMap<String, Pelicula> listaPeliculas;


    public ServicePelicula() {
        sc = new Scanner(System.in);
        listaPeliculas = new HashMap<>();

    }

    public void menu(){

        int opcion = 0;
        do {
            System.out.println("------MENU------");
            System.out.println("1. CREAR PELICULA");
            System.out.println("2. MODIFICAR PELICULA");
            System.out.println("3 BUSCAR PELICULA");
            System.out.println("4. LISTAR PELICULA");
            System.out.println("5. ELIMINAR PELICULA");
            System.out.println("0. SALIR");
            System.out.println("ingrese una opcion del menu");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    crearPelicula();
                    break;
                case 2:
                    modificarPelicula();
                    break;
                case 3:
                    buscarPelicula();
                    break;
                case 4:
                    listarPelicula();
                    break;
                case 5:
                    eliminarPelicula();
                    break;
                default:
                    opcion = 0;
                    break;
            }


        }while (opcion!=0);
    }
    private void crearPelicula() {
        System.out.println("Ingrese el nombre del pelicula");
        String nombre = sc.next();
        System.out.println("Ingrese los actores de la pelicula");
        String actores = sc.next();
        System.out.println("Ingrese la fecha de estreno de la pelicula");
        String fechaEstreno = sc.next();
        System.out.println("Ingrese el director del pelicula");
        String director = sc.next();
        System.out.println("Ingrese el numero de asistentes de la pelicula");
        int asistentes = sc.nextInt();
        System.out.println("ingrese el genero de la pelicula");
        String genero = sc.next();
        System.out.println("Ingrese el autor de la pelicula");
        String autor = sc.next();

        listaPeliculas.put(nombre,new Pelicula(actores,fechaEstreno,director,asistentes,genero,autor);


    }
    private void modificarPelicula() {

    }
    private void buscarPelicula() {

    }
    private void listarPelicula() {

    }
    private void eliminarPelicula() {

    }


}
