package com.example.alumno.proyecto_chat;

/**
 * Created by alumno on 25/10/17.
 */

public class ClassChats {

    String contacto;
    String ultimo_mensaje;
    String telefono;
    int foto;

    public ClassChats(String contacto) {
        this.contacto = contacto;
    }

    public ClassChats(String contacto, String ultimo_mensaje, String telefono, int foto) {
        this.contacto = contacto;
        this.ultimo_mensaje = ultimo_mensaje;
        this.telefono = telefono;
        this.foto = foto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getUltimo_mensaje() {
        return ultimo_mensaje;
    }

    public void setUltimo_mensaje(String ultimo_mensaje) {
        this.ultimo_mensaje = ultimo_mensaje;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
