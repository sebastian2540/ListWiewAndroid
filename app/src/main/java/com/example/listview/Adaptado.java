package com.example.listview;

import android.widget.BaseAdapter;
import java.util.List;
import android.content.Context;
import android.database.DataSetObserver;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class Adaptado extends BaseAdapter {
    private Context context;
    private int layout;
    private List<String> nombres;
    private List<String> telefonos;
    private int[] imagenes;

    public Adaptado(Context context, int layout, List<String> nombres, List<String>
            telefonos, int[] imagenes) {

        this.context = context;
        this.layout = layout;
        this.nombres = nombres;
        this.telefonos = telefonos;
        this.imagenes = imagenes;
    }

    @Override
    public int getCount() {
        return nombres.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        v = layoutInflater.inflate(R.layout.elemento, null);

        TextView txtnombre = v.findViewById(R.id.txtnombre);
        txtnombre.setText(nombres.get(position));

        TextView txttelefono = v.findViewById(R.id.txttelefono);
        txttelefono.setText(telefonos.get(position));

        ImageView imagen = v.findViewById(R.id.imageView);
        imagen.setImageResource(imagenes[position]);
        return v;
    }
}
