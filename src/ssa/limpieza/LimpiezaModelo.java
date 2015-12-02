/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.limpieza;

import ssa.limpieza.LimpiezaCoordinador;

/**
 *
 * @author sergio
 */
public class LimpiezaModelo {

    public void setCoordinador(LimpiezaCoordinador coordinador) {
        //this.coordinador = coordinador;
    }

    String[] getTipoPersona() {
        String[] datoListBox = {"Misma Persona",  "Datos insuficientes", "Persona distinta"};    
        return datoListBox;
    }

    String[] getPersonasDuplicadas() {
        String[] personas = { "#DERECHOHABIENCIA", "Betancourt " , "Almanza " ,
                "Sergio Alan " , "15-02-15 " , "M " , "Direccion " ,
                "Num exterior " , "Numero int " , "Colonia ", "CP " ,
                "Telefono " , "BEAS910215 " , "BEAS910215 " , "Soltero " ,   
                "Chihuahua " , "ayer " , "Chihuahua" ,"Chihuahua" , "Chihuahua" , "NUNCA " };
        
        return personas;
    }
}
