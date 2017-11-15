package com.example.alumno.proyecto_chat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by alumno on 5/10/17.
 */

public class ClassMensaje {

    public String contenido;
    public String fecha_hora;
    public String remitente;
    public String tel_destinatario;

    public ClassMensaje(String contenido, String fecha_hora, String remitente, String tel_destinatario) {
        this.contenido = contenido;
        this.fecha_hora = fecha_hora;
        this.remitente = remitente;
        this.tel_destinatario = tel_destinatario;
    }

    public ClassMensaje(String contenido, String remitente, String tel_destinatario) {
        this.contenido = contenido;
        Date actual = new Date();
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        this.fecha_hora = df.format(actual).toString();
        this.remitente = remitente;
        this.tel_destinatario = tel_destinatario;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha_hora() {
        return fecha_hora;
    }

    public void setFecha_hora(String fecha_hora) {
        this.fecha_hora = fecha_hora;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }
}
