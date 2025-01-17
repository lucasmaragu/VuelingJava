package model;

import java.util.Scanner;

public abstract class Usuario {
    private String idUsuario;
    private String nombre;
    private String apellido;
    private String apellido2;
    private String correo;
    private String contrasena;

    private static Autenticacion autenticacion = new Autenticacion();

    public Usuario(String idUsuario, String nombre, String apellido, String apellido2, String correo, String contrasena) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.apellido2 = apellido2;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public String getIdUsuario(String idUsuario){
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario){
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return idUsuario;
    }


}

