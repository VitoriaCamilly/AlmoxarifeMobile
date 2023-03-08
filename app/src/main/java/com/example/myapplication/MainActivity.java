package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private boolean sidebarOpen = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(

                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)

                R.id.navigation_inicio, R.id.navigation_pesquisa, R.id.navigation_adicionar)

                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);


        Button sidebarButton = findViewById(R.id.sidebar_button);
        sidebarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleSidebar();
            }
        });


    }

    public void exibirModal(View view) {
        ModalFragment modal = new ModalFragment();
        modal.show(getSupportFragmentManager(), "ModalFragment");
    }

    private void toggleSidebar() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        if (sidebarOpen) {
            Fragment sidebarFragment = fragmentManager.findFragmentById(R.id.sidebar_container);
            if (sidebarFragment != null) {
                fragmentTransaction.remove(sidebarFragment);
                sidebarOpen = false;
            }
        } else {
            SidebarFragment sidebarFragment = new SidebarFragment();
            fragmentTransaction.add(R.id.sidebar_container, sidebarFragment);
            sidebarOpen = true;
        }
        fragmentTransaction.commit();
    }

}