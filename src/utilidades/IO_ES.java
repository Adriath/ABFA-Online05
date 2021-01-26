/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.* ;

/*              ----------------- NOTAS -------------------

  - En la clase leerEnteroLargo() he respetado el nombre antiguo (leerIntegerLargo()).
    Si vamos a utilizar estos métodos considero que me será menos confuso al seguir
    la misma línea que el método leerInteger().
  - Como caso contrario, en la clase leerString() he adoptado el nuevo nombre del 
    ejercicio porque me parece más acertado (leerCadenas()).
  - He cambiado de orden los encabezados de los métodos: static public --> public static.
  - He sustituido todos los parámetros mensaje por msg.

*/


/**
 * Esta clase contiene los métodos estáticos que permiten la lectura de 
 * distintos tipos de datos desde teclado y muestra texto por consola.
 * 
 * @author Adrián Arjona
 * @version 1.2
 */
public class IO_ES {
    
     /**
     * Pide al usuario que introduzca un número entero por teclado.
     * 
     * @return Int. Número entero introducido por el usuario.
     */
    
    public static int leerInteger(){
                
        int numero = 0;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print("Introduce un número entero, por favor: ");
            String num = teclado.nextLine();
        
            try
            {
                numero = Integer.parseInt(num);
                validador = true;
            }
            catch (NumberFormatException e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra u otro carácter no válido." + "\n"));
            }
            catch (Exception e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra u otro carácter no válido." + "\n"));
            }
            
        } while (validador == false);
        
        
        return  numero;
        
    }
    
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un número entero por teclado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return Int. Número entero introducido por el usuario.
     */
    
    public static int leerInteger(String msg){
        
        int numero = 0;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
        
            try
            {
                numero = Integer.parseInt(num);
                validador = true;
            }
            catch (NumberFormatException e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra u otro carácter no válido." + "\n"));
            }
            catch (Exception e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra u otro carácter no válido." + "\n"));
            }
            
        } while (validador == false);
        
        
        return  numero;
        
    }
    
     /**
     * 
     * Pide al usuario un número entero mediante un mensaje personalizado y el mínimo aceptado.
     * 
     * @param msg String. Introduce un texto para que aparezca por pantalla.
     * @param min Int. El número introducido por el usuario deberá ser mayor a este número.
     * @return Devuelve int introducido por el usuario.
     */
    
    public static int leerInteger(String msg, int min){
        
        int numero = 0;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
        
            try
            {
                numero = Integer.parseInt(num);
                
                if (numero < min) 
                {
                    System.out.println("\n" + Color.rojo("El número debe ser igual o mayor que " + min) + "\n");
                    validador = false ;
                }
                else
                {
                    validador = true;
                }
                
                
            }
            catch (NumberFormatException e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra u otro carácter no válido.") + "\n");
            }
            catch (Exception e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra u otro carácter no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return  numero;
        
    }
    
    /**
     * Pide un número al usuario mediante un mensaje personalizado. El número debe estar comprendido entre los valores min y max.
     * 
     * @param msg String. Mensaje para mostrar por pantalla.
     * @param min int. Valor mínimo aceptado.
     * @param max int. Valor máximo aceptado.
     * @return int. Devuelve número introducido por el usuario.
     */
    public static int leerInteger(String msg, int min, int max){
        
        int numero = 0;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
        
            try
            {
                numero = Integer.parseInt(num);
                
                if (numero < min) 
                {
                    System.out.println("\n" + Color.rojo("El número debe ser igual o mayor que " + min) + "\n");
                    validador = false ;
                }
                else if (numero > max) {
                    
                    System.out.println("\n" + Color.rojo("El número debe ser igual o menor que " + max) + "\n");
                    validador = false ;
                }
                else
                {
                    validador = true;
                }
                
                
            }
            catch (NumberFormatException e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra u otro carácter no válido.") + "\n");
            }
            catch (Exception e){

                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra u otro carácter no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return  numero;
        
    }
    
    /**
     * Pide al usuario que introduzca un número real por teclado.
     * 
     * @return Float. Número real introducido por el usuario.
     */
    
    public static float leerReal(){
        
        float numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print("Introduce un número real, por favor: ");
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto." + "\n"));
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido."+ "\n"));
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
       
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un número real por teclado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return Float. Número real introducido por el usuario.
     */
    
    public static float leerReal(String msg){
        
        float numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("\n¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("\n¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un número real por teclado y el valor mínimo admitido.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @param min tipo int. Valor mínimo permitido.
     * @return Float. Número real introducido por el usuario.
     */
    
    public static float leerReal(String msg, int min){
        
        float numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                
                if (numero < min) 
                {
                    System.out.println("\n" + Color.rojo("El número debe ser igual o mayor que " + min) + "\n");
                    validador = false ;
                }
                else
                {
                    validador = true;
                }
                
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("\n¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("\n¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario que introduzca un número entero largo por teclado.
     * 
     * @return Long. Número entero largo introducido por el usuario.
     */
    
    public static long leerIntegerLargo(){
        
        long numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
                
        do 
        {
            
            System.out.print("Introduce un número entero largo, por favor: ");
            String num = teclado.nextLine();
            
            try
            {
                numero = Long.parseLong(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un número entero largo por teclado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return Long. Número entero largo introducido por el usuario.
     */
    
    public static long leerIntegerLargo(String msg){
        
        long numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
                
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
            
            try
            {
                numero = Long.parseLong(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario que introduzca un número real largo por teclado.
     * 
     * @return Double. Número real largo introducido por el usuario.
     */
    
    public static double leerRealLargo(){
        
        double numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
                
        do 
        {
            
            System.out.print("Introduce un número real largo, por favor: ");;
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un número real largo por teclado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return Double. Número real largo introducido por el usuario.
     */
    
    public static double leerRealLargo(String msg){
        
        double numero = 0 ;
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
                
        do 
        {
            
            System.out.print(msg);
            String num = teclado.nextLine();
            
            try
            {
                numero = Float.parseFloat(num);
                validador = true ;
            }
            catch (NumberFormatException e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Has introducido una letra o un número no válido. La coma debe ser un punto.") + "\n");
            }
            catch (Exception e){
                
                System.out.println("\n" + Color.rojo("¯\\_(ツ)_/¯ Puede que hayas introducido una letra o un número no válido.") + "\n");
            }
            
        } while (validador == false);
        
        
        return numero ;
        
    }
    
    
    /**
     * Pide al usuario un mensaje tipo String por teclado.
     * 
     * @return tipo String. Devuelve el mensaje introducido por teclado.
     */
    
    public static String leerCadena(){
        
        Scanner teclado = new Scanner(System.in);
            
        System.out.print("Introduce una cadena de caracteres, por favor: ");
        String mensajeUsuario = teclado.nextLine();
        
        return mensajeUsuario ;
        
    }
    
    /**
     * Pide al usuario un mensaje tipo String por teclado mediante un mensaje personalizado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return tipo String. Devuelve el mensaje introducido por teclado.
     */
    
    public static String leerCadena(String msg){
        
        Scanner teclado = new Scanner(System.in);
            
        System.out.print(msg);
        String mensajeUsuario = teclado.nextLine();
        
        return mensajeUsuario ;
        
    }
    
    
    /**
     * Pide al usuario un mensaje tipo String por teclado mediante un mensaje personalizado. Se pide la longitud exacta.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @param longitud tipo int. Longitud exacta deseada de la cadena de caracteres.
     * @return Devuelve el mensaje introducido por teclado como String.
     */
    
    public static String leerCadena(String msg, int longitud){
        
        String mensajeUsuario = "" ;
        boolean validador = false ;
                
        Scanner teclado = new Scanner(System.in);
            
        do {
            
            System.out.print(msg);
            mensajeUsuario = teclado.nextLine();
            
            if (mensajeUsuario.length() == longitud) 
            {
                validador = true ;
            }
            else
            {
                System.out.println("\n" + Color.rojo("La cadena debe tener una longitud de " + longitud + " caracteres.") + "\n");
            }
            
        } while (!validador);
        
        return mensajeUsuario ;
        
    }
    
    
    /**
     * Pide al usuario que introduzca un caracter por teclado.
     * 
     * @return Tipo char. Caracter introducido por el usuario.
     */
    
    public static char leerCaracter(){
        
        char caracter = 'a';
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print("Introduce un caracter, por favor: ");
            String car = teclado.nextLine();
        
            if (car.length() == 1)
                {
                    caracter = car.charAt(0) ;
                    validador = true ;
                }
                else
                {
                    System.out.println("\n" + Color.rojo("Introduce tan sólo un caracter.") + "\n");
                    validador = false ;
                }
            
                        
        } while (validador == false);
        
        
        return  caracter;
        
    }
    
    /**
     * Pide al usuario mediante un mensaje personalizado que introduzca un caracter por teclado.
     * 
     * @param msg tipo String. Introduce un texto para que salga por pantalla.
     * @return Tipo char. Caracter introducido por el usuario.
     */
    
    public static char leerCaracter(String msg){
                
        char caracter = 'a';
        boolean validador = false ;
        Scanner teclado = new Scanner(System.in);
        
        do 
        {
            
            System.out.print(msg);
            String car = teclado.nextLine();
        
            if (car.length() == 1)
                {
                    caracter = car.charAt(0) ;
                    validador = true ;
                }
                else
                {
                    System.out.println("\n" + Color.rojo("Introduce tan sólo un caracter.") + "\n");
                    validador = false ;
                }
            
                        
        } while (validador == false);
        
        
        return  caracter;
        
    }
    
    /**
     * Pide al usuario que indique sí o no (true / false) a través de un menú.
     * 
     * @return Tipo boolean. Devuelve true o false dependiendo de la opción elegida por el usuario.
     */
    
    public static boolean leerBooleano(){
                
        int opcion = 0;
        boolean validador = false ;
        boolean resultado = false ;
        
        Scanner teclado = new Scanner(System.in);
        
        do {
            
            // Menú
            
            System.out.println("MENÚ\n") ;
            System.out.println("1. Sí.") ;
            System.out.println("2. No.") ;
            System.out.println("-----------------------");
            System.out.print("Elige sí/no: ") ;
            
            // Procesamiento
            
            try
            {
                opcion = teclado.nextInt() ;
                teclado.nextLine() ;
            }
            catch (InputMismatchException e)
            {
                System.out.println("\n" + Color.rojo("Puede que hayas introducido una letra.") + "\n");
                teclado.nextLine() ;
            }
            catch (Exception e)
            {
                System.out.println("\n" + Color.rojo("Has introducido un valor no permitido.") + "\n");
                teclado.nextLine() ;
            }
            
            switch (opcion)
            {
                case 1:
                    
                    resultado = true ;
                    validador = true ;
                    
                    break ;
                    
                case 2:
                    
                    resultado = false ;
                    validador = true ;
                    
                    break ;
                    
                default:
                    
                    System.out.println("\n" + Color.rojo("Elige una opción válida: sí/no.") + "\n");
            }
            
        } while (!validador);
        
        
        return  resultado;
        
    }
    
    public static void main(String[] args) {
        System.out.println(leerBooleano());
    }
    
     /**
     * Pide al usuario que indique sí o no (true / false) mediante un mensaje personalizado.
     * 
     * @param msg Tipo String. Mensaje para mostrar por pantalla.
     * @return Tipo boolean. Devuelve true o false dependiendo de la opción elegida por el usuario.
     */
    
    public static boolean leerBooleano(String msg){
                
        String cadena ;
        boolean validador = false ;
        boolean resultado = false ;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(msg); // Mensaje pasado por parámetro para el usuario
        
        do {
            
            cadena = teclado.nextLine() ;
            
            if (cadena.matches("SI|Si|si|yes|Yes|YES|s|S")) // Si dice que sí --> true
            {
                resultado = true ;
                validador = true ;
            }
            else if (cadena.matches("NO|No|no|N|n")) // Si dice que no --> false
            {
                resultado = false ;
                validador = true ;
            }
            else
            {
                System.out.println(Color.rojo("Elige sí/no. No se aceptan tildes."));
            }
            
        } while (!validador);
        
        
        return  resultado;
        
    }
    
    /**
     * Lee un mensaje String escrito por parámetro y lo muestra por pantalla.
     * 
     * @param msg String. Muestra en la misma línea el mensaje recogido por parámetro.
     */
    
    public static void escribir(String msg){
        
        System.out.print(msg);
        
    }
    
    /**
     * Lee un mensaje String escrito por parámetro y lo muestra por pantalla con salto de línea.
     * 
     * @param msg String. Muestra el mensaje recogido por parámetro y añade un salto de línea.
     */
    
    public static void escribirLN(String msg){
        
        System.out.println(msg);
       
    }
        
}