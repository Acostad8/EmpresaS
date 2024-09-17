package empresas.models;

public class Direccion {

    private String calle;
    private String numeroCasa;
    private String barrio;
    private String ciudad;
    private String codigoPostal;



    public Direccion() {
        this.codigoPostal = "";
        this.ciudad = "";
        this.barrio = "";
        this.numeroCasa = "";
        this.calle = "";
    }

    public Direccion(String codigoPostal, String ciudad, String barrio, String numeroCasa, String calle) {
        this.codigoPostal = codigoPostal;
        this.ciudad = ciudad;
        this.barrio = barrio;
        this.numeroCasa = numeroCasa;
        this.calle = calle;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numeroCasa='" + numeroCasa + '\'' +
                ", barrio='" + barrio + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                '}';
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}

