package com.example.listas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter {

    private List<Dest> lista;
    private final Context contexto;

    public Adaptador(List<Dest> listaDeJogos, Context contexto) {
        this.lista = listaDeJogos;
        this.contexto = contexto;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Item(LayoutInflater.from(contexto).inflate(R.layout.item_da_lista, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Item i  = (Item) holder;
        i.jogo.setText(lista.get(position).jogo);
    }

    @Override
    public int getItemCount() {
        return this.lista.size();
    }
}
