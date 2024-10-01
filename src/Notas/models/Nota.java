package Notas.models;

public class Nota {
    private double nota1;
    private double nota2;
    private double nota3;
    private double examen;

    public Nota(double nota1, double nota2, double nota3, double examen) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.examen = examen;
    }

    public Nota() {
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", examen=" + examen +
                '}';
    }
}
