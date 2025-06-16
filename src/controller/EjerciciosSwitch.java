/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Random;
import java.util.Scanner;

/**
 * Clase que contiene ejercicios prácticos utilizando la estructura de control switch.
 * Incluye un juego de piedra-papel-tijera, control de semáforo, juego de adivinanzas
 * y selección de meses del año.
 * 
 * @author HenryRomero
 */
public class EjerciciosSwitch {
    
    Scanner sc = new Scanner(System.in); 

    /**
     * Método que implementa el juego clásico de piedra, papel o tijera contra la computadora.
     * El usuario tiene hasta 3 intentos para ganar. La computadora elige aleatoriamente.
     * 
     * @param us Elección del usuario (1 = piedra, 2 = papel, 3 = tijera)
     */
    public void piedraPapelTijera(int us) {
        int maquina = 0, cont = 0;
        boolean estado = false;

        Random ra = new Random();

        maquina = ra.nextInt(3) + 1;
        System.out.println("****** Juego de Piedra, papel o tijera ******");
        System.out.println("""
                           Elija la opcion y escriba su numero: 
                           \t1.Piedra
                           \t2.Papel
                           \t3.Tijera
                           """);
                us = sc.nextInt();
                
        
         do {            
            
             switch (us) {
            case 1:
                switch (maquina) {
                    case 1 -> System.out.println("Usted empato, la maquina tambien eligio piedra");
                    case 2 -> System.out.println("Usted ha perdido, la maquina eligio papel");
                    case 3 -> {System.out.println("Usted ha ganado, la maquina eligio tijera"); 
                    estado = true;
                    }
                }
                    cont++;
                break;



            case 2:
                switch (maquina) {
                    case 1 -> {System.out.println("Usted ha ganado, la maquina eligio piedra"); 
                    estado = true;
                    }
                    case 2 -> System.out.println("Usted empato, la maquina tambien eligio papel");
                    case 3 -> System.out.println("Usted ha perdido, la maquina eligio tijera");
                }
                 cont++;
                break;


            case 3:
                switch (maquina) {
                    case 1 -> System.out.println("Usted ha perdido, la maquina eligio piedra");
                    case 2 -> {System.out.println("Usted ha ganado, la maquina eligio papel"); 
                    estado = true;
                    }
                    case 3 -> System.out.println("\nUsted empato, la maquina tambien eligio tijera");
                }
                cont++;
                break;
            default: 
                System.out.println("Por favor, ingrese las opciones dadas!");
                break;

        }
             
             if (estado) {
                 System.out.println("Felicidades!");
                 break;
             } else {
              System.out.println("\nIntentelo de nuevo");
              System.out.println("""
                           Elija la opcion y escriba su numero: 
                           \t1.Piedra
                           \t2.Papel
                           \t3.Tijera
                           """);
             us = sc.nextInt();
             }
        } while (estado == false && cont < 3);
                
    }
    
    // ****************************************************************************************************************
    //
    /**
     * Simula el comportamiento de un semáforo según su estado actual.
     * Proporciona instrucciones al usuario basadas en el estado ingresado (verde, amarillo o rojo).
     * 
     * @param estado El estado actual del semáforo (debe ser "verde", "amarillo" o "rojo").
     */
    public void verEstadoSemaforo(String estado){
        
        System.out.println("****** Control del Semaforo ******");
        System.out.println("Ingrese el estado del semaforo (verde, amarillo o rojo): ");
        estado = sc.nextLine().toLowerCase();
        
        switch (estado) {
            case "verde":
                System.out.println("Usted puede seguir avanzando");
                break;
            case "amarillo":
                System.out.println("Tenga precaucion el semaforo cambiara su estado en unos segundos");
                break;
            case "azul":
                System.out.println("Pare! el semaforo esta en rojo ");
                break;
            default:
                System.out.println("El estado ingresado no es valido!");
                
        }
        }
    
    // ****************************************************************************************************************
    
