package Gestisimal.Services;

import Gestisimal.Models.Producto;



import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServices {

    private Producto producto;
    private Scanner sc;
    private  ProductoServices productoServices;
    private ArrayList<Producto> listaproductos;

    public ProductoServices() {
        sc = new Scanner(System.in);


    }

    public void menu(){
        int opcion ;

        do {
            System.out.println("-----PRODUCTOS-----");
            System.out.println("1. Ingresar producto");
            System.out.println("2 Buscar Producto");
            System.out.println("3. listar productos");
            System.out.println("4. Eliminar producto");
            System.out.println("5. modificar producto");
            System.out.println("6. agregar una unidad producto");
            System.out.println("7. eliminar una unidad producto");
            System.out.println("o salir del menu");
            System.out.println("ingrese una opcion del menu");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    ingresarProducto();
                    break;
                case 2:
                    buscarProducto();
                    break;
                case 3:
                    listarProductos();
                    break;
                case 4:
                    eliminarProducto();
                    break;
                case 5:
                    modificarProducto();
                    break;
                case 6:
                    agregarProducto();
                    break;
                case 7:
                    eliminarUnidadProducto();
                    break;
                default:
                    opcion = 0;
                    break;
            }
        }while (opcion !=0);
    }
    public void ingresarProducto(){
        System.out.println("-----INGRESAR PRODUCTO-----");
        System.out.println("ingrese el codigo del producto");
        int codigo = sc.nextInt();

        System.out.println("ingrese la descripcion de producto");
        String descripcion = sc.next();

        System.out.println("ingrese el precio de venta del producto");
        double precioVenta = sc.nextDouble();

        System.out.println("ingrese el precio de venta del estudiante");
        double precioCompra = sc.nextDouble();

        System.out.println("ingrese la cantidad de productos en el inventario");
        int cantidad = sc.nextInt();
        listaproductos.add(new Producto(codigo, descripcion, precioVenta, precioCompra, cantidad));
    }
    public Producto buscarProducto(){
        System.out.println("-----BUSCAR PRODUCTO-----");
        System.out.println("ingrese el codigo a buscar");
        int codigo = sc.nextInt();
        return listaproductos.get(codigo);


    }
    public void listarProductos(){
        for (Producto producto : listaproductos) {
            System.out.println(producto);
        }
    }
    public void eliminarProducto(){
        System.out.println("-----BUSCAR PRODUCTO-----");
        producto = productoServices.buscarProducto();

        if (producto != null) {
            listaproductos.remove(producto.getCodigo());
            System.out.println("el producto ha sido eliminado");
        }else{
            System.out.println("el producto no existe");
        }



    }
    public void modificarProducto(){
        System.out.println("-----MODIFICAR PRODUCTO-----");
        producto = productoServices.buscarProducto();
        System.out.println("ingrese el codigo del producto");
        int codigo = sc.nextInt();
        producto.setCodigo(codigo);


    }
    public void agregarProducto(){

    }
    public void eliminarUnidadProducto(){

    }

}
