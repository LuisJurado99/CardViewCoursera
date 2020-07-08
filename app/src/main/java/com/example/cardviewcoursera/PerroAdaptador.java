package com.example.cardviewcoursera;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class PerroAdaptador extends RecyclerView.Adapter<PerroAdaptador.PerroViewHolder> {
    ArrayList<Perro> perro;

    public PerroAdaptador(ArrayList<Perro> perro) {
        this.perro = perro;
    }

    //Inflar leyout y lo pasa al viewholder para que obtenga cada elemento
    @NonNull
    @Override
    public PerroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_contacto, parent, false);
        return new PerroViewHolder(v);
    }

    //Asocia cada elemento de la lista con cada view
    @Override
    public void onBindViewHolder(final PerroViewHolder perroViewHolder, int position) {
        Perro perros = perro.get(position);
        perroViewHolder.imgFoto.setImageResource(perros.getFoto());
        perroViewHolder.tvNombreCV.setText(perros.getNombre());
        perroViewHolder.tvRango.setText(perros.getRango()+"");
        perroViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Entra",Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() { //Cantidad de elementos que contiene la lista de contactos
        return perro.size();
    }

    public static class PerroViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgFoto;
        public TextView tvNombreCV;
        public TextView tvRango;

        public PerroViewHolder(@NonNull View itemView) {
            super(itemView);
            imgFoto = (ImageView) itemView.findViewById(R.id.imgFotoCV);
            tvNombreCV = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvRango = (TextView) itemView.findViewById(R.id.tvRango);
        }
    }
}