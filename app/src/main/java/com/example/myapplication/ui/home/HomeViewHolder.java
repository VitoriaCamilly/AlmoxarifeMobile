package com.example.myapplication.ui.home;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

public class HomeViewHolder  extends RecyclerView.ViewHolder {
    TextView codigoProduto,classificacaoProduto,nomeProduto,quantidadeProduto;
    Button botaoadd;

    public HomeViewHolder(@NonNull View itemView) {
        super(itemView);
        this.codigoProduto =itemView.findViewById(R.id.codigoProdutoCard);
        this.classificacaoProduto =itemView.findViewById(R.id.classificacaoProdutoCard);
        this.nomeProduto =itemView.findViewById(R.id.nomeProdutoCard);
        this.quantidadeProduto =itemView.findViewById(R.id.quantidadeProdutoCard);
        this.botaoadd =itemView.findViewById(R.id.buttonAddCard);
    }
}
