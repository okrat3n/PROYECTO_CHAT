package com.example.alumno.proyecto_chat;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class chatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chat);

        //ClassMensaje[] classMensajes = new ClassMensaje[5];

        //[1]="Hola",2017/10/11,"Efran";
        //[2]="Hola",2017/10/11,"Efran";
        //classMensajes[3]="Hola",2017/10/11,"Efran";
        //classMensajes[4]="Hola",2017/10/11,"Efran";
        //classMensajes[5]="Hola",2017/10/11,"Efran";

        ClassMensaje cmsg = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg2 = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg3 = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg4 = new ClassMensaje("Hola",2017,10,11,"Efran");

        ClassMensaje[] arrayMensajes = {cmsg,cmsg2,cmsg3,cmsg4};
        TextView msg = null;
        LinearLayout layout_mensaje = findViewById(R.id.layMessageContainer);
        layout_mensaje.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0 ; i < arrayMensajes.length ; i++)
        {
            msg = new TextView(this);
            msg.setTextSize(14);
            msg.setText(arrayMensajes[i].contenido + "\n"+arrayMensajes[i].fecha_hora.toString() + "\n" +arrayMensajes[i].remitente+ "\n");
            layout_mensaje.addView(msg);
        }






    }
}


