/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.regex.*;
import principal.* ;

/**
 * Alberga métodos para validar datos, como por ejemplo, un DNI.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */

public class ValidarDatos {
    
    
    /**
     * Valida un DNI/NIE.
     * 
     * @param nif tipo String. DNI.
     * @return tipo boolean. True si es válido, false si no.
     */
    
    public static boolean validarNif(String nif){
        
        boolean valido ;
        boolean validador = false ;
        
        // Comprobación del número de caracteres. 
        
                    
            if (nif.length() == 9) // Si tiene los caracteres necesarios aceptará el código y continuará la ejecución.
            {
                validador = true ;
            }
            else
            {
                IO_ES.escribirLN(Color.rojo("El NIF que ha introducido no tiene el número de caracteres válidos. ")) ;
                IO_ES.escribirLN(Color.rojo("Normalmente está formado por 8 números y una letra al final (DNI). También puede ")) ;
                IO_ES.escribirLN(Color.rojo("estar formado por una letra al principio, 7 números y otra letra al final, como ")) ;
                IO_ES.escribirLN(Color.rojo("es el caso de los NIE." + "\n")) ;
                nif = IO_ES.leerCadena("Introduzca de nuevo el DNI/NIE. Por favor, no use espacios ni guiones: " , 9) ; // Si no tiene los caracteres necesarios los exigirá.
            }
        
        
        // Comprobación contenido del código.
        
        
        Pattern p = Pattern.compile("[0-9]{8}[a-zA-Z]|[kKlLmMxXyYzZ][0-9]{7}[a-zA-Z]") ; // Formato NIF: 12345678A (8 números + 1 letra) / A1234567B (1 letra (K, L, M, X, Y ó Z) + 7 números + 1 letra).
        Matcher m = p.matcher(nif) ;
        
        if (m.matches()) {
            valido = true ; //          --> Si coincide devolverá true.
        }
        else
        {
            valido = false ; //         --> Si no coincide devolverá false.
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
    
