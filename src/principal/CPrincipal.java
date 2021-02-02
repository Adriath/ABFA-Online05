/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import utilidades.Color;
import utilidades.IO_ES;
import estructuraDatos.* ;

/**
 * Menú desde el que añadir o quitar productos y/o clientes, entre otras opciones.
 * Contiene el método principal.
 * 
 * @author Adrián Arjona
 * @version 1.0
 */
public class CPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
//        menuOpciones();
        anadirCliente();
    }
    
    
    // DECLARACIONES VARIABLES
    
    private static String [] clientes = new String[5] ;
    private static String [] productos = new String[5] ;
    
    // MÉTODOS 
    
    
    public static void menuOpciones(){
        
        // Declaración de variables.
        
        int opcion ;
        boolean validador = false ;
        
        // ---------- Procesamiento ------------

        // PARTE VISIBLE
        
        IO_ES.escribirLN(Color.azul("BIENVENIDOS/AS A LA APLICACIÓN TIENDA INFORMÁTICA"));
        IO_ES.escribirLN(" ----------------------------------------------- ");
        IO_ES.escribirLN(Color.azul("                    PC SUITE \n"));
        
        IO_ES.escribirLN("CLIENTES\n");
        IO_ES.escribirLN("1.- Añadir cliente.");
        IO_ES.escribirLN("2.- Eliminar cliente.");
        IO_ES.escribirLN("3.- Modificar cliente.");
        IO_ES.escribirLN("4.- Listar clientes.");
        
        IO_ES.escribirLN("\nPRODUCTOS\n");
        IO_ES.escribirLN("5.- Añadir producto.");
        IO_ES.escribirLN("6.- Eliminar producto.");
        IO_ES.escribirLN("7.- Modificar producto.");
        IO_ES.escribirLN("8.- Añadir unidades.");
        IO_ES.escribirLN("9.- Quitar unidades");
        IO_ES.escribirLN("10.- Listar productos.");
        IO_ES.escribirLN("\n0.- Salir.\n");
        
        opcion = IO_ES.leerInteger("Introduzca una opción, por favor: ", 0, 10) ;
        
        // CONTENIDO
        
        do {
            
            switch (opcion){
                
                case 1:
                    
                    
                
            }
            
        } while (!validador);
        
        
    }
    
    public static Cliente anadirCliente(){
        
        String id ;
        String nom ;
        String dir ;
        String tlf ;
        String etiqueta ;
        
        IO_ES.escribirLN(Color.azul("AÑADIR CLIENTE"));
        IO_ES.escribirLN("------------------");
        
        id = IO_ES.leerCadena("Introduzca el NIF del cliente: ", 9) ;
        nom = IO_ES.leerCadena("Introduzca el nombre del cliente: ") ;
        dir = IO_ES.leerCadena("Introduzca la dirección del cliente: ") ;
        tlf = IO_ES.leerCadena("Introduzca el teléfono del cliente: ") ;
        
        Cliente cliente = new Cliente(id, nom, dir, tlf) ;
        
        return cliente ;
    }
    
    
}
