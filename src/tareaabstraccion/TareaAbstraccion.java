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
public class TareaAbstraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instanciando clases
        UTH uth  = new UTH();
        UNAH unah = new UNAH();
        UNITEC unitec = new UNITEC();
        
        //Imprimiendo datos mediante los metodos get de las diferentes clases
        System.out.println(uth.getUniversidad());
        System.out.println(uth.getPresidente());
        
        System.out.println(unah.getUniversidad());
        System.out.println(unah.getPresidente());
        
        System.out.println(unitec.getUniversidad());
        System.out.println(unitec.getPresidente());
            
    }
    
}
