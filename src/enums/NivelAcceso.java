/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enums;

/**
 * Enumeración que define los niveles de acceso para un sistema de control de edificios inteligentes.
 * Cada constante representa un usuario con su rol, ID y clave correspondiente.
 *
 * @author HenryRomero
 */

public enum NivelAcceso {
    VISITANTE1("Visitante", "VIS001", "hola"),
    VISITANTE2("Visitante", "VIS002", "1234"),
    VISITANTE3("Visitante", "VIS003", "pass"),
    VISITANTE4("Visitante", "VIS004", "qwer"),
    VISITANTE5("Visitante", "VIS005", "temp"),
    EMPLEADO1("Empleado", "EMP001", "clave"),
    EMPLEADO2("Empleado", "EMP002", "abcd"),
    EMPLEADO3("Empleado", "EMP003", "word"),
    EMPLEADO4("Empleado", "EMP004", "demo"),
    EMPLEADO5("Empleado", "EMP005", "test"),
    ADMINISTRADOR1("Administrador", "ADM001", "admin"),
    ADMINISTRADOR2("Administrador", "ADM002", "root"),
    ADMINISTRADOR3("Administrador", "ADM003", "passw"),
    ADMINISTRADOR4("Administrador", "ADM004", "12345"),
    ADMINISTRADOR5("Administrador", "ADM005", "key");
    
    private String rol;
    private String id;
    private String clave;
    
    private NivelAcceso(String rol, String id, String clave) {
        this.rol = rol;
        this.id = id ;
        this.clave = clave;
    }

    public String getRol() {
        return rol;
    }

    
    
    public String getId() {
        return id;
    }

    

    public String getClave() {
        return clave;
    }
    
    
  
    
    
}

