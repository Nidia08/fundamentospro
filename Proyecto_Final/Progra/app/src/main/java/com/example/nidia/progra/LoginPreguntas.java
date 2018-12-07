package com.example.nidia.progra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginPreguntas extends AppCompatActivity {

    Button ciencias, español, historia, matematicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_preguntas);

        final Context context = this;
        final SharedPreferences sharedPreferences = getSharedPreferences("Archivo",context.MODE_PRIVATE);

        ciencias = (Button) findViewById(R.id.cienciasN);
        español = (Button) findViewById(R.id.español);
        historia = (Button) findViewById(R.id.historia);
        matematicas = (Button) findViewById(R.id.matematicas);



        ciencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Mate","NaturalSciences");
                editor.commit();
                finish();
                Intent intent = new Intent (LoginPreguntas.this, Consejos.class);
                startActivity(intent);
            }
        });

        matematicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Mate","Maths");
                editor.commit();
                finish();
                Intent intent = new Intent (LoginPreguntas.this, Consejos.class);
                startActivity(intent);

            }
        });

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Mate","History");
                editor.commit();
                finish();
                Intent intent = new Intent (LoginPreguntas.this, Consejos.class);
                startActivity(intent);

            }
        });

        español.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("Mate","Spanish");
                editor.commit();
                finish();
                Intent intent = new Intent (LoginPreguntas.this, Consejos.class);
                startActivity(intent);

            }
        });

    }

}
