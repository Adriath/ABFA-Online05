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
        
        
        // Comprobación variable CÓDIGO (debe tener 13 dígitos)
        
        
        boolean valido ;
        
        valido = comprobarCodigo(cod) ;
        
        if (valido) //      --> Coincide: se almacena.
        {
            codigo = cod ;
        }
        else //             --> No coincide: se almacena una X representando que no es válido.
        {
            codigo = "X" ;
            IO_ES.escribirLN("X --> El código del producto no es válido.");
        }
        
        
        nombre = nom ; // NOMBRE
        descripcion = des ; // DESCRIPCIÓN
        
        
        // Comprobación de variable PRECIO (no puede ser negativo).
        
        
        if (precio < 0) //      --> Si el precio es negativo se guardará como 0.
        {
            this.precio = 0 ;
        }
        else
        {
            this.precio = precio ; // --> Si el precio es positivo se almacena.
        }
        
        
        // Comprobación de variable UNIDADES (no puede ser negativa).
        
        
        if (uni < 0) //    --> Si las unidades son negativas se guardarán como 0.
        {
            unidades = 0 ;
        }
        else
        {
            unidades = uni ; // --> Si las unidades son positivas se almacenan.
        }
        
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
            codigo = IO_ES.leerCadena("Introduce un código numérico de 13 dígitos: ", 13) ; // Si no tiene los caracteres necesarios los exigirá.
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
    
    // --------- AQUÍ VAN LOS MÉTODOS anadirUnidades(Integer):Boolean y quitarUnidades(...) ------------
    
    public static String getCodigo(){ // Devuelve código
        
        return codigo ;
    }
    
    public void setCodigo(String cod){ // Almacena código
        
        boolean valido ;
        boolean validador = false;
        
        do 
        {
            valido = comprobarCodigo(cod) ; // --> Comprueba si el código es correcto.
        
            if (valido) // --> Si es correcto lo almacenenará.
            {
                IO_ES.escribirLN(Color.verde("Código de producto almacenado." + "\n")); // --> Si tiene 13 caracteres 
                validador = true ;
            }
            else // --> Si no es correcto volverá a pedirlo hasta que lo sea.
            {
                IO_ES.escribirLN(Color.rojo("El código debe estar formado por números." + "\n"));
            }
        
        } while (!validador);
        
                
    }
    
    public String getNombre(){ // Devuelve nombre
        
        return nombre ;
    }
    
    public void setNombre(String nom){ // Almacena nombre
        
        nombre = nom ;
    }
    
    public String getDescripcion(){ // Devuelve descripción
        
        return descripcion ;
    }
    
    public void setDescripcion(String des){ // Almacena descripción
        
        descripcion = des ;
    }    
    
    public double getPrecio(){ // Devuelve precio
        
        return precio ;
    }
    
    public void setPrecio(double precio){ // Almacena precio
        
        this.precio = precio ;
    }
    
    public int getUnidades(){ // Devuelve unidades
        
        return unidades ;
    }
            
    @Override
    public String toString(){ //PROVISIONAL
            
        return codigo + "\n" + nombre + "\n" + descripcion + "\n" + precio + "\n" + unidades ;
        
//        "------------------------------" + 
//                "\n - Nombre del cliente: " + Color.azul(nombre)+ 
//                "\n - id: " + Color.azul(id) + 
//                "\n - Dirección del cliente: " + Color.azul(direccion)+ 
//                "\n - Teléfono: " + Color.azul(telefono)+
//                "\n------------------------------" ;
    }
    
        public static void main(String[] args) {
        
            Producto Hacendado = new Producto("1234567890123", "nom", "des", 1, 2) ;
            System.out.println(Hacendado);
                        
    }
}
