/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.Connection;
/**
 *
 * @author Joni
 */
public class LoginAcceso {
        private Connection con=null;
        
        public LoginAcceso(){
            con = LoginConexion.getConexion();
        }
        
}
