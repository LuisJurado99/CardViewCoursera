package com.example.cardviewcoursera;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    ArrayList<Perro> perros;
    RecyclerView listaContactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar miAToolbar = (Toolbar) findViewById(R.id.acBar);
        setSupportActionBar(miAToolbar);
        listaContactos = (RecyclerView) findViewById(R.id.rvMainBase);
        GridLayoutManager glm = new GridLayoutManager(this,2);
        listaContactos.setLayoutManager(glm);
        perros = new ArrayList<Perro>();
        perros.add(new Perro("Luis Jurado",10, R.drawable.perro));
        perros.add(new Perro("Ceci Jurado", 6, R.drawable.perro2));
        perros.add(new Perro("Miguel Jurado", 7, R.drawable.perro3));
        perros.add(new Perro("Laura Negrete", 8, R.drawable.perro4));
        perros.add(new Perro("Miguel Jurado P", 9, R.drawable.perro5));
        PerroAdaptador perroAdaptador = new PerroAdaptador(perros);
        listaContactos.setAdapter(perroAdaptador);

    }
}