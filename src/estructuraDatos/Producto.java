/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import java.util.regex.*;
import utilidades.Color;
import utilidades.IO_ES;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */

public class Producto {
    
    // DECLARACIONES
    
    // Declaraciones de atributos de clase
    
    private static String codigo ;
    private String nombre ;
    private String descripcion ;
    private double precio ;
    private int unidades ;
    
    public Producto (String cod, String nom, String des, double precio, int uni){
        
        codigo = cod ;
        nombre = nom ;
        descripcion = des ;
        this.precio = precio ;
        unidades = uni ;
        
    }
    
    public static boolean comprobarCodigo(String cod){
    
        boolean valido ;
        
        // Comprobación del número de caracteres.
        
        if (cod.length() == 13) // Si tiene los caracteres necesarios aceptará el código y continuará la ejecución.
        {
            codigo = cod ;
        }
        else
        {
            codigo = IO_ES.leerCadena("El código debe tener 13 dígitos: ", 13) ; // Si no tiene los caracteres necesarios los exigirá.
        }
        
        // Comprobación contenido del código.
        
        Pattern p = Pattern.compile("[0-9]{13}"); // Formato codigo: 13 dígitos numéricos.
        Matcher m = p.matcher(codigo);
        
        if (m.matches()) {  // Coincide --> true
            valido = true;
        }else{              // No coincide --> false
            valido = false;
        }
    
        return valido;
    }
    
    
}
