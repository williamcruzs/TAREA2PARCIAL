/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2parcial;

/**
 *
 * @author Cesia Zamora
 */
public class Estudiante extends Persona{
public String carrera;
public String universidad;

public Estudiante(){
    setNombre("Cesia");
    setEdad(21);
    setSexo("Femenino");
    setPasantia("Estudiar");
}

public void setCarrera(String _carrera){
    this.carrera = _carrera;
}

public String getCarrera(){
    return carrera;
}

public void setUniversidad(String _universidad){
    this.universidad = _universidad;
}

public String getUniversidad(){
    return universidad;
}

    
    @Override
    String getLocalidad() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String obtenerInformacionpersona() {
       super.Imprimirdatos();
       return  "Carrera: "+getCarrera()+ "\n" +"Universidad: "+ getUniversidad(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
