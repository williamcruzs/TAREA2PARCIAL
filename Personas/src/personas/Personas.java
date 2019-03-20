/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author HP 9480m
 */

    
    public abstract class Personas {
    
    //abstraccion;
    abstract String getLocalidad();
    
    //Encapsulamiento
    public String nombre;
     public String pasantia;
    private int edad;
    public String sexo;
    
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
        return edad; 
    }
    public void setSexo(String _sexo){
        this.sexo =_sexo;
    }
    public String getSexo(){
        return sexo;
    }
    
        public void Imprimirdatos(){
            
       System.out.println("Nombre  es: " + nombre);
        System.out.println("Pasantia es: " + pasantia);
        System.out.println("El tipo de sexo es: " + sexo);
        System.out.println("La edad es: " + edad);
       
        }
     //poliformismo
      abstract String obtenerInformacionpersona();}
