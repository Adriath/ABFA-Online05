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
        boolean validador = false ;
        
        do {
            
            if (id.length() == 9) 
            {
                valido = ValidarDatos.validarNif(id) ;
                
                if (valido) 
                {
                    this.id = id;
                    validador = true ;
                }
                else
                {
                    IO_ES.escribirLN(Color.rojo("El NIF introducido no es correcto. Por favor, siga las instrucciones." + "\n"));
                    IO_ES.escribirLN("Inténtelo de nuevo: ");
                }
            }
            else
            {
                IO_ES.escribirLN(Color.rojo("El NIF que ha introducido no tiene el número de caracteres válidos.")) ;
                IO_ES.escribirLN(Color.rojo("Normalmente está formado por 8 números y una letra al final (DNI). ")) ;
                IO_ES.escribirLN(Color.rojo("También puede estar formado por una letra al principio, ")) ;
                IO_ES.escribirLN(Color.rojo("7 números y otra letra al final, como es el caso de los NIE. " + "\n")) ;
                id = IO_ES.leerCadena("Introdúzcalo de nuevo, por favor: ", 9) ;
            }
            
       } while (!validador);
       
        
        
        nombre = nom ; //       NOMBRE
        direccion = dir ; //    DIRECCIÓN
        telefono = tlf ; //     TELÉFONO
        
    }
   
    public static void main(String[] args) {
        Cliente pepe = new Cliente("5358", "Adrián", "C/ Pablo Ruiz Picasso , 6", "669220844") ;
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
