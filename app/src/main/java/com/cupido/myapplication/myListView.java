package com.cupido.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class myListView extends AppCompatActivity {
    ListView Listas;
    ArrayAdapter Adapter_list;

    String[][] datos={
            {"Yo soy groot","Marvel studios","Serie"},
            {"She Hulk","Marvel studios","Pelicula"},
            {"Peleando por mi vida","andres rivers","Pelicula"},
            {"Tadeo 3","pixlia","Pelicula animada"},
            {"Dragon ball super: super hero","tohei animation","Pelicula animada"},
            {"Black panter 2","Mavel studios","Pelicula"},
    };

    int[] datosImg={R.drawable.img_1,R.drawable.img_2,R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,R.drawable.img_6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);


        Listas =(ListView) findViewById(R.id.lvlist);
        Listas.setAdapter(new Adaptador(this,datos,datosImg));



    }
}