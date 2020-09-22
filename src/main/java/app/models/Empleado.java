package app.models;

import java.util.List;
import java.util.Map;
import org.javalite.activejdbc.Base;
import org.javalite.common.Util;

public class Empleado {

    public static List getListado() {
        String sql = ""
                + " SELECT "
                + "      e.id, "
                + "     documento, "
                + "     nombre || ' ' || apellido as nombre_completo,  "
                + "     CASE "
                + "         WHEN mov.tipo_movimiento = 'E' THEN 'Entrada' "
                + "         WHEN mov.tipo_movimiento = 'S' THEN 'Salida' "
                + "     END as tipo_movimiento,"
                + "     um.fecha_hora "
                + " FROM fichadas.empleado e "
                + " LEFT JOIN ( "
                + "     SELECT empleado_id, MAX(fecha_hora) as fecha_hora"
                + "     FROM fichadas.movimiento "
                + "     GROUP BY 1"
                + " ) um "
                + " ON e.id = um.empleado_id"
                + " left join fichadas.movimiento mov "
                + " 	on um.empleado_id = mov.empleado_id "
                + " 	and um.fecha_hora = mov.fecha_hora ";
                
	
        List res = Base.findAll(sql);
        
        return res;
    }

    public static Map getById(Integer id) {
        List<Map> res = Base.findAll(" SELECT * FROM fichadas.empleado where id = ?", id);
        
        if(!Util.empty(res)) {
            return res.get(0);
        } 
        
        return null;
    }
    
}
