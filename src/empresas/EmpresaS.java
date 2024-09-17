package empresas;

import empresas.models.Direccion;
import empresas.services.DireccionServices;
import empresas.services.EmpleadoService;

public class EmpresaS {
    

    public static void main(String[] args) {
        EmpleadoService service = new EmpleadoService();
        service.menu();

        DireccionServices services = new DireccionServices();

    }


}