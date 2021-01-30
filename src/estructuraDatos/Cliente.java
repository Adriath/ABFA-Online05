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
        boolean validador = false;
        
        do 
        {
            valido = ValidarDatos.validarNif(id) ; // --> Comprueba si el NIF es correcto.
        
            if (valido) // --> Si es correcto lo almacenenará.
            {
                this.id = id ;
                validador = true ;
            }
            else // --> Si no es correcto volverá a pedirlo hasta que lo sea.
            {
//                id = IO_ES.leerCadena("Introduzca de nuevo el DNI/NIE. Por favor, no use espacios ni guiones: " , 9) ; // Si no tiene los caracteres necesarios los exigirá.
            }
        
        } while (!validador);
        
        
        nombre = nom ; //       NOMBRE
        direccion = dir ; //    DIRECCIÓN
        telefono = tlf ; //     TELÉFONO
        
    }
   
    public static void main(String[] args) {
        Cliente pepe = new Cliente("1234", "Adrián", "C/ Pablo Ruiz Picasso , 6", "669220844") ;
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
