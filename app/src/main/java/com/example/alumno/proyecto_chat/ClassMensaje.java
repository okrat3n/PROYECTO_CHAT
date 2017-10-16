package com.example.alumno.proyecto_chat;

import java.util.Date;

/**
 * Created by alumno on 5/10/17.
 */

public class ClassMensaje {

    public String contenido;
    public Date fecha_hora;
    public String remitente;

    public ClassMensaje(String contenido, int anyo, int mes, int dia, String remitente) {
        this.contenido = contenido;
        this.fecha_hora = new Date(anyo, mes, dia);
        this.remitente = remitente;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(Date fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
}
