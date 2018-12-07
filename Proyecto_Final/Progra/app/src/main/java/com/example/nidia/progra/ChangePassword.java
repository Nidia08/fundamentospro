package com.example.nidia.progra;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ChangePassword extends AppCompatActivity {
    TextView lo, ln;
    EditText oPass;
    EditText nPass;
    Button hecho;
    String valor, valor2, pas,valor3,learn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        final Context context = this;
        final SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        //SharedPreferences sharedPreferences = getPreferences(context.MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass","No hay dato");
        valor2 = sharedPreferences.getString("newUser","No hay dato");
        valor3 = sharedPreferences.getString("learn","no hay");
        pas=valor2;
        learn=valor3;
        //Toast.makeText(ChangePassword.this, learn, Toast.LENGTH_LONG).show();

        oPass = (EditText) findViewById(R.id.oldPassword);
        nPass = (EditText) findViewById(R.id.nePassword);
        hecho = (Button) findViewById(R.id.hecho);
        lo = (TextView) findViewById(R.id.label);
        ln = (TextView) findViewById(R.id.label2);


        hecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                if(valor=="No hay dato"){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("newPass",nPass.getText().toString());
                    editor.putString("newUser",pas);
                    editor.putString("learn",learn);
                    //Toast.makeText(ChangePassword.this, pas, Toast.LENGTH_SHORT).show();
                    editor.commit();
                    valor = sharedPreferences.getString("newPass","No hay dato");
                    valor2 = sharedPreferences.getString("newUser","No hay dato");
                    valor3 = sharedPreferences.getString("learn","no hay");
                    Toast.makeText(ChangePassword.this, valor3, Toast.LENGTH_LONG).show();
                    //Toast.makeText(ChangePassword.this, "A definido una contraseña ", Toast.LENGTH_SHORT).show();

                    oPass.setText("");
                    nPass.setText("");
                    finish();
                    Intent refresh = new Intent(ChangePassword.this, MainActivity.class);
                    startActivity(refresh);

                }else{
                    //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                    //Toast.makeText(context,nPass.getText().toString() , Toast.LENGTH_SHORT).show();
                    if(valor.equals(oPass.getText().toString())){
                        SharedPreferences.Editor edito = getSharedPreferences("Archivo", MODE_PRIVATE).edit();
                        edito.clear().apply();
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("newPass",nPass.getText().toString());
                        editor.putString("newUser",pas);
                        editor.putString("learn",learn);
                        //Toast.makeText(ChangePassword.this, pas, Toast.LENGTH_SHORT).show();
                        editor.commit();
                        //valor = sharedPreferences.getString("newPass","No hay dato");
                        Toast.makeText(ChangePassword.this, "The password has been changed", Toast.LENGTH_SHORT).show();

                        oPass.setText("");
                        nPass.setText("");
                        Intent refresh = new Intent(ChangePassword.this, MainActivity.class);
                        startActivity(refresh);
                        finish();
                    }else{
                        Toast.makeText(ChangePassword.this, "Invalid password", Toast.LENGTH_SHORT).show();
                        oPass.setText("");
                    }
                }
            }
        });


        //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
        if (valor == "No hay dato") {
            oPass.setVisibility(View.INVISIBLE);
            lo.setVisibility(View.INVISIBLE);
        }else{
            oPass.setVisibility(View.VISIBLE);
            lo.setVisibility(View.VISIBLE);
            nPass.setVisibility(View.VISIBLE);
            ln.setVisibility(View.VISIBLE);
        }
    }
}

