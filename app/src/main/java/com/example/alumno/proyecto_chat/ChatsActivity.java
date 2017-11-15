package com.example.alumno.proyecto_chat;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 25/10/17.
 */

public class ChatsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chats);

        List<ClassChats> chats=new ArrayList<ClassChats>();
        chats.add(new ClassChats("Luis","okay","gdfgdf",R.drawable.foto1));
        chats.add(new ClassChats("Julia","okay","dfgdfg",R.drawable.foto2));
        chats.add(new ClassChats("Juan","okay","fgfdgf",R.drawable.foto3));
        chats.add(new ClassChats("Juan","okay","fgfdgf",R.drawable.foto3));
        chats.add(new ClassChats("Juan","okay","fgfdgf",R.drawable.foto3));
        chats.add(new ClassChats("Juan","okay","fgfdgf",R.drawable.foto3));
        chats.add(new ClassChats("Juan","okay","fgfdgf",R.drawable.foto3));


        ListView listContactos=(ListView) this.findViewById(R.id.listContactos);
        ClassAdaptadorChats MiAdapter=new ClassAdaptadorChats(chats,this);
        listContactos.setAdapter(MiAdapter);

    }*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_chats);
        BBDDContactos agendaBBDD = new BBDDContactos(this, "agendaBBDD", null, 1);
        SQLiteDatabase db = agendaBBDD.getWritableDatabase();
        //Si hemos abierto correctamente la base de datos


        AdapterView.OnItemClickListener listener = new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                ClassChats contact = (ClassChats) parent.getAdapter().getItem(position);
                String id_destinatario = contact.getTelefono();
                Intent intent = new Intent(getApplicationContext(), chatActivity.class);
                //intent.putExtra("PRUEBA",id_destinatario);
                startActivity(intent);
            }
        };

        if (db != null) {
            //String[] args = new String[];
            Cursor c = db.rawQuery(" SELECT * FROM Chats ", null);
            String[] columns = new String[]{"_id", "nombre", "telefono", "id_imagen"};
            //SimpleCursorAdapter mAdapter = new SimpleCursorAdapter(this, R.layout.row_contactos_template, c, columns, to,0);
            ClassAdaptadorChats miAdapter = new ClassAdaptadorChats(this, c);
            ListView lst = (ListView) findViewById(R.id.listContactos);
                /*Log.e("qqqqqqqqqqqq",miAdapter.toString());
                Log.e("qqqqqqqqqqqq",lst.toString());*/
            lst.setAdapter(miAdapter);
            lst.setOnItemClickListener(listener);


        }
        //Cerramos la base de datos
        db.close();
    }
}
