package com.example.nidia.closeapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button register, delete;
    EditText user, pass;
    String valor, valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = (Button) findViewById(R.id.register);
        user = (EditText) findViewById(R.id.Rusers);
        pass = (EditText) findViewById(R.id.Rpassword);
        delete = (Button) findViewById(R.id.deleteSesion);
        final Context context = this;
        final SharedPreferences sharedPreferences = getSharedPreferences("Archivo", context.MODE_PRIVATE);

        valor = sharedPreferences.getString("newPass", "no hay");
        valor2 = sharedPreferences.getString("newUser", "no hay");
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("newPass", pass.getText().toString());
                editor.putString("newUser", user.getText().toString());
                editor.commit();
                Toast.makeText(Register.this, "Se ha registrado ", Toast.LENGTH_SHORT).show();
                Intent refresh = new Intent(Register.this, MainActivity.class);
                startActivity(refresh);
                finish();
            }
        });

    }
}