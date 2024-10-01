package Notas.Services;
import Notas.models.Estudiante;

import java.util.InputMismatchException;
import java.util.Scanner;



public class EstudianteServices {
    private Estudiante estudiante;
    private Scanner sc;
    private EstudianteServices estudianteServices;

    public EstudianteServices(){
        sc = new Scanner(System.in);


    }



    public void menu(){
        int opcion = 0;
        try{
            do {
                System.out.println("-----menu-----");
                System.out.println("1. agregar Estudiante");
                System.out.println("2. Listado de Estudiantes");
                System.out.println("3. Promedio del Grupo");
                System.out.println("0. salir");
                System.out.println("INGRESE UNA OPCION DEL MENU");
                opcion = sc.nextInt();

                switch (opcion){
                    case 1:
                        agregarEstudiante();
                        break;
                    case 2:
                        listadoEstudiantes();
                        break;
                    case 3:
                        promedioGrupo();
                        break;
                    default:
                        opcion = 0;
                        System.out.println("gracias por usar este menu");
                }
            }while(opcion !=0);

        }catch (InputMismatchException inputMismatchException){
            System.out.println("ingrese solo valores numericos");

        }
    }

    public void agregarEstudiante(){
        System.out.println("----DATOS DEL ESTUDIANTE------");
        System.out.println("ingrese el nombre del estudiante");
        String nombre = sc.next();
        System.out.println("ingrese el codigo del estudiante");
        String codigo = sc.next();
        System.out.println("ingrese la edad del estudiante");
        String edad = sc.next();
        System.out.println("ingrese la carrera del estudiante");
        String carrera = sc.next();
        System.out.println("ingrese la materia");
        String asignatura = sc.next();


    }

    public void listadoEstudiantes(){

    }

    public void promedioGrupo(){

    }





}
