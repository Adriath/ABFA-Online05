/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import utilidades.* ;
import java.util.regex.* ;

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
        
       
        // Comprobación de la variable ID (el NIF debe ser válido)
        
       
        boolean valido ;
        boolean validador = false ;
        
        do {
            
            if (id.length() == 9) // --> Si el ID tiene 9 caractes...
            {
                valido = ValidarDatos.validarNif(id) ; // --> ... iniciará la validación.
                
                if (valido) // --> Si es válido lo almacenará.
                {
                    this.id = id;
                    validador = true ;
                }
                else // --> Si no es válido lo pedirá de nuevo. Solamente lo aceptará si contiene 9 caracteres.
                {
                    IO_ES.escribirLN(Color.rojo("El NIF introducido no es válido." + "\n"));
                    id = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ", 9) ;
                }
            }
            else // --> Si directamente no tiene 9 caracteres no iniciará la validación. Explicará el formato y volverá a pedir el NIF.
            {
                IO_ES.escribirLN(Color.rojo("El NIF que ha introducido no tiene el número de caracteres válidos.")) ;
                IO_ES.escribirLN(Color.rojo("Normalmente está formado por 8 números y una letra al final (DNI). ")) ;
                IO_ES.escribirLN(Color.rojo("También puede estar formado por una letra al principio, ")) ;
                IO_ES.escribirLN(Color.rojo("7 números y otra letra al final, como es el caso de los NIE. " + "\n")) ;
                id = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ", 9) ;
            }
            
       } while (!validador);
       
        
        //Comprobración de la variable NOMBRE. (No puede estar vacío)
        
        
        validador = false ;
        
        do 
        {
         
            if (nom.matches("\\S.{1,}")) //     --> Si el nombre no está vacío (ni comienza por espacio), se almacena.
            {
               nombre = nom ;
               validador = true ;
            }
            else //                         --> Si está vacío se volverá a pedir.
            {
                IO_ES.escribirLN(Color.rojo("El nombre no puede estar vacío ni comenzar con un espacio." + "\n")) ;
                nom = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
        
       
        //Comprobración de la variable DIRECCIÓN. (No puede estar vacía)
        
        
        validador = false ;
        
        do 
        {
         
            if (dir.matches("\\S.{1,}")) //     --> Si la dirección no está vacía (ni comienza por espacio), se almacena.
            {
               direccion = dir ;
               validador = true ;
            }
            else //                         --> Si está vacía se volverá a pedir.
            {
                IO_ES.escribirLN(Color.rojo("La dirección no puede estar vacía ni comenzar con un espacio." + "\n")) ;
                dir = IO_ES.leerCadena("Introdúzcala de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
        
        
        //Comprobración de la variable TELÉFONO. (No puede estar vacío)
        
        
        validador = false ;
        
        do 
        {
         
            if (tlf.matches("\\S.{1,}")) //     --> Si el teléfono no está vacío (ni comenzar por espacio), se almacena.
            {
               telefono = tlf ;
               validador = true ;
            }
            else //                         --> Si está vacío se volverá a pedir.
            {
                IO_ES.escribirLN(Color.rojo("El teléfono no puede estar vacío ni comenzar con un espacio." + "\n")) ;
                tlf = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
        
    }
   
    
    // ------------------ MÉTODOS ---------------------
   
    
   // ID
   
   public String getId(){ // Devuelve ID
        
        return id ;
    }
    
    
    // Nombre
    
    public String getNombre(){ // Devuelve nombre
        
        return nombre ;
    }
    
        
    
    // Dirección
    
    public String getDireccion(){ // Devuelve dirección
        
        return direccion ;
    }
    
    public void setDireccion(String dir){ // Almacena dirección
        
        boolean validador = false ;
        
        do 
        {
         
            if (dir.matches("\\S.{1,}")) //     --> Si la dirección no está vacía (ni comienza por espacio), se almacena.
            {
               direccion = dir ;
               IO_ES.escribirLN(Color.verde("La dirección ha sido cambiada con éxito." + "\n")) ;
               validador = true ;
            }
            else //                         --> Si está vacía se volverá a pedir.
            {
               IO_ES.escribirLN(Color.rojo("La dirección no puede estar vacía ni comenzar con un espacio." + "\n")) ;
               dir = IO_ES.leerCadena("Introdúzcala de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
    }
    
    
    // Teléfono
    
    public String getTelefono(){ // Devuelve teléfono
        
        return telefono ;
    }
    
    public void setTelefono(String tlf){ // Almacena teléfono
        
        boolean validador = false ;
        
        do 
        {
         
            if (tlf.matches("\\S.{1,}")) //     --> Si el teléfono no está vacío (ni comenzar por espacio), se almacena.
            {
               telefono = tlf ;
                IO_ES.escribirLN(Color.verde("El teléfono ha sido cambiado con éxito." + "\n")) ;
               validador = true ;
            }
            else //                         --> Si está vacío se volverá a pedir.
            {
                IO_ES.escribirLN(Color.rojo("El teléfono no puede estar vacío ni comenzar con un espacio." + "\n")) ;
                tlf = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
    }
    
    
    // SALIDA DE DATOS
    
    @Override
    public String toString(){
        
        return "------------------------------" + 
                "\n - Id: " + Color.azul(this.id) + 
                "\n - Nombre del cliente: " + Color.azul(nombre)+ 
                "\n - Dirección del cliente: " + Color.azul(direccion)+ 
                "\n - Teléfono: " + Color.azul(telefono)+
                "\n------------------------------\n" ;
    }
    
      
}
