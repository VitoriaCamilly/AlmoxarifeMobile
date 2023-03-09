package com.example.myapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;
import com.example.myapplication.ui.model.Classificacao;
import com.example.myapplication.ui.model.Produto;

import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private HomeAdapter homeAdapter;
    private List<Produto> listaProdutos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

//        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));
//        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));
//        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));
//        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));
//        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));
        listaProdutos.add(new Produto(1, 1, "Primeiro Produto", new Classificacao(1, "primeira Classificacao")));

        homeAdapter = new HomeAdapter(getContext(), listaProdutos, this);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}