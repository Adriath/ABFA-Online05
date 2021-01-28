/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 * Esta clase recoge los códigos de los colores para utilizarlos cómodamente en
 * otras clases.
 * 
 * @author Adrián Arjona
 * @version 2.0
 */
public class Color {
    
    private static final String BLACK="\033[30m"; 
    private static final String RED="\033[31m"; 
    private static final String GREEN="\033[32m"; 
    private static final String YELLOW="\033[33m"; 
    private static final String BLUE="\033[34m"; 
    private static final String PURPLE="\033[35m"; 
    private static final String CYAN="\033[36m"; 
    private static final String WHITE="\033[37m";
    private static final String RESET="\u001B[0m";
    
    
    // MÉTODOS
    
    
    // ---------- NEGRO --------------
    
    /**
     * Colorea indefinidamente en color negro.
     * 
     * @return tipo String. Devuelve el color negro.
     */
    
    public static String negro(){ // GENÉRICO
        
        return BLACK ;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(String msg){ // STRING
        
        String mensajeUsuario = BLACK + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(int num){ // INT
        
        String mensajeUsuario = BLACK + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(long num){ // LONG
        
        String mensajeUsuario = BLACK + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(float num){ // FLOAT
        
        String mensajeUsuario = BLACK + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(double num){ // DOUBLE
        
        String mensajeUsuario = BLACK + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color negro.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String negro(char car){ // CHAR
        
        String mensajeUsuario = BLACK + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ---------------- ROJO --------------------
    
   
    /**
     * Colorea indefinidamente en color rojo.
     * 
     * @return tipo String. Devuelve el color rojo.
     */
    
    public static String rojo(){ // GENÉRICO
        
        return RED ;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(String msg){ // STRING
        
        String mensajeUsuario = RED + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(int num){ // INT
        
        String mensajeUsuario = RED + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(long num){ // LONG
        
        String mensajeUsuario = RED + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(float num){ // FLOAT
        
        String mensajeUsuario = RED + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(double num){ // DOUBLE
        
        String mensajeUsuario = RED + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color rojo.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String rojo(char car){ // CHAR
        
        String mensajeUsuario = RED + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ------------------- VERDE ------------------
    
    
    /**
     * Colorea indefinidamente en color verde.
     * 
     * @return tipo String. Devuelve el color verde.
     */
    
    public static String verde(){ // GENÉRICO
        
        return GREEN ;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String verde(String msg){ // STRING
        
        String mensajeUsuario = GREEN + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String verde(int num){ // INT
        
        String mensajeUsuario = GREEN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String verde(long num){ // LONG
        
        String mensajeUsuario = GREEN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String verde(float num){ // FLOAT
        
        String mensajeUsuario = GREEN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String verde(double num){ // DOUBLE
        
        String mensajeUsuario = GREEN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color verde.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String verde(char car){ // CHAR
        
        String mensajeUsuario = GREEN + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ------------------ AMARILLO ---------------------
    
    
    /**
     * Colorea indefinidamente en color amarillo.
     * 
     * @return tipo String. Devuelve el color amarillo.
     */
    
    public static String amarillo(){ // GENÉRICO
        
        return YELLOW ;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String amarillo(String msg){ // STRING
        
        String mensajeUsuario = YELLOW + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String amarillo(int num){ // INT
        
        String mensajeUsuario = YELLOW + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String amarillo(long num){ // LONG
        
        String mensajeUsuario = YELLOW + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String amarillo(float num){ // FLOAT
        
        String mensajeUsuario = YELLOW + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String amarillo(double num){ // DOUBLE
        
        String mensajeUsuario = YELLOW + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color amarillo.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String amarillo(char car){ // CHAR
        
        String mensajeUsuario = YELLOW + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ----------------------- AZUL ----------------------
    
    
    /**
     * Colorea indefinidamente en color azul.
     * 
     * @return tipo String. Devuelve el color azul.
     */
    
    public static String azul(){ // GENÉRICO
        
        return BLUE ;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String azul(String msg){ // STRING
        
        String mensajeUsuario = BLUE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String azul(int num){ // INT
        
        String mensajeUsuario = BLUE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String azul(long num){ // LONG
        
        String mensajeUsuario = BLUE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String azul(float num){ // FLOAT
        
        String mensajeUsuario = BLUE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String azul(double num){ // DOUBLE
        
        String mensajeUsuario = BLUE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color azul.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String azul(char car){ // CHAR
        
        String mensajeUsuario = BLUE + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    // -------------------- PÚRPURA ----------------------
    
    
    /**
     * Colorea indefinidamente en color púrpura.
     * 
     * @return tipo String. Devuelve el color púrpura.
     */
    
    public static String purple(){ // GENÉRICO
        
        return PURPLE ;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String purple(String msg){ // STRING
        
        String mensajeUsuario = PURPLE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String purple(int num){ // INT
        
        String mensajeUsuario = PURPLE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String purple(long num){ // LONG
        
        String mensajeUsuario = PURPLE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String purple(float num){ // FLOAT
        
        String mensajeUsuario = PURPLE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String purple(double num){ // DOUBLE
        
        String mensajeUsuario = PURPLE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color púrpura.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String purple(char car){ // CHAR
        
        String mensajeUsuario = PURPLE + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ------------------ CYAN -------------------
    
    
    /**
     * Colorea indefinidamente en color cyan.
     * 
     * @return tipo String. Devuelve el color cyan.
     */
    
    public static String cyan(){ // GENÉRICO
        
        return CYAN ;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String cyan(String msg){ // STRING
        
        String mensajeUsuario = CYAN + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String cyan(int num){ // INT
        
        String mensajeUsuario = CYAN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String cyan(long num){ // LONG
        
        String mensajeUsuario = CYAN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String cyan(float num){ // FLOAT
        
        String mensajeUsuario = CYAN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String cyan(double num){ // DOUBLE
        
        String mensajeUsuario = CYAN + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color cyan.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String cyan(char car){ // CHAR
        
        String mensajeUsuario = CYAN + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    
    // ------------------ BLANCO ---------------------
    
    
    /**
     * Colorea indefinidamente en color blanco.
     * 
     * @return tipo String. Devuelve el color blanco.
     */
    
    public static String blanco(){ // GENÉRICO
        
        return WHITE ;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param msg tipo String. Mensaje a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    public static String blanco(String msg){ // STRING
        
        String mensajeUsuario = WHITE + msg + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param num tipo int. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String blanco(int num){ // INT
        
        String mensajeUsuario = WHITE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param num tipo long. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String blanco(long num){ // LONG
        
        String mensajeUsuario = WHITE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param num tipo float. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String blanco(float num){ // FLOAT
        
        String mensajeUsuario = WHITE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param num tipo double. Número a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String blanco(double num){ // DOUBLE
        
        String mensajeUsuario = WHITE + num + RESET ;
        
        return mensajeUsuario;
    }
    
    /**
     * Colorea el texto en color blanco.
     * 
     * @param car tipo char. Caracter a colorear.
     * @return tipo String. Mensaje coloreado.
     */
    
    public static String blanco(char car){ // CHAR
        
        String mensajeUsuario = WHITE + car + RESET ;
        
        return mensajeUsuario;
    }    
    
    // --------------------- RESET -----------------------
    
    /**
     * Restuara el color por defecto de la fuente.
     * 
     * @return tipo String. Devuelve la constante RESET.
     */
    public static String reset(){
        
        return RESET ;
    }
    
}
