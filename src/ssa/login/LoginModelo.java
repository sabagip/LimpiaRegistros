/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssa.login;

import ssa.login.LoginControlador;

/**
 *
 * @author sergio
 */
public class LoginModelo {

    private LoginControlador coordinador;

    public void setCoordinador(LoginControlador coordinador) {
        this.coordinador = coordinador;
    }

    /**
     * 
     * @param usuario Nombre de usuario
     * @param pass  Contraseña del usuario
     * @return Datos de usuario o nulo
     */
    public boolean validaLogin(String usuario, String pass) {
        boolean response = false;
        if( usuario.equals("admin") && pass.equals("admin")){
            response = true;
        }
        return response;
    }
    
}
