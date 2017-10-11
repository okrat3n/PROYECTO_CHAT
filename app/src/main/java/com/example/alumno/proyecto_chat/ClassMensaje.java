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
}
