package com.example.listas;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class Item extends RecyclerView.ViewHolder {

    public TextView jogo;
    public TextView preco;
    public TextView data;

    public Item(View Item) {
        super(Item);

        jogo= itemView.findViewById(R.id.txtJogo);
        preco= itemView.findViewById(R.id.txtPreco);
        data= itemView.findViewById(R.id.txtData);


    }
}
