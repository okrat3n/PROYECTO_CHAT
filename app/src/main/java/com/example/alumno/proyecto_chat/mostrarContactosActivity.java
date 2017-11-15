package com.example.alumno.proyecto_chat;

/**
 * Created by alumno on 6/11/17.
 */
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.widget.SimpleCursorAdapter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class mostrarContactosActivity extends Activity{

        /*@Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layout_contactos);
            BBDDContactos agendaBBDD=new BBDDContactos(this, "agendaBBDD", null, 1);
            SQLiteDatabase db = agendaBBDD.getWritableDatabase();
            //Si hemos abierto correctamente la base de datos
            if(db != null)
            {
                //String[] args = new String[];
                Cursor c = db.rawQuery(" SELECT * FROM Contactos ", null);
                String[] columns =new String[] {"_id","nombre","telefono","id_imagen"};
                //SimpleCursorAdapter mAdapter = new SimpleCursorAdapter(this, R.layout.row_contactos_template, c, columns, to,0);
                ClassAdaptadorContactos miAdapter = new ClassAdaptadorContactos(this,c);
                ListView lst=(ListView) findViewById(R.id.listContactos);
                Log.e("qqqqqqqqqqqq",miAdapter.toString());
                Log.e("qqqqqqqqqqqq",lst.toString());
                lst.setAdapter(miAdapter);


            }
            //Cerramos la base de datos
            db.close();
    }*/
}
