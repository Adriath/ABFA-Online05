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
        
        /* NOTA: 
        
        Podría haber creado el método comprobarPrecio() dentro de la clase
        ValidarDatos (o en ésta misma) para realizar la comprobación igual que 
        se ha hecho con la variable código. 
        Para ceñirme a los métodos que pide el enunciado haré la comprobación 
        sin la creación de dicho método. De esta forma pueden verse dos formas 
        posibles de abordar un mismo problema. Aplíquese también a la
        variable unidades.
        
        Actualización:
        
        He creado dicho método pero lo he dejado comentado para que
        pueda verse la otra forma en la que se hubiera implementado y esté
        preparada para usarse en un futuro.
        
        Este mismo comentario está en el método setPrecio().
        */
        
        
        // Comprobación variable CÓDIGO (debe tener 13 dígitos)
        
        
        boolean valido ;
        boolean validador = false;
        
        do 
        {
            
            if (cod.length() == 13) // --> Si el código tiene 13 dígitos realizará la comprobación.
            {
            valido = comprobarCodigo(cod) ;
            
                 if (valido) //      --> Coincide: se almacena.
                {
                    codigo = cod ;
                    validador = true ;
                }
                else //             --> No coincide: se almacena una X representando que no es válido.
                {
                    codigo = "X" ;
                    IO_ES.escribirLN(Color.rojo("X --> El código del producto no es válido." + "\n"));
                    validador = true ;
                }
            }
            else // --> Si no tiene 13 dígitos los pedirá para poder hacer la comprobación.
            {
                cod = IO_ES.leerCadena(Color.rojo("Introduzca un código de 13 dígitos: "), 13) ;
            }
            
        } while (!validador);
        
        
        
        
        
        
        
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
    
   
    
    public boolean anadirUnidades(int uni){
        
        boolean valido ;
        
        while (uni == 0) // Si las unidades introducidas son igual a 0 se pedirá un número positivo para continuar.
        {
            uni = IO_ES.leerInteger(Color.rojo("El 0 no es válido. Introduzca una cantidad positiva: "), 1) ;
        }
        
        if (uni < 0) //             --> Si el número es negativo indicará no se almacenará.
        {
            IO_ES.escribir(Color.rojo("No se ha realizado la actualicación de los datos." + "\n"));
            valido = false ;
        }
        else  //                    --> Si el número es positivo, se almacenará.
        {
            unidades += uni ;
            valido = true ;
        }
            
                
        return valido ;
    }
    
        
    public boolean quitarUnidades(int uni){
        
        boolean valido ;
        
        while (uni == 0) // Si las unidades introducidas son igual a 0 se pedirá un número positivo para continuar.
        {
            uni = IO_ES.leerInteger(Color.rojo("El 0 no es válido. Introduzca una cantidad positiva: "), 1) ;
        }
        
        if (uni < 0) //             --> Si el número es negativo indicará no se almacenará.
        {
            IO_ES.escribir(Color.rojo("No se ha realizado la actualicación de los datos." + "\n"));
            valido = false ;
        }
        else  //                    --> Si el número es positivo, continúa la ejecución
        {
            if (unidades >= uni) // --> Si es el stock es positivo, se lleva a cabo la actualización.
            {
                unidades -= uni ;
                valido = true ;
            }
            else // --> Si el stock es negativo, no se lleva a cabo la actualización.
            {
                IO_ES.escribirLN(Color.rojo("El stock no puede ser negativo. No se ha realizado la actualización de los datos." + "\n"));
                valido = false ;
            }
        }
                       
        
        return valido ;
        
    }
    
    
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
        
        /* NOTA: podría haber creado el método comprobarPrecio() dentro de la clase
        ValidarDatos para realizar la comprobación igual que con el código. 
        Para ceñirme a los métodos que pide el enunciado haré la comprobación 
        sin la creación de dicho método. De esta forma pueden verse dos formas 
        posibles de abordar un mismo problema.
        
        Este mismo comentario (ampliado) también está en el constructor.
        */
        
        boolean validador = false ;
        
        do 
        {
            if (precio < 0) //      --> Si el precio es negativo no lo aceptará.
            {
                IO_ES.escribirLN(Color.rojo("El precio no puede ser negativo." + "\n"));
                precio = IO_ES.leerRealLargo("Introduce un precio positivo: ") ;
            }
            else
            {
                this.precio = precio ; // --> Si el precio es positivo se almacena.
                IO_ES.escribirLN(Color.verde("Has cambiado el precio del producto." + "\n")) ;
                validador = true ;
            }
            
        } while (!validador);
        
                
    }
    
    public int getUnidades(){ // Devuelve unidades
        
        return unidades ;
    }
            
    @Override
    public String toString(){
            
        return "------------------------------" + 
                "\n - Código del producto: " + Color.azul(codigo)+ 
                "\n - Nombre: " + Color.azul(nombre) + 
                "\n - Descripción: " + Color.azul(descripcion)+ 
                "\n - Precio: " + Color.azul(precio)+
                "\n - Unidades: " + Color.azul(unidades)+
                "\n------------------------------\n" ;
    }
    
      
}
