package com.belov.artem.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.belov.artem.daggertest.models.Apocalypse;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Apocalypse a = new Apocalypse();

        String res = a.doomsDayMashine.engine.engineType;
    }


}
