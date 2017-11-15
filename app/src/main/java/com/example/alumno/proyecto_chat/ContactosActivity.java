package com.example.alumno.proyecto_chat;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ContactosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_contactos);

        List<ClassContacto> agenda=new ArrayList<ClassContacto>();
        agenda.add(new ClassContacto("Luis","Feliz","gdfgdf",R.drawable.foto1));
        agenda.add(new ClassContacto("Julia","Feliz","dfgdfg",R.drawable.foto2));
        agenda.add(new ClassContacto("Juan","Feliz","fgfdgf",R.drawable.foto3));
        agenda.add(new ClassContacto("Juan","Feliz","fgfdgf",R.drawable.foto3));
        agenda.add(new ClassContacto("Juan","Feliz","fgfdgf",R.drawable.foto3));
        agenda.add(new ClassContacto("Juan","Feliz","fgfdgf",R.drawable.foto3));
        agenda.add(new ClassContacto("Juan","Feliz","fgfdgf",R.drawable.foto3));


        ListView listContactos=(ListView) this.findViewById(R.id.listContactos);
        ClassAdaptadorContactos MiAdapter=new ClassAdaptadorContactos(agenda,this);
        listContactos.setAdapter(MiAdapter);*/
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_contactos);
            BBDDContactos agendaBBDD = new BBDDContactos(this, "agendaBBDD", null, 1);
            SQLiteDatabase db = agendaBBDD.getWritableDatabase();
            //Si hemos abierto correctamente la base de datos
            if (db != null) {
                //String[] args = new String[];
                Cursor c = db.rawQuery(" SELECT * FROM Contactos ", null);
                String[] columns = new String[]{"_id", "nombre", "telefono", "id_imagen"};
                //SimpleCursorAdapter mAdapter = new SimpleCursorAdapter(this, R.layout.row_contactos_template, c, columns, to,0);
                ClassAdaptadorContactos miAdapter = new ClassAdaptadorContactos(this, c);
                ListView lst = (ListView) findViewById(R.id.listContactos);
                /*Log.e("qqqqqqqqqqqq",miAdapter.toString());
                Log.e("qqqqqqqqqqqq",lst.toString());*/
                lst.setAdapter(miAdapter);


            }
            //Cerramos la base de datos
            db.close();
        }

    }

