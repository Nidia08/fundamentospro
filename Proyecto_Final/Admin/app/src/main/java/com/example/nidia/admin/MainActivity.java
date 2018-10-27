package com.example.nidia.admin;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button ciencias, español, historia, matematicas;
    String valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;
        final SharedPreferences sharedPreferences = getSharedPreferences("Archivo",context.MODE_PRIVATE);

        ciencias = (Button) findViewById(R.id.cienciasN);
        español = (Button) findViewById(R.id.español);
        historia = (Button) findViewById(R.id.historia);
        matematicas = (Button) findViewById(R.id.matematicas);



        ciencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Aprendizaje.class);
                startActivity(intent);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("newPass","ciencias");
                editor.commit();
            }
        });

        matematicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Aprendizaje.class);
                startActivity(intent);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("newPass","matematicas");
                editor.commit();
            }
        });

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Aprendizaje.class);
                startActivity(intent);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("newPass","historia");
                editor.commit();
            }
        });

        español.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Aprendizaje.class);
                startActivity(intent);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("newPass","español");
                editor.commit();
            }
        });

    }

}
