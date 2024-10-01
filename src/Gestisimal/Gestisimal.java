package Gestisimal;

import Gestisimal.Services.ProductoServices;

public class Gestisimal {
    public static void main(String[] args) {
        ProductoServices productoServices = new ProductoServices();
        productoServices.menu();
    }
}
