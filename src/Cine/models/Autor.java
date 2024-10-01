package Cine.models;

public class Autor {
    private String nombre;
    private String fecha;
    private int numeroPremios;


    public Autor(String nombre, String fecha, int numeroPremios) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.numeroPremios = numeroPremios;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumeroPremios() {
        return numeroPremios;
    }

    public void setNumeroPremios(int numeroPremios) {
        this.numeroPremios = numeroPremios;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", numeroPremios=" + numeroPremios +
                '}';
    }
}
