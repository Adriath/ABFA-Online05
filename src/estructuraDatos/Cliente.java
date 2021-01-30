/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import utilidades.Color;

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
        
        this.id = id ;
        nombre = nom ;
        direccion = dir ;
        telefono = tlf ;
        
    }
    
    // ---------- MÉTODOS ------------
   
    
   // ID 
   
   public String getId(){ // Devuelve ID
        
        return id ;
    }
    
    public void setId(String id){ // Almacena ID
        
        this.id = id ;
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
