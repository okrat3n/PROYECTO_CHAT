package com.example.alumno.proyecto_chat;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

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

        /*ClassMensaje cmsg = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg2 = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg3 = new ClassMensaje("Hola",2017,10,11,"Efran");
        ClassMensaje cmsg4 = new ClassMensaje("Hola",2017,10,11,"Efran");

        ClassMensaje[] arrayMensajes = {cmsg,cmsg2,cmsg3,cmsg4};
        TextView msg = null;
        LinearLayout layout_mensaje = findViewById(R.id.layMessageContainer);
        layout_mensaje.setOrientation(LinearLayout.VERTICAL);*/

        /*for (int i = 0 ; i < arrayMensajes.length ; i++)
        {
            msg = new TextView(this);
            msg.setTextSize(14);
            msg.setText(arrayMensajes[i].contenido + "\n"+arrayMensajes[i].fecha_hora.toString() + "\n" +arrayMensajes[i].remitente+ "\n");
            layout_mensaje.addView(msg);
        }*/

        MostrarMens();


    }


    ArrayList<ClassMensaje> listaMensajes = new ArrayList();
    //on click que guarda el contenido de la caja en el ArrayList
    public void botonEnviar(View v)
    {
        TextView mytextview = findViewById(R.id.strMessageSend);
        ClassMensaje anyadir = new ClassMensaje(mytextview.getText().toString(),2017,10,11,"Juan","Álvaro");
        listaMensajes.add(anyadir);
        MostrarMens();
    }
    //Muestra los mensajes enviados
    public void MostrarMens()
    {

            /*TextView msg = null;
            LinearLayout layout_mensajes = findViewById(R.id.layMessageContainer);
            layout_mensajes.setOrientation(LinearLayout.VERTICAL);

            for (int i = 0 ; i < listaMensajes.size() ; i++)
            {
                msg = new TextView(this);
                msg.setTextSize(14);
                msg.setText(listaMensajes.get(i).getContenido() + "\n"+listaMensajes.get(i).getFecha_hora().toString() + "\n" +listaMensajes.get(i).getRemitente()+ "\n");
                layout_mensajes.addView(msg);
            }*/
            layout_mensaje();

    }

    public void layout_mensaje()
    {
        LinearLayout layout_mensaje = findViewById(R.id.layMessageContainer);
        layout_mensaje.setOrientation(LinearLayout.VERTICAL);
        layout_mensaje.setMinimumWidth(50);
        layout_mensaje.setMinimumHeight(50);
        layout_mensaje.setBackgroundColor(300);
        TextView msg = null;
        msg = new TextView(this);
        msg.setText("Hola");
        msg.setGravity(View.TEXT_ALIGNMENT_CENTER);
        layout_mensaje.addView(msg);


    }
}


