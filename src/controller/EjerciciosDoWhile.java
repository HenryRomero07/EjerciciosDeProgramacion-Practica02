/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que contiene ejercicios prácticos utilizando la estructura de control do-while.
 * Los ejercicios incluyen adivinanza de números, cálculo de promedios, construcción
 * de cadenas y cálculo de potencias.
 * 
 * @author HenryRomero
 */
public class EjerciciosDoWhile {
    
    Scanner sc = new Scanner(System.in);
    
//    Adivinar un número secreto con pistas (mayor/menor).
    /**
     * Método que implementa un juego de adivinanza donde el usuario debe encontrar
     * un número secreto generado aleatoriamente entre 1 y 50.
     * Proporciona pistas (mayor/menor) hasta que el usuario adivine correctamente.
     * 
     * @param posiblenum Número ingresado por el usuario para adivinar
     * 
     */
    public void adivinarNumero(int posiblenum){
        Random ra = new Random();
        boolean compara = false;
        int numsecreto = ra.nextInt(50)+1;
        
        System.out.println("****** Adivinar numero secreto del 1 al 50 ******");
         System.out.print("Adivine el numero secreto: ");
            posiblenum = sc.nextInt();
        do {      
           
                            
            if (numsecreto > posiblenum){
                System.out.print("Aun no adivina, el numero secreto es mayor, animo! intente de nuevo: ");
                compara = false;
                posiblenum  = sc.nextInt();
            }
            else if (numsecreto < posiblenum ) {
                System.out.print("Aun no adivina, el numero secreto es menor, animo! intente de nuevo: ");
                compara = false;
                posiblenum  = sc.nextInt();
            } else if ( numsecreto == posiblenum) {
                System.out.println("Usted ha adivinado");
                compara = true; 
            } 
                
            
           
        } while (compara == false);
    }
    
    
//    **********************************************************************
    
    /**
     *  Método que lee notas ingresadas por el usuario hasta que se ingrese -1,
     * luego calcula y muestra el promedio de las notas válidas (entre 1 y 10).
     * 
     * @param notas Nota ingresada por el usuario
     * @return Promedio de las notas válidas ingresadas
     */
    public float leerNotas(int notas){
        float promedio, suma = 0f; 
        int c = 0;
        System.out.println("****** Leer notas para promediarlo ******");
        System.out.println("Ingrese su nota :");
            notas = sc.nextInt(); 
        
        do {            
            
               System.out.println("Ingrese su siguiente nota, si ya desea promediar ingrese -1:");
            notas = sc.nextInt();  
            
            if (notas > 0  && notas <= 10){
            suma = suma + notas;
            c++;
            } else 
                System.out.println("Culmino!");
            
            
            
        } while (notas != -1);
        
        promedio = suma / c; 
        
        System.out.println(promedio);
        
        return promedio;
    }
    
    
//    **********************************************************************
    
        /**
         * 
         * Método que construye y muestra una cadena de texto carácter por carácter
         * con un retraso de 500ms entre cada carácter para efecto visual.
         * 
         * @return La cadena de texto completa que se mostró
         * @throws InterruptedException Si ocurre una interrupción durante el sleep
         */
        public String construirString() throws InterruptedException {
            String frase = "Hola Mundo ;)";
            int contador = 0;
            System.out.println("****** Frase mostrada letra por letra ******");
            do {                
                Thread.sleep(500);
                System.out.print(frase.charAt(contador));
                contador++;
            } while (contador < frase.length());
            
            
            
            return frase; 
        }
    
//    **********************************************************************
        
        /**
         * Método que calcula y muestra las potencias de 2 para números consecutivos
         * hasta que el resultado supere 1000. Muestra cada cálculo con un retraso de 500ms.
         * 
         * @return La última potencia calculada que superó 1000
         * @throws InterruptedException Si ocurre una interrupción durante el sleep
         */
        public int mostrarPotenciaDe2() throws InterruptedException{
            int potencia = 0, num = 1;
            System.out.println("****** Potencias de 2 hasta que de 1000 ******");
            do {
                Thread.sleep(500);
                potencia = (int) Math.pow(num, 2);
                System.out.println("La potencia con exponente 2 de " + num + " es: " + potencia);
                num++;
            } while (potencia <= 1000);
            
            return potencia;
        }

}
