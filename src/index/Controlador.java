package index;

import ssa.limpieza.LimpiezaCoordinador;
import ssa.login.LoginControlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


/**
 *
 * @author sergio
 */
public class Controlador {
    
   
    
    public static void main(String[] args) {
        LoginControlador cordiCoordinador = new LoginControlador();
        cordiCoordinador.iniciarPantalla();
    }
    
    public void iniciaPantallaLimpieza(){
        LimpiezaCoordinador limpiezaCoordinador = new LimpiezaCoordinador();
        limpiezaCoordinador.iniciarPantalla();
    }

    
    
    
}
