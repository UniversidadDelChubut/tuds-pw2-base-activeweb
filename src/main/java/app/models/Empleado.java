package app.models;

import java.util.List;
import org.javalite.activejdbc.Model;
import org.javalite.activejdbc.annotations.BelongsTo;
import org.javalite.activejdbc.annotations.HasMany;
import org.javalite.activejdbc.annotations.Table;

@Table("fichadas.empleado")
@BelongsTo(foreignKeyName = "sucursal_id", parent = Sucursal.class)
@HasMany(child = Movimiento.class, foreignKeyName = "empleado_id")
public class Empleado extends Model {

    public String getNombreCompleto() {
        return get("nombre") + " " + get("apellido");
    }

    public List<Movimiento> getFichadas() {
        return getAll(Movimiento.class);
    }
    
    public Sucursal getSucursal() {
        return parent(Sucursal.class);
    }

}

