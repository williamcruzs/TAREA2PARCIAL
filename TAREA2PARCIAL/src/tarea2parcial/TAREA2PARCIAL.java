/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2parcial;

/**
 *
 * @author HP 9480m
 */
public class TAREA2PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante est= new Estudiante();
        est.setCarrera("Ing. Produccion Industrial");
        est.setUniversidad("UTH");
       System.out.println(est.obtenerInformacionpersona());
           
    }
    
}
