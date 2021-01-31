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
         
            if (nom.matches("\\S+")) //     --> Si el nombre no está vacío, se almacena.
            {
               nombre = nom ;
               validador = true ;
            }
            else //                         --> Si está vacío se volverá a pedir.
            {
                IO_ES.escribirLN(Color.rojo("El nombre no puede estar vacío." + "\n")) ;
                nom = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ") ;
            }
            
            
        } while (!validador);
       
        
        
        direccion = dir ; //    DIRECCIÓN
        telefono = tlf ; //     TELÉFONO
        
    }
   
    public static void main(String[] args) {
        Cliente pepe = new Cliente("53581573z", "", "C/ Pablo Ruiz Picasso , 6", "669220844") ;
        System.out.println(pepe);
    }
    
    // ---------- MÉTODOS ------------
   
    
   // ID 
   
   public String getId(){ // Devuelve ID
        
        return id ;
    }
    
    public void setId(String id){ // Almacena ID (DNI / NIE)

        this.id=id;
    
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
                "\n - Id: " + Color.azul(this.id) + 
                "\n - Nombre del cliente: " + Color.azul(nombre)+ 
                "\n - Dirección del cliente: " + Color.azul(direccion)+ 
                "\n - Teléfono: " + Color.azul(telefono)+
                "\n------------------------------" ;
    }
    
      
}
