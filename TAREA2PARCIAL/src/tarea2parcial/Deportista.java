/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deportista;

/**
 *
 * @author od
 */
public class Deportista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        package Persona;
import Persona.Persona;


public class Deportista  extends Persona {
     private String numeroCamisa="11";
     private String deporte ="Tennis";

    public Deportista(String Nombre, String Pasatiempo,String numeroCamisa,String deporte, int edad, String sexo) {
        super(Nombre, Pasatiempo, edad, sexo);
        this.numeroCamisa=numeroCamisa;
        this.deporte=deporte;
    }

    public String getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(String numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }
   
     public void mostrar(){
       System.out.println(this.getNombre());
       System.out.println(this.getEdad());
       System.out.println(this.getSexo());
       System.out.println(deporte);
       System.out.println(numeroCamisa);
   }

}

    }
    
}
