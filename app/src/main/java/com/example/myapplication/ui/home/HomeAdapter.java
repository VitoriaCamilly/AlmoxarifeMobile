package com.example.myapplication.ui.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.model.Produto;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder> {
    public Context context;
    public List<Produto> listaProdutos;

    HomeAdapter(Context context, List<Produto> produtos, HomeFragment homeFragment){
        this.context = context;
        this.listaProdutos = produtos;
    }

    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(LayoutInflater.from(context).inflate(R.layout.produto_card,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.codigoProduto.setText(this.listaProdutos.get(position).getCodigo());
        holder.classificacaoProduto.setText(this.listaProdutos.get(position).getClassificacao().toString());
        holder.nomeProduto.setText(this.listaProdutos.get(position).getNome());
        holder.quantidadeProduto.setText(this.listaProdutos.get(position).getQuantidadeTotal());

        holder.botaoadd.setOnClickListener(v -> {
            System.out.println("Clicou no Botão");
        });

    }

    @Override
    public int getItemCount() {
        return listaProdutos.size();
    }
}
