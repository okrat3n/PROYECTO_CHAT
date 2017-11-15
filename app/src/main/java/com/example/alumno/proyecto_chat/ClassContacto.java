package com.example.alumno.proyecto_chat;

/**
 * Created by alumno on 23/10/17.
 */

public class ClassContacto {

    String contacto;
    String estado;
    String telefono;
    int foto;

    public ClassContacto(String contacto) {
        this.contacto = contacto;
    }

    public ClassContacto(String contacto, String estado, String telefono, int foto) {
        this.contacto = contacto;
        this.estado = estado;
        this.telefono = telefono;
        this.foto = foto;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String lastMessage) {
        this.estado = lastMessage;
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
