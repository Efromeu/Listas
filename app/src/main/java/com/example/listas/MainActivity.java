package com.example.listas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listaDeJogos = findViewById(R.id.lstDestaques);
        listaDeJogos.setLayoutManager(new LinearLayoutManager(this));

        List<Dest> meuDest = new ArrayList<Dest>();

        meuDest.add(new Dest("Aga", "Caverna", 2010));
        meuDest.add(new Dest("Ega", "Caverna", 2010));
        meuDest.add(new Dest("Iga", "Caverna", 2010));
        meuDest.add(new Dest("Oga", "Caverna", 2010));
        meuDest.add(new Dest("Uga", "Caverna", 2010));

        listaDeJogos.setAdapter(new Adaptador(meuDest, this));
    }

}
