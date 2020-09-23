package app.controllers;

import org.javalite.activeweb.AppController;

public class HomeController extends AppController {

    public void index() {

    }
    
    public void otra() {

    }
    
    public void click() {
        Integer recuento = sessionInteger("recuento");
        
        if(recuento == null) {
            recuento = 0;
        }
        
        session("recuento", recuento + 1);
        redirect();
    }
    
    public void cerrar() {
        session().invalidate();
        redirect();
    }

}
