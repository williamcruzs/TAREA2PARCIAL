/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author HP 9480m
 */
public abstract class Persona {
    
    
    
    //abstraccion;
    abstract String getLocalidad();
    
    //Encapsulamiento
    public String nombre;
     public String pasantia;
    private int edad;
    
    public void setNombre(String _nombre){
        this.nombre =_nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setPasantia(String _pasantia){
        this.pasantia =_pasantia;
    }
    public String getPasantia(){
        return pasantia;
    }
    public void setEdad(int _edad){
        this.edad =_edad;
    }
    public int getEdad(){
        return edad;}
    
        public void Imprimirdatos(){
       System.out.println("Nombre" + nombre);
        System.out.println("Pasantia" + pasantia);
    
        }
     //poliformismo
     abstract String obtenerInformacionpersona();}