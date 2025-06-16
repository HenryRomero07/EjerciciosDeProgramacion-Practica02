/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

import controller.EjerciciosDoWhile;
import java.util.Scanner;
import controller.EjerciciosFor;
import controller.EjerciciosPractica;
import controller.EjerciciosSwitch;
import controller.EjerciciosWhile;

/**
 * Clase principal que ejecuta el programa y muestra un menú interactivo para
 * acceder a diferentes ejercicios de programación organizados por estructuras
 * de control.
 *
 * @author HenryRomero
 */
public class Ejecutor {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {

        String mensaje = """
                           Elija el tipo de codigo que desea ejecutar ingresando su numero: 
                           1.Codigos con for \t2.Codigos con While: \t3.Codigos con DoWhile: \t4.Codigos con Switch: \t5.Codigos de Practica: 
                           0. Salir
                         -->""";
        System.out.print(mensaje);
        int opc = 0, selec = 0;
        opc = sc.nextInt();
        EjerciciosFor ejf = new EjerciciosFor();
        EjerciciosWhile ejw = new EjerciciosWhile();
        EjerciciosDoWhile ejd = new EjerciciosDoWhile();
        EjerciciosSwitch ejs = new EjerciciosSwitch();
        EjerciciosPractica ejp = new EjerciciosPractica();

        do {

            switch (opc) {
                //******************************** Ejercicios for ******************************************
                case 1:

                    System.out.println("""
OK, existen estas opciones:\n \t1. Tabla de Multiplicar
\t2. Digitos sumados
\t3. Muestra la hora
\t4. Muestra una piramide de n numeros 
Cual desea? """);
                    selec = sc.nextInt();

                    switch (selec) {

                        case 1:
                            int num = 0;
                            ejf.mostrarTabla12(num);
                            break;
                        case 2:
                            ejf.digitosSumanDiez();
                            break;

                        case 3:
                            ejf.mostrarHora();
                            break;
                        case 4:
                            int m = 0;
                            ejf.mostrarPiramide(m);
                            break;
                    }
                    break;
                //******************************** Ejercicios While ******************************************
                case 2:

                    System.out.println("""
OK, existen estas opciones:\n \t5. Ingresar numeros hasta que sumen 1000
\t6. Decimal a Binario
\t7. Lector de caracteres 
\t8. Contador de Digitos
Cual desea?""");
                    selec = sc.nextInt();
                    switch (selec) {
                        case 5:
                            int n = 0;
                            ejw.sumarNumeros(n);
                            break;
                        case 6:
                            int dec = 0;
                            ejw.convertirDecimalBinario(dec);
                            break;

                        case 7:
                            char car = ' ';
                            ejw.leercaracteres(car);
                            break;

                        case 8:
                            int numeros = 0;
                            ejw.contarDigitos(numeros);
                            break;
                    }
                    break;

                //******************************** Ejercicios DoWhile ******************************************
                case 3:

                    System.out.println("""
OK, existen estas opciones:\n \t9. Adivinar numero secreto
\t10. Promedio de notas
\t11. Texto letra por letra
\t12. Potencias con exponente 2 hasta 1000
Cual desea?""");
                    selec = sc.nextInt();

                    switch (selec) {
                        case 9:
                            int posiblenum = 0;
                            ejd.adivinarNumero(posiblenum);
                            break;
                        case 10:
                            int notas = 0;
                            ejd.leerNotas(notas);
                            break;

                        case 11:
                            ejd.construirString();
                            break;

                        case 12:
                            ejd.mostrarPotenciaDe2();
                            break;
                        default:
                            System.out.println("Esta opcion no existe");
                    }
                    break;

                //******************************** Ejercicios Switch ******************************************
                case 4:

                    System.out.println("""
OK, existen estas opciones:\n \t13. Juego de Piedra, papel o tijera
\t14. Control del semaforo
\t15. Juego de Adivinanza
\t16. Eleccion del mes 
Cual desea?""");
                    selec = sc.nextInt();

                    switch (selec) {
                        case 13:
                            int us = 0;
                            ejs.piedraPapelTijera(us);
                            break;

                        case 14:
                            String estado = " ";
                            ejs.verEstadoSemaforo(estado);
                            break;

                        case 15:
                            int juego = 0;
                            ejs.jugarAdivinanza(juego);
                            break;

                        case 16:
                            int eleccion = 0;
                            ejs.darMes(eleccion);
                            break;
                        default:
                            System.out.println("Esta opcion no existe");
                    }
                    break;

                //******************************** Ejercicios de Practica ******************************************
                case 5:
                    System.out.println("""
OK, existen estas opciones:\n \t17. Control de Acceso
\t18. Simulador de servicio 
\t19. Inicio de Sesion 
\t20. Operadora Telefonica Internacional
\t21.  Evaluador de Desempeño de Vendedores
Cual desea?""");
                    selec = sc.nextInt();

                    switch (selec) {
                        case 17:
                            ejp.controlarAcesso();
                            break;

                        case 18:
                            int servicio = 0;
                            ejp.darServicio(servicio);
                            break;

                        case 19:
                            ejp.validarUsuario();
                            break;

                        case 20:
                            ejp.operadorTelefonica();
                            break;

                        case 21:
                            ejp.evaluarVendedor();
                            break;
                        default:
                            System.out.println("Esta opcion no existe");
                    }
                    break;
                default:
                    System.out.println("La opcion no existe");
                    break;
            }
            Thread.sleep(3000);
            System.out.print("\nSi desea salir ingrese 0, pero si desea continuar ");
            System.out.print(mensaje);
            opc = sc.nextInt();
        } while (opc != 0);

    }

}
