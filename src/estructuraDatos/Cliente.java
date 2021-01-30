/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import utilidades.* ;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */

public class Cliente {
    
    // DECLARACIONES

    // Declaración atributos de clase
    
    private String id ;
    private String nombre ;
    private String direccion ;
    private String telefono ;
    
    // Declaración del constructor
    
   public Cliente (String id, String nom, String dir, String tlf){
        
        // Comprobación de la variable ID
       
        boolean valido ;
        
        valido = comprobarCodigo(cod) ;
        
        if (valido) //      --> Coincide: se almacena.
        {
            codigo = cod ;
        }
        else //             --> No coincide: se almacena una X representando que no es válido.
        {
            codigo = "X" ;
            IO_ES.escribirLN(Color.rojo("X --> El código del producto no es válido." + "\n"));
        }
        
        
        nombre = nom ;
        direccion = dir ;
        telefono = tlf ;
        
    }
    
    // ---------- MÉTODOS ------------
   
    
   // ID 
   
   public String getId(){ // Devuelve ID
        
        return id ;
    }
    
    public void setId(String id){ // Almacena ID (DNI / NIE)
        
        boolean valido ;
        boolean validador = false ;
        
        
        // Comprobación del número de caracteres.
                
        do 
        {
            
            if (id.length() == 9) // Si tiene los caracteres necesarios aceptará el código y continuará la ejecución.
            {
                valido = ValidarDatos.validarNif(id) ;
                validador = true ;
            }
            else
            {
                id = IO_ES.leerCadena("El NIF que has introducido no tiene el número de caracteres válidos. "
                        + "Normalmente está formado por 8 números y una letra al final (DNI). También puede "
                        + "estar formado por una letra al principio, 7 números y otra letra al final, como "
                        + "es el caso de los NIE. Por favor, no uses espacios ni guiones.", 9) ; // Si no tiene los caracteres necesarios los exigirá.
            }
            
        } while (!validador);
        
        
        // 
        
    
    }
    
    
    // Nombre
    
    public String getNombre(){ // Devuelve nombre
        
        return nombre ;
    }
    
    public void setNombre(String nom){ // Almacena nombre
        
        this.nombre = nom ;
    }
    
    
    // Dirección
    
    public String getDireccion(){ // Devuelve dirección
        
        return direccion ;
    }
    
    public void setDireccion(String dir){ // Almacena dirección
        
        this.direccion = dir ;
    }
    
    
    // Teléfono
    
    public String getTelefono(){ // Devuelve teléfono
        
        return telefono ;
    }
    
    public void setTelefono(String tlf){ // Almacena teléfono
        
        this.telefono = tlf ;
    }
    
    
    // SALIDA DE DATOS
    
    @Override
    public String toString(){
        
        return "------------------------------" + 
                "\n - id: " + Color.azul(id) + 
                "\n - Nombre del cliente: " + Color.azul(nombre)+ 
                "\n - Dirección del cliente: " + Color.azul(direccion)+ 
                "\n - Teléfono: " + Color.azul(telefono)+
                "\n------------------------------" ;
    }
    
      
}
