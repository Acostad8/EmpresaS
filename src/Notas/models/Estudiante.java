package Notas.models;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String edad;
    private String carrera;
    private String asignatura;
    private Nota nota;
    private double definitiva;

    public Estudiante(String codigo, String nombre, String edad, String carrera, String asignatura, double examen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.asignatura = asignatura;

        this.definitiva = definitiva;
    }

    public Estudiante() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", carrera='" + carrera + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", nota=" + nota +
                ", definitiva=" + definitiva +
                '}';
    }
}
