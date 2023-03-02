package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class SidebarFragment extends Fragment {

    private ListView listView;
    private String[] options = {"Home", "Perfil", "Configurações", "Sair"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.sidebar_layout, container, false);

        listView = view.findViewById(R.id.sidebar_listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                android.R.layout.simple_list_item_1, options);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Executa uma ação quando o usuário seleciona uma opção da sidebar
                Toast.makeText(getActivity(), options[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}
