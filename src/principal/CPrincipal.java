/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import utilidades.Color;
import utilidades.IO_ES;

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
        
        menuOpciones();
    }
    
    
    public static void menuOpciones(){
        
        IO_ES.escribirLN(Color.azul("BIENVENIDOS/AS A LA APLICACIÓN TIENDA INFORMÁTICA"));
        IO_ES.escribirLN(" ----------------------------------------------- ");
        IO_ES.escribirLN(Color.azul("                    PC SUITE \n"));
        
        IO_ES.escribirLN("CLIENTES\n");
        IO_ES.escribirLN("1.- Añadir cliente.");
        IO_ES.escribirLN("2.- Eliminar cliente.");
        IO_ES.escribirLN("3.- Modificar cliente.");
        IO_ES.escribirLN("4.- Listar clientes.");
        
    }
    
}
