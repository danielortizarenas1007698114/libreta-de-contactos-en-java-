/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CBN
 */
public class coleccion {
    //System.out.println("hello world");
    
    
    private String nombre, direccion, telefono, correo;
    
    public coleccion(String nombre, String direcion, String telefono, String correo){        
        
        this.nombre = nombre;
        this.direccion = direcion;
        this.telefono = telefono;
        this.correo = correo;
        
    }

    public String getNombre() {
        return nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getCorreo() {
        return correo;
    }
    
}
