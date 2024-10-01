package Cine.models;

public class Pelicula {
    private String nombre;
    private String actores;
    private String fechaEstreno;
    private String director;
    private int numeroAsistente;
    private String genero;
    private String autor;

    public Pelicula(String nombre, String actores, String fechaEstreno, int numeroAsistente, String genero, String autor) {
        this.nombre = nombre;
        this.actores = actores;
        this.fechaEstreno = fechaEstreno;
        this.director = director;
        this.numeroAsistente = numeroAsistente;
        this.genero = genero;
        this.autor = autor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public String getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(String fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getNumeroAsistente() {
        return numeroAsistente;
    }

    public void setNumeroAsistente(int numeroAsistente) {
        this.numeroAsistente = numeroAsistente;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", actores='" + actores + '\'' +
                ", fechaEstreno='" + fechaEstreno + '\'' +
                ", director='" + director + '\'' +
                ", numeroAsistente=" + numeroAsistente +
                ", genero='" + genero + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }


}
