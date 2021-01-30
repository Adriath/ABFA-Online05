/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.*;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */

public class ValidarDatos { // Comprueba DNI / NIE de personas físicas
    
    private static boolean valido = false ;
    
    public static boolean validarNif(String nif){
        
        valido = false;
        
        Pattern p = Pattern.compile("[0-9]{8}[a-zA-Z]|[kKlLmMxXyYzZ][0-9]{7}[a-zA-Z]") ; // Formato NIF: 12345678A (8 números + 1 letra) / A1234567B (1 letra (K, L, M, X, Y ó Z) + 7 números + 1 letra).
        Matcher m = p.matcher(nif) ;
        
        if (nif.length() == 9) 
        {
            if (m.matches()) {
                valido = true ;                
            }
        }
        else
        {
            IO_ES.escribirLN(Color.rojo("El NIF debe tener 9 caracteres." + "\n")); // ----------- MENSAJE PROVISIONAL --------------------
        }
                
        return valido ;
    }
    
    
    // MÉTODO PARA COMPROBAR LA VARIABLE PRECIO DE LA CLASE PRODUCTO. HAY UNA NOTA EN EL CONSTRUCTOR DE LA CLASE.
    
//    public static boolean comprobarPrecio(double precio){
//        
//        if (precio <= 0) //      --> Si el precio es positivo lo aceptará. En caso contrario no lo dará por válido.
//        {
//            valido = true ;
//        }
//            
//        return valido ;
//    }
    
    
}
