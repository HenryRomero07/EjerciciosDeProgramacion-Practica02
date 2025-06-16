/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;

/**
 * Clase que contiene ejercicios implementados con la estructura de control while.
 * Incluye operaciones con números y validación de caracteres.
 * 
 * @author HenryRomero
 */
public class EjerciciosWhile {

    Scanner sc = new Scanner(System.in);

    /**
     * Suma números ingresados por el usuario hasta que el total acumulado
     * alcance o supere el valor de 1000.
     * 
     * @param n Número inicial para comenzar la suma (generalmente 0)
     * @return El valor total acumulado de la suma
     */
    public int sumarNumeros(int n) {
        int suma = 0;
        System.out.println("****** Ingresar numeros hasta que sumen 1000 ******");
        while (suma < 1000) {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
           
            suma += n;
        }

        System.out.println("\nLa suma total es: " + suma);

        return suma;
    }

    /**
     * Convierte un número decimal ingresado por el usuario a su
     * representación binaria.
     * 
     * @param dec Número decimal a convertir
     * @return String con la representación binaria del número
     */
    public String convertirDecimalBinario(int dec) {
        int mod = 0;
        String residuos;
        residuos = "";
        System.out.println("****** Conversor De Decimal a Binario  ******");
        System.out.println("Ingrese su valor decimal: ");
        dec = sc.nextInt();
        String resp = "El numero decimal " + dec;
        while (dec > 1) {
            mod = dec % 2;
            residuos += mod;
            dec = dec / 2;
        }
        residuos += "1";
        String binario = new StringBuilder(residuos).reverse().toString();
        resp += " en binario es: " + binario;
        System.out.println(resp);
        return resp;
    }

    /**
     * Cuenta la cantidad de dígitos que contiene un número ingresado por el usuario.
     * 
     * @param numeros Número del cual se contarán los dígitos
     */
    public void contarDigitos(long numeros) {
        int cont = 0;

        System.out.println("****** Contador de Digitos  ******");
        System.out.println("Ingrese su numero: ");
        numeros = sc.nextLong();

        while (numeros > 0) {
            numeros /= 10;
            cont++;
        }

        System.out.println("Usted ingreso " + cont + " numeros.");
    }

    /**
     * Lee caracteres ingresados por el usuario hasta que se ingrese una vocal.
     * 
     * @param car Carácter inicial para comenzar la validación
     */
    public void leercaracteres(char car) {
        System.out.println("****** Lector de caracteres hasta que se ingrese una vocal  ******");
        System.out.println("Ingrese una letra: ");
        car = sc.next().toLowerCase().charAt(0);
        
        while (car != 'a' && car != 'e' && car != 'i' && car != 'o' && car != 'u') {
            System.out.println("Continue ingresando una letra: ");
            car = (char) sc.next().toLowerCase().charAt(0);
        }

        System.out.println("Su letra es una vocal\n");
    }
}