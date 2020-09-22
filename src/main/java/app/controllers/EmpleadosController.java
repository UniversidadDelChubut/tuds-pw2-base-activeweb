package app.controllers;

import app.models.Empleado;
import java.util.List;
import java.util.Map;
import org.javalite.activeweb.AppController;

public class EmpleadosController extends AppController {

    public void index() {
        List res = Empleado.getListado();
        view("filas", res);
    }
    
    public void ver() {
        Integer id = Integer.valueOf(getId());
        
        Map datos_empleado = Empleado.getById(id);
        view("empleado", datos_empleado);
    }
}
