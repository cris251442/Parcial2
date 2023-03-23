package com.example.parcial2cris;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<personas> listLeads;
    ListView lv1;
    Integer[] ImgPpersonas = {
            R.drawable.lead_photo_1,
            R.drawable.lead_photo_2,
            R.drawable.lead_photo_3,
            R.drawable.lead_photo_4,
            R.drawable.lead_photo_5,
            R.drawable.lead_photo_6,
            R.drawable.lead_photo_7,
            R.drawable.lead_photo_8,
            R.drawable.lead_photo_9,
            R.drawable.lead_photo_10
    };
ArrayList<personas> listaLeads;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLeads=new ArrayList<personas>();

        listaLeads.add(new personas("Alexander Pierrot"));
        listaLeads.add(new personas("Carlos Lopez"));
        listaLeads.add(new personas("Sara Bonz"));
        listaLeads.add(new personas("Liliana Clarence"));
        listaLeads.add(new personas("Benito Peralta"));
        listaLeads.add(new personas("Juan Jaramillo"));
        listaLeads.add(new personas("Christian Steps"));
        listaLeads.add(new personas("Alexa Giraldo"));
        listaLeads.add(new personas("Linda Murillo"));
        listaLeads.add(new personas("Lizeth Astrada"));


        listaLeads = (ListView) findViewById(R.id.lvLeads);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(this,R.array.arrayLeads, android.R.layout.simple_list_item_1);

        listaLeads.setAdapter(adaptador);
    }
}