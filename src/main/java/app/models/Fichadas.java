package app.models;

import java.util.List;
import org.javalite.activejdbc.Base;

public class Fichadas {

    public static List getDelEmpleado(Integer empleado_id) {
        String sql = "SELECT * from fichadas.movimiento WHERE empleado_id = ?";
        List res = Base.findAll(sql, empleado_id);
        
        return res;
    }
    
}
