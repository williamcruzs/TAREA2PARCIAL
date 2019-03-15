/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaabstraccion;

/**
 *
 * @author Cesia Zamora
 */
public class UNITEC extends Universidad {
//Clase extendida de la clase abstracta Universidad
  
  //Metodos abstractos  
    @Override
    public String getUniversidad() {
        return "UNITEC"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPresidente() {
        return "Jose Lopez"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
