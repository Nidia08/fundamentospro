package com.example.nidia.closeapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText pass,user;
    TextView Tuser,Tpass;
    Button nPass,acceder,register;
    String valor,valor2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass", "no hay");
        valor2 = sharedPreferences.getString("newUser", "no hay");
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();

        pass = (EditText) findViewById(R.id.password);
        user = (EditText) findViewById(R.id.user);
        nPass = (Button) findViewById(R.id.newPassword);
        register = (Button) findViewById(R.id.register);
        acceder = (Button) findViewById(R.id.acceder);
        Tuser = (TextView)findViewById(R.id.Ruser);

        nPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, ChangePassword.class);
                startActivity(intent);
            }
        });

        acceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this, valor, Toast.LENGTH_SHORT).show();
                if((valor.equals(pass.getText().toString()))&&(valor2.equals(user.getText().toString()))){
                    Toast.makeText(MainActivity.this, "hola", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, pass.getText().toString()+"invalido", Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

    }
}
