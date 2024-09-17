package empresas.services;

import empresas.models.Direccion;
import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DireccionServices {

    private Scanner sc;
    private Direccion direccion;

    public DireccionServices(){
        sc = new Scanner(System.in);

    }

    private void crearDireccion(){
        System.out.println("--- CREAR DIRECCION----");

        System.out.println("ingrese la calle");
        String calle = sc.next();

        System.out.println("ingrese el numero de la casa");
        int numeroCasa = sc.nextInt();

        System.out.println("ingrese el barrio");
        String barrio = sc.next();

        System.out.println("ingrese el codifgo Postal");
        String codigoPostal = sc.next();




    }



}