    /**
     * Método que implementa un juego de adivinanzas con pistas. Presenta diferentes
     * acertijos y valida las respuestas del usuario.
     * 
     * @param juego Número del acertijo seleccionado por el usuario (1-5)
     */
    public void jugarAdivinanza(int juego){
        System.out.println("****** Juego de Adivinanza ******");
        System.out.println("Elija un número del 1 al 5 para darle su adivinanza: ");
        juego = sc.nextInt();
        char letra = ' ';
        switch (juego) {
            case 1:
                System.out.println("""
                                   Oro parece, plata no es. Abran las cortinas y veran lo que es. 
                                   \ta)  El platano
                                   \tb) La cebolla
                                   \tc) El maiz""");
                letra = sc.next().toLowerCase().charAt(0);
                
                switch (letra) {
                    case 'a' -> System.out.println("Incorrecto");
                    case 'b' -> System.out.println("Incorrecto");
                    case 'c' -> System.out.println("Correcto ha adivinado");
                    default -> System.out.println("Esa opcion no existe");
                }
                
                break;

                
            case 2:
                System.out.println("""
                                   Tengo agujas y no se coser, tengo numeros y no se leer. 
                                   \ta) El reloj
                                   \tb) El cactus
                                   \tc) La calculadora
                                   """); 
                
            letra = sc.next().toLowerCase().charAt(0);
                
                switch (letra) {
                    case 'a' -> System.out.println("Correcto ha adivinado");
                    case 'b' -> System.out.println("Incorrecto");
                    case 'c' -> System.out.println("Incorrecto");
                    default -> System.out.println("Esa opcion no existe");
                }

                break;
            case 3:
                System.out.println("""
                                   Largo como un palo, dulce como el malvavisco, y siempre termino en un abrazo. 
                                   \ta) El churro
                                   \tb) El algodon de azucar
                                   \tc) La serpiente
                                   """); 
                letra = sc.next().toLowerCase().charAt(0);
                
                switch (letra) {
                    case 'a' -> System.out.println("Correcto ha adivinado");
                    case 'b' -> System.out.println("Incorrecto");
                    case 'c' -> System.out.println("Incorrecto");
                    default -> System.out.println("Esa opcion no existe");
                }
                break;

                
            case 4:
                System.out.println("""
                                   No tiene pies, pero camina; no tiene boca, pero silba. 
                                   \ta) El viento
                                   \tb) El tren
                                   \tc) El reloj de arena
                                   """);   
                letra = sc.next().toLowerCase().charAt(0);
                
                switch (letra) {
                    case 'a' -> System.out.println("Correcto ha adivinado");
                    case 'b' -> System.out.println("Incorrecto");
                    case 'c' -> System.out.println("Incorrecto");
                    default -> System.out.println("Esa opcion no existe");
                }
                break;

                
            case 5:
                System.out.println("""
                                   Cuanto mas le quitas, mas grande se hace. 
                                   \ta) La oscuridad
                                   \tb) Un hoyo
                                   \tc) El hambre
                                   """);   
                letra = sc.next().toLowerCase().charAt(0);
                
                switch (letra) {
                    case 'a' -> System.out.println("Incorrecto");
                    case 'b' -> System.out.println("Correcto ha adivinado");
                    case 'c' -> System.out.println("Incorrecto");
                    default -> System.out.println("Esa opcion no existe");
                }
                break;

                
            default:
                System.out.println("No existe tal opcion");
        }
        }
    
//    **********************************************************************
    
    /**
     * Método que devuelve el nombre del mes correspondiente al número ingresado (1-12).
     * 
     * @param eleccion Número del mes (1-12)
     * @return Nombre del mes correspondiente al número ingresado
     */
    public String darMes(int eleccion){
        String mes;
        mes = " ";
        
        System.out.println("****** Eleccion del mes  ******");
        System.out.println("Ingrese el numero del mes: ");
        eleccion = sc.nextInt();
        switch (eleccion) {
            case 1 -> mes = "Enero";
                
            case 2 -> mes = "Febrero";
                
            case 3 -> mes = "Marzo";
                
            case 4 -> mes = "Abril";
                
            case 5 -> mes = "Mayo";
                
            case 6 -> mes = "Junio";
                
            case 7 -> mes = "Julio";
                
            case 8 -> mes = "Agosto";
                
            case 9 -> mes = "Septiembre";
                
            case 10 -> mes = "Octubre";
                
            case 11 -> mes = "Noviembre";
                
            case 12 -> mes = "Diciembre";
                
            default -> System.out.println("Esa opcion no existe") ;
        }
        
        System.out.println(" El mes elegido es: " + mes);
        return mes;
    }
}
