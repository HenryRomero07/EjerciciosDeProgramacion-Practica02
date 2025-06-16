/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 * Enumeración que representa los usuarios del sistema con sus credenciales de acceso.
 * Cada constante enum representa un usuario con su ID y clave correspondiente.
 * 
 * @author HenryRomero
 */
public enum Usuarios {
    USUARIO1("US001","root1"),
    USUARIO2("US002","root2"),
    USUARIO3("US003","root3"),
    USUARIO4("US004","root4"),
    USUARIO5("US005","root5");
    
    private final String ID;
    private final String clave;
    private Usuarios(String ID, String clave) {
        this.ID = ID;
        this.clave = clave;
    }

    public String getID() {
        return ID;
    }

    
    
    public String getClave() {
        return clave;
    }
    
    
}
