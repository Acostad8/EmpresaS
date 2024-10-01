package Notas.Services;

import Notas.models.Estudiante;
import Notas.models.Nota;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


    public class EstudianteServices {
        private Scanner sc;
        private Estudiante estudiante;
        private Nota nota;
        private NotaService notaService;
        private ArrayList<Estudiante> listaEstudiante;


        public EstudianteServices(){
            sc = new Scanner(System.in);
            notaService = new NotaService();
            listaEstudiante = new ArrayList<>();
        }

    public void menu(){
        int opcion = 0;
        try{
            do {
                System.out.println("-----menu-----");
                System.out.println("1. agregar Estudiante");
                System.out.println("2. Listado de Estudiantes");
                System.out.println("3. Promedio del Grupo");
                System.out.println("4 puntuaciones manores al promedio");
                System.out.println("0. salir");
                System.out.println("INGRESE UNA OPCION DEL MENU");
                opcion = sc.nextInt();

                switch(opcion){
                    case 1:
                        agregarEstudiante();
                        break;
                    case 2:
                        listadoEstudiantes();
                        break;
                    case 3:
                        promedioGrupo();
                        break;
                    case 4:
                        puntuaciones();
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

        nota = notaService.ingrsarNotas();
        listaEstudiante.add(new Estudiante(nombre,codigo,edad,carrera,nota));
    }

    public void listadoEstudiantes(){
            for (Estudiante estudiante : listaEstudiante) {
                System.out.println(estudiante);
            }
    }


    public double promedioGrupo(){
            double sumaNotas = 0;

            for (Estudiante estudiante : listaEstudiante) {
                sumaNotas+=estudiante.getNota().getDefinitiva();
            }
            double promedio = sumaNotas / listaEstudiante.size();
            System.out.println("El promedio de las notas es:" + promedio);
            return promedio;

    }

    public void puntuaciones(){
            double promedio = promedioGrupo();
        System.out.println("los estudiantes con menores notas al promedio son:");
        for (Estudiante estudiante : listaEstudiante) {
            if (estudiante.getNota().getDefinitiva() < promedio) {
                System.out.println(estudiante.getNombre() + " con nota de" + estudiante.getNota());
            }
        }

    }




}
