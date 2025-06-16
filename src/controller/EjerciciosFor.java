package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 * Clase que contiene ejercicios prácticos utilizando la estructura de control for.
 * Incluye ejemplos como generación de tablas de multiplicar, sumatoria, reloj digital y patrones numéricos.
 *
 * @author HenryRomero
 */
public class EjerciciosFor {

    Scanner sc = new Scanner(System.in);
    /**
     * Genera y muestra la tabla de multiplicar del 1 al 12 para el número especificado.
     * 
     * @param num El número base para el cual se generará la tabla de multiplicar.
     *            Debe ser un valor entero.
     * 
     */
    public void mostrarTabla12(int num) {
        int mult;
        System.out.println("****** Tablas de multiplicar del 1 al 12 ******");
        try {
            System.out.println("Ingrese el valor para ver su tabla:  ");
        num = sc.nextInt();
        for (int i = 1; i < 13; i++) {
            mult = num * i;
            System.out.println(num + " * " + i + " = " + mult);
        }
        } catch (Exception e) {
            System.out.println("Error!");
            
        }
    }

    //***************************************************************************************************
/**
 * Método que encuentra y muestra todos los números de 3 dígitos donde la suma
 * de sus dígitos individuales es igual a 10.
 * 
 */
    public void digitosSumanDiez() {
        System.out.println("****** Numeros de 3 digitos que sumados dan 10  ******");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if ((i + j + k) == 10) {
                        System.out.println(i + "" + j + "" + k );
                    }
                }
            }
        }
    }

    //***************************************************************************************************

    /**
     * Simula un reloj digital que muestra horas, minutos y segundos en tiempo real.
     * Avanza cada medio segundo (500ms) desde 00:00:00 hasta 23:59:59.
     * 
    
     */
    public void mostrarHora() throws InterruptedException  {
        String resp;
        resp = "";
        System.out.println("****** Reloj ******");
        for (int i = 0; i <= 24; i++) {
            for (int j = 0; j <= 60; j++) {
                for (int k = 0; k <= 60; k++) {
                    resp = " " + i + " : " + j + " : " + k;
                    System.out.println(resp);
                    Thread.sleep(1000);
                    /* Método de la clase Thread que permite 
                     * pausar por un lapso de tiempo determinado 
                     * (según el argumento que reciba) */
                }
            }
        }
    }

    //***************************************************************************************************

    /**
     * Genera y muestra una pirámide numérica descendente con base de m cifras.
     * 
     * @param m El número que determina la base de la pirámide y el valor máximo.
     *          Debe ser un entero positivo.
     
     */
    public void mostrarPiramide(int m) {
        int num = 0;
        String numeros;
        numeros = "";
        
        System.out.println("****** Piramide de numeros de m base ******");
        System.out.println("Ingrese el valor para crear su piramide:  ");
        m = sc.nextInt();
        num = m;
        for (int i = 0; i < m; i++) {
            numeros += num + " ";
            System.out.println(numeros);
            num--;
        }
    }
}