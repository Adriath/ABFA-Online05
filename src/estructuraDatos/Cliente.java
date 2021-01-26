/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

/**
 *
 * @author Adrián Arjona
 * @version 1.0
 */

public class Cliente {
    
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
    
    // Métodos
    
    public String getId(){ // Devuelve ID
        
        return id ;
    }
    
    public void setId(String id){ // Almacena ID
        
        this.id = id ;
    }
    
    public String getNombre(){ // Devuelve nombre
        
        return nombre ;
    }
    
    public void setNombre(String nom){ // Almacena nombre
        
        this.nombre = nom ;
    }
    
    public String getDireccion(){ // Devuelve dirección
        
        return direccion ;
    }
    
    public void setDireccion(String dir){ // Almacena dirección
        
        this.direccion = dir ;
    }
    
    public String getTelefono(){ // Devuelve teléfono
        
        return telefono ;
    }
    
    public void setTelefono(String tlf){ // Almacena teléfono
        
        this.telefono = tlf ;
    }
    
        
}
