package com.example.listas;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class Dest {
    public String jogo;
    public String preco;
    public int data;



    public Dest(String jogo, String preco, int data) {
        this.jogo = jogo;
        this.preco = preco;
        this.data = data;
    }
}
 