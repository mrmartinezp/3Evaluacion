/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicaveterinaria;

/**
 *
 * @author rosa
 */

    public class Cerdo extends Mascota{
    //ATRIBUTOS
    public float peso;
    
    //CONSTRUCTOR
    /**
     * Constructor de la clase Cerdo que hereda de Mascota
     * @param nombre
     * @param edad
     * @param raza
     * @param duenyo
     * @param peso 
     */
    public Cerdo(String nombre, int edad, String raza, Persona duenyo, float peso) {
        super(nombre, edad, raza, duenyo);
        this.peso = peso;
    }
}
