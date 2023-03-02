package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

public class ModalFragment extends DialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.modal_layout, container, false);

        Button button = view.findViewById(R.id.modal_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = view.findViewById(R.id.modal_edittext);
                String name = editText.getText().toString();
                Toast.makeText(getActivity(), "Olá, " + name + "!", Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        return view;
    }
}
