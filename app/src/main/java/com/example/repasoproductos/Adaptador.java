package com.example.repasoproductos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {

    Context miContexto;
    ArrayList<Producto> miLista;

    public Adaptador(Context miContexto, ArrayList<Producto> miLista) {
        this.miContexto = miContexto;
        this.miLista = miLista;
    }

    @Override
    public int getCount() {
        return miLista.size();
    }

    @Override
    public Object getItem(int i) {
        return miLista.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;//miLista.get(i).getCodigoproducto();
    }

    @Override
    public View getView(int pos, View view, ViewGroup parent) {
        LayoutInflater inflador = LayoutInflater.from(miContexto);
        view = inflador.inflate(R.layout.itemlistview, null);

        //ImageView imagen = (ImageView) view.findViewById(R.id.ivImagen);
        TextView nombre = (TextView) view.findViewById(R.id.tvNombre);
        TextView descripcion = (TextView) view.findViewById(R.id.tvDescripcion);
        TextView precio = (TextView) view.findViewById(R.id.tvPrecio);

        //imagen.setImageResource(miLista.get(pos).getImagen());
        nombre.setText(miLista.get(pos).getNombre());
        descripcion.setText(miLista.get(pos).getDescripcion());
        precio.setText(miLista.get(pos).getPrecio() + "€");

        return view;
    }
}
