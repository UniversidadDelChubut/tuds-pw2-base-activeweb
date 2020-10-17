package app.models;

import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.Table;

@Table("fichadas.movimiento")
public class Movimiento extends Model {

    public Empleado getEmpleado() {
        return parent(Empleado.class);
    }

}
