package app.controllers;

import app.models.Empleado;
import app.models.Sucursal;
import java.util.Date;
import java.util.List;
import org.javalite.activeweb.AppController;
import org.javalite.common.Convert;

public class EmpleadosController extends AppController {

    public void index() {
        
        List<Empleado> lazy  = Empleado.findAll();
        
        List<Empleado> eager = Empleado.findAll().include(Sucursal.class);
        
        
        
        view("filas", lazy, "filas2", eager);
        
        
    }
    
    public void ver() {
        Empleado emp = Empleado.findById(Convert.toInteger(getId()));
        view("empleado", emp);
        
        List todos = Empleado.findAll();
        view("lista_completa", todos, "empleado", emp);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void ejemplo() {
        //recuperar todos (select * from tabla)
        List<Empleado> todos = Empleado.findAll();
        
        //filtrar x algun criterio
        List<Empleado> busqueda = Empleado
                .where("edad >= ? AND nombre ilike ?", "18", "Roberto%")
                .orderBy("apellido, nombre");
        
        //busqueda x ID
        Empleado emp = Empleado.findById(getId());
        Empleado emp2 = Empleado.findById(getId());
        
        emp.delete();       //delete from tabla where id = ...
        
        //modificación
        emp2
                .set("nombre", "Juan")
                .set("apellido", "perez")
                .saveIt();      //genera UPDATE tabla set ... WHERE id = ...
        
        // creación
        Empleado emp3 = new Empleado();
        emp3
                .set("nombre", "Carlos", "apellido", "Quiroga")
                .setDate("fecha_alta", new Date())
                .saveIt();      //genera INSERT INTO tabla...
        
        
        // ejemplo para pasar a la vista
        view("lista_completa", todos, "empleado", emp);
        //...
        
        
        view("busqueda", busqueda, "emp", emp, "emp2", emp2);
        
    }
}
