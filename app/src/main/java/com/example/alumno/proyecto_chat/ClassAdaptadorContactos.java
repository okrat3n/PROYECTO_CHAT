package com.example.alumno.proyecto_chat;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alumno on 23/10/17.
 */

public class ClassAdaptadorContactos extends BaseAdapter{

    List<ClassContacto> valores;
    Context contexto;
    Cursor c;

    public ClassAdaptadorContactos(Context contexto, Cursor c) {

        this.contexto = contexto;
        this.c = c;
        valores = rellenaLista();
    }

    public ClassAdaptadorContactos(List<ClassContacto> valores, Context contexto) {
        this.valores = valores;
        this.contexto = contexto;
    }

    public List<ClassContacto> rellenaLista()
    {
        ArrayList<ClassContacto> valores= new ArrayList<ClassContacto>();
        String nombre="";
        String estado="";
        String telefono;
        int foto;

        ClassContacto contact = null;

        if (c.moveToFirst())
        {
            //Recorremos el cursor hasta que no haya más registros
            do
            {
                nombre = c.getString(0);

                telefono = c.getString(1);

                estado = c.getString(2);

                foto = c.getInt(3);

                contact = new ClassContacto(nombre,estado,telefono,foto);
                valores.add(contact);

            } while(c.moveToNext());
        }
        c.close();
        return valores;
    }

    public int getCount()
    {
        return valores.size();
    }

    public Object getItem(int position)
    {
        return valores.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        if (convertView == null)
        {
            LayoutInflater inflater = LayoutInflater.from(contexto);
            convertView = inflater.inflate(R.layout.plantilla_contactos, null);
        }



        TextView tvNombre = (TextView) convertView.findViewById(R.id.txtName);
        tvNombre.setText(valores.get(position).contacto);
        TextView tvEstado = (TextView) convertView.findViewById(R.id.txtState);
        tvEstado.setText(valores.get(position).estado);
        ImageView imgFoto = (ImageView) convertView.findViewById(R.id.imgUser);
        imgFoto.setBackgroundResource(valores.get(position).foto);

        return convertView;
    }

    @Override
    public CharSequence[] getAutofillOptions() {
        return new CharSequence[0];
    }

}
