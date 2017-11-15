package com.example.alumno.proyecto_chat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alumno on 6/11/17.
 */

public class BBDDContactos extends SQLiteOpenHelper {

    //Sentencia SQL para crear la tabla de Contactos
    String sqlCreate = "CREATE TABLE Contactos (nombre TEXT,telefono TEXT,estado TEXT, id_imagen INTEGER)";
    String sqlCreate2 = "CREATE TABLE Chats (nombre TEXT,telefono TEXT,ultimo_mensaje TEXT, id_imagen INTEGER)";
    String sqlCreate3 = "CREATE TABLE Mensajes (contenido TEXT,tel_remitente TEXT,tel_destinatario TEXT, id_imagen INTEGER, fecha_hora TEXT)";

    public BBDDContactos(Context contexto, String nombre, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(contexto, nombre, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        //Se ejecuta la sentencia SQL de creación de la tabla
        db.execSQL(sqlCreate);
        db.execSQL(sqlCreate2);
        db.execSQL(sqlCreate3);
        if(db != null)
        {
            //Insertamos los datos en la tabla Usuarios
            db.execSQL("INSERT INTO Contactos (nombre,telefono,estado,id_imagen) VALUES ('Luis','6653454','Guay',"+R.drawable.foto1+")");
            db.execSQL("INSERT INTO Contactos (nombre,telefono,estado,id_imagen) VALUES ('Julia','6621323','Bien',"+R.drawable.foto2+")");
            db.execSQL("INSERT INTO Contactos (nombre,telefono,estado,id_imagen) VALUES ('Juan','6654321','dsadsadsad',"+R.drawable.foto3+")");
            db.execSQL("INSERT INTO Chats (nombre,telefono,ultimo_mensaje,id_imagen) VALUES ('Juan','6654321','adios',"+R.drawable.foto1+")");
            db.execSQL("INSERT INTO Chats (nombre,telefono,ultimo_mensaje,id_imagen) VALUES ('Juan','6654321','Hola',"+R.drawable.foto2+")");
            db.execSQL("INSERT INTO Chats (nombre,telefono,ultimo_mensaje,id_imagen) VALUES ('Juan','6654321','mañana nos vemos',"+R.drawable.foto3+")");
            db.execSQL("INSERT INTO Mensajes (contenido,tel_remitente,tel_destinatario,fecha_hora,id_imagen) VALUES ('Hola esto es un mensaje','66543192','669776787','27/11/2017 15:30:27',"+R.drawable.foto1+")");
            db.execSQL("INSERT INTO Mensajes (contenido,tel_remitente,tel_destinatario,fecha_hora,id_imagen) VALUES ('Holiiiii','6654321','669776787''27/11/2017 15:30:27',"+R.drawable.foto2+")");
            db.execSQL("INSERT INTO Mensajes (contenido,tel_remitente,tel_destinatario,fecha_hora,id_imagen) VALUES ('Yeeeeeee','6654322','669776787','27/11/2017 15:30:27',"+R.drawable.foto3+")");
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int versionAnterior, int versionNueva)
    {
        //NOTA: Por simplicidad del ejemplo aquí utilizamos directamente la opción de
        //      eliminar la tabla anterior y crearla de nuevo vacía con el nuevo formato.
        //      Sin embargo lo normal será que haya que migrar datos de la tabla antigua
        //      a la nueva, por lo que este método debería ser más elaborado.

        //Se elimina la versión anterior de la tabla
        db.execSQL("DROP TABLE IF EXISTS Contactos");
        db.execSQL("DROP TABLE IF EXISTS Chats");
        db.execSQL("DROP TABLE IF EXISTS Mensajes");
        //Se crea la nueva versión de la tabla
        db.execSQL(sqlCreate);
        db.execSQL(sqlCreate2);
        db.execSQL(sqlCreate3);
    }
}
