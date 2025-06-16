/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import enums.LlamadasPorZona;
import enums.NivelAcceso;
import enums.Usuarios;
import java.util.Random;

/**
 * Clase utilitaria que proporciona métodos auxiliares para diversas funcionalidades
 * del sistema, incluyendo generación de tarjetas de acceso, validación de usuarios
 * y cálculo de precios de llamadas.
 * 
 * @author HenryRomero
 */
public class Utiles {

    Random ra = new Random();

    /**
     * Selecciona y devuelve una tarjeta de acceso aleatoria del enum NivelAcceso.
     * 
     * @return Objeto NivelAcceso seleccionado aleatoriamente
     */
    public NivelAcceso darTarjeta() {
         NivelAcceso[] tarjet = NivelAcceso.values();
         int posicion = ra.nextInt(tarjet.length);
         return tarjet[posicion];
    }
    
    /**
     * Busca un usuario por su ID y devuelve su clave si existe.
     * 
     * @param id Identificador del usuario a buscar
     * @return Clave del usuario si existe, null si no se encuentra
     */
    public String compararUsuarios(String id) {
        for (Usuarios usuarios : Usuarios.values()){
            if (usuarios.getID().equals(id)) {
                return usuarios.getClave();
            } 
        }
        return null;
    }
    
    /**
     * Calcula el precio total de una llamada según su zona y duración.
     * 
     * @param codigo Código numérico de la zona de llamada
     * @param minutos Duración de la llamada en minutos
     * @return Precio total calculado, o 0 si el código no existe
     */
    public double darPrecio(int codigo, int minutos) {
        double precioTotal = 0f;
        LlamadasPorZona valores = null;
        
        for (LlamadasPorZona llamada : LlamadasPorZona.values()) {
            if (llamada.getCodigo() == codigo){
                valores = llamada;
                break;
            }
        }
        
        if (valores != null) {
            precioTotal = (valores.getPrecio() * minutos);
        }
        
        return precioTotal;
    }
}