/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 * Enumeración que representa las diferentes zonas geográficas para llamadas internacionales
 * con sus respectivos códigos y precios por minuto.
 * 
 * @author HenryRomero
 */
public enum LlamadasPorZona {
    
    AMERICA_DEL_NORTE("AMERICA DEL NORTE", 12, 2.75),
    AMERICA_CENTRAL("AMERICA CENTRAL", 15, 1.89),
    AMERICA_DEL_SUR("AMERICA DEL SUR", 18, 1.60),
    EUROPA("EUROPA", 19, 3.5),
    ASIA("ASIA", 23, 4.5),
    AFRICA("AFRICA", 25, 3.1),
    OCEANIA("OCEANIA", 29, 3.0),
    RESTO_DEL_MUNDO("RESTO DEL MUNDO", 31, 6.0);

    private final String zona;
    private final int codigo;
    private final double precio;

    private LlamadasPorZona(String zona, int codigo, double precio) {
        this.zona = zona;
        this.codigo = codigo;
        this.precio = precio;
    }

    
    public String getZona() {
        return zona;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }
}
