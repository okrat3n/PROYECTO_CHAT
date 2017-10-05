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

        String[] conversacion = {"Hola,","que tal","bien y tu","bien tbm"};


        TextView msg = null;
        LinearLayout layout_mensaje = findViewById(R.id.layMessageContainer);
        layout_mensaje.setOrientation(LinearLayout.VERTICAL);

        for (int i = 0 ; i < conversacion.length ; i++)
        {
            msg = new TextView(this);
            msg.setTextSize(27);
            msg.setText(conversacion[i]);
            layout_mensaje.addView(msg);
        }






    }
}


