/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import enums.LlamadasPorZona;
import enums.NivelAcceso;
import enums.Usuarios;
import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Random;

/**
 * Clase que contiene ejercicios prácticos de diversos temas incluyendo control
 * de acceso, simulación de servicios, validación de usuarios, operadora
 * telefónica y evaluación de vendedores.
 *
 * @author HenryRomero
 */
public class EjerciciosPractica {

    Utiles u = new Utiles();
    Scanner sc = new Scanner(System.in);

    /**
     * Método que simula un sistema de control de acceso para un edificio
     * inteligente. Verifica el nivel de acceso (VISITANTE, EMPLEADO,
     * ADMINISTRADOR) y valida las credenciales. Solo permite 3 intentos para
     * ingresar la clave correcta.
     */
    public void controlarAcesso() {
        NivelAcceso tarjeta = u.darTarjeta();
        System.out.println("****** Control de Acceso ******");
        System.out.println("Tarjeta Confirmada :)");
        System.out.println("\tRol: " + tarjeta.getRol());
        System.out.println("\tID: " + tarjeta.getId());

        System.out.println("Por favor, Ingrese su clave: ");
        String clave = sc.next();

        if (tarjeta.getClave().equals(clave)) {
            System.out.println("Registro correcto, Bienvenido " + tarjeta.getRol());
        } else {
            System.out.println("Clave incorrecta!");
        }
    }

    /**
     * Método que simula la atención a clientes en una cola con dos tipos de
     * servicio (cajero y asesor). El servicio de cajero toma 2 minutos y el de
     * asesor 5 minutos. Realiza la simulación por 120 minutos y muestra
     * estadísticas finales.
     *
     * @param servicio Tipo de servicio seleccionado aleatoriamente (1 = cajero,
     * 2 = asesor)
     * @throws InterruptedException Si ocurre una interrupción durante el sleep
     */
    public void darServicio(int servicio) throws InterruptedException {
        int cCajero = 0, cAsesor = 0, cAcumulado = 0;
        Random r = new Random();
        System.out.println("****** Atencion al cliente ******");
        while (cAcumulado < 120) {
            servicio = r.nextInt(2) + 1;
            switch (servicio) {
                case 1:
                    System.out.println("------------------------------\n- Servicio de cajero \n\tProcesando servicio...");
                    Thread.sleep(500);
                    System.out.println("\tCliente atendido ( 2 minutos  )");
                    cAcumulado += 2;
                    cCajero++;
                    break;
                case 2:
                    System.out.println("------------------------------\n- Servicio de asesor \n\tProcesando servicio...");
                    Thread.sleep(500);
                    System.out.println("\tCliente atendido ( 5 minutos  )");
                    cAcumulado += 5;
                    cAsesor++;
                    break;
                default:
                    System.out.println("La opcion no existe");
            }
        }
        System.out.println("\nSimulacion terminada (120 minutos)"
                + "\n\t -Usuarios que eligieron Cajero: " + cCajero
                + "\n\t -Usuarios que eligieron Asesor: " + cAsesor);
    }

    /**
     * Método que valida el acceso de usuarios a un sistema de seguridad.
     * Registra intentos fallidos y bloquea cuentas después de 3 intentos
     * fallidos. Muestra al final una lista de usuarios bloqueados.
     */
    public void validarUsuario() {
        String resp = "";
        String id = "", contrasena = "", bloqueados = "";
        int inten;

        Usuarios[] usuarios = Usuarios.values();
        boolean usuarioValido = false;

        System.out.println("****** Control De Acceso ******");
        for (int i = 0; i < 4; i++) {
            inten = 3;
            do {
                System.out.println("Ingrese el usuario: ");
                id = sc.nextLine();
                String data = u.compararUsuarios(id);

                if (data == null) {
                    System.out.println("------ Usuario no registrado ------");
                } else {
                    System.out.println("#### Usuario registrado ####");
                    usuarioValido = true;

                    boolean contrasenaValida = false;
                    do {
                        System.out.println("Ingrese la contraseña: ");
                        contrasena = sc.nextLine();

                        if (data.equals(contrasena)) {
                            System.out.println("#### Acceso concedido ####");
                            contrasenaValida = true;
                        } else {
                            System.out.println("Contrasena incorrecta, le quedan " + inten + " intentos");
                            inten--;
                            if (inten == 0) {
                                System.out.println(" **** Cuenta Bloqueada **** ");
                                bloqueados += "- " + id + "\t" + contrasena + "\n";
                            }
                        }
                    } while (contrasenaValida == false && inten > 0);
                }
            } while (usuarioValido == false);
        }
        System.out.println("# Cuentas bloqueadas: \n" + bloqueados);
    }

    /**
     * Método que calcula el costo de llamadas internacionales según la zona y
     * minutos. Muestra primero la lista de zonas disponibles con sus códigos y
     * precios por minuto.
     */
    public void operadorTelefonica() {
        int codigo = 0, minutos = 0;

        System.out.println("****** Operadora Telefonica Internacional ******");

        for (LlamadasPorZona zona : LlamadasPorZona.values()) {
            System.out.println("Codigo: " + zona.getCodigo() + "\t Zona: " + zona.getZona() + "\t $/min: " + zona.getPrecio());
        }
        System.out.print("\nIngrese el codigo de la zona: ");
        codigo = sc.nextInt();
        System.out.print("Ingrese los minutos de llamada: ");
        minutos = sc.nextInt();
        double precioDeLlamada = u.darPrecio(codigo, minutos);
        System.out.println("\nEl precio a pagar por la llamada es: $" + precioDeLlamada + " dolares ");
    }

    /**
     * Método que evalúa el rendimiento de vendedores durante 30 días. Clasifica
     * cada día según el monto de ventas en categorías: Millonario, Excelente,
     * Normal o Bajo. Genera un reporte detallado para cada vendedor.
     */
    public void evaluarVendedor() throws InterruptedException {
        Random ra = new Random();
        int aporte;

        System.out.println("****** Reportes de Vendedores ******");
        for (int vendedor = 1; vendedor <= 30; vendedor++) {
        Thread.sleep(500);
        int bajoaporte = 0, excelente = 0, millonario = 0, dianormal = 0;
            for (int dias = 1; dias <= 30; dias++) {
                
                aporte = ra.nextInt(1000) + 1;

                if (aporte >= 900) {
                    millonario++;
                } else if (aporte >= 500) {
                    excelente++;
                } else if (aporte >= 100) {
                    dianormal++;
                } else {
                    bajoaporte++;
                }
            }

            

            System.out.println("---------------------------------------------"
                    + "\nEl reporte del vendedor " + vendedor
                    + "\n\tDias Millonarios: " + millonario
                    + "\n\tDias Excelentes: " + excelente
                    + "\n\tDias de Rendimiento Normal: " + dianormal
                    + "\n\tDias de Bajo Rendimiento: " + bajoaporte
                    + "\n---------------------------------------------");
        }
    }

}
