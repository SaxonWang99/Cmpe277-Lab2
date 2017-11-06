package com.example.yichengli.weatherapp;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainMenuFragment mainMenu = new MainMenuFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container, mainMenu).commit();
    }
}
