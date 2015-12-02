/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.login;

import index.Controlador;

/**
 *
 * @author sergio
 */
public class LoginControlador {

    private LoginVista vista;
    private LoginModelo modelo;
    private Controlador controladorPrincipal;
  
public void iniciarPantalla(){
       //Instaciamos las clases unicas
        vista = new LoginVista();
        modelo = new LoginModelo();
        controladorPrincipal = new Controlador();
        
        //Relacionamos las clases con el Coordinador
        vista.setCoordinador(this);
        modelo.setCoordinador(this);
        
        
        //Relcionamos el Coordinador con las clases
        this.setVista(vista);
        this.setModelo(modelo);
        
        
        vista.setVisible(true);
    
    }

    void setVista(LoginVista vista) {
        this.vista = vista;
    }

    void setModelo(LoginModelo modelo) {
        this.modelo = modelo;
    }
    
    

    
    
    /**
     * 
     * @param usuario Nombre de usuario
     * @param pass  Contraseña del usuario
     * @return Datos de usuario o nulo
     */
    public boolean validaLogin(String usuario, String pass) {
        return modelo.validaLogin(usuario, pass);
        
    }

    public void iniciaLimpieza() {
        vista.dispose();
        vista = null;
        modelo = null;
        controladorPrincipal.iniciaPantallaLimpieza();
    }
    
}
