/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author Joni
 */
public class EntidadesLogin {
    private String usuario;
    private String password;
    private boolean mantenerConectado;

    public EntidadesLogin(String usuario, String password, boolean mantenerConectado) {
        this.usuario = usuario;
        this.password = password;
        this.mantenerConectado = mantenerConectado;
    }
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isMantenerConectado() {
        return mantenerConectado;
    }

    public void setMantenerConectado(boolean mantenerConectado) {
        this.mantenerConectado = mantenerConectado;
    }
    
 

}
