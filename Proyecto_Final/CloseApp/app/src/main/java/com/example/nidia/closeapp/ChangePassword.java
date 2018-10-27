package com.example.nidia.closeapp;

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
    Button most;
    String valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password);
        final Context context = this;
        final SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        //SharedPreferences sharedPreferences = getPreferences(context.MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass","No hay dato");

        oPass = (EditText) findViewById(R.id.oldPassword);
        nPass = (EditText) findViewById(R.id.nePassword);
        hecho = (Button) findViewById(R.id.hecho);
        most = (Button) findViewById(R.id.boton);
        lo = (TextView) findViewById(R.id.label);
        ln = (TextView) findViewById(R.id.label2);


        hecho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                if(valor=="No hay dato"){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("newPass",nPass.getText().toString());
                    editor.commit();
                    valor = sharedPreferences.getString("newPass","No hay dato");
                    Toast.makeText(ChangePassword.this, "A definido una contraseña ", Toast.LENGTH_SHORT).show();

                    oPass.setText("");
                    nPass.setText("");
                    Intent refresh = new Intent(ChangePassword.this, MainActivity.class);
                    startActivity(refresh);
                    finish();
                }else{
                    //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                    //Toast.makeText(context,nPass.getText().toString() , Toast.LENGTH_SHORT).show();
                    if(valor.equals(oPass.getText().toString())){
                        SharedPreferences.Editor edito = getSharedPreferences("Archivo", MODE_PRIVATE).edit();
                        edito.clear().apply();
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        editor.putString("newPass",nPass.getText().toString());
                        editor.commit();
                        //valor = sharedPreferences.getString("newPass","No hay dato");
                        Toast.makeText(ChangePassword.this, "A cambiado la contraseña", Toast.LENGTH_SHORT).show();

                        oPass.setText("");
                        nPass.setText("");
                        Intent refresh = new Intent(ChangePassword.this, MainActivity.class);
                        startActivity(refresh);
                        finish();
                    }else{
                        Toast.makeText(ChangePassword.this, "Contraseña invaida", Toast.LENGTH_SHORT).show();
                        oPass.setText("");
                    }
                }
            }
        });
        most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nPass.setVisibility(View.INVISIBLE);
                ln.setVisibility(View.INVISIBLE);
                hecho.setEnabled(false);

                String pass = oPass.getText().toString();
                //Toast.makeText(context, pass, Toast.LENGTH_SHORT).show();
                //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                if (pass.equals(" ")) {
                    Toast.makeText(context, "Porfavor ingrese la contraseña anterior", Toast.LENGTH_SHORT).show();
                }else{
                    if(valor.equals(pass)){
                        SharedPreferences.Editor edito = getSharedPreferences("Archivo", MODE_PRIVATE).edit();
                        edito.clear().apply();
                        // /sharedPreferences.edit().clear().commit();
                        valor = sharedPreferences.getString("newPass","No hay dato");
                        Toast.makeText(ChangePassword.this, "A desactivado la contraseña", Toast.LENGTH_SHORT).show();
                        oPass.setText("");
                        Intent refresh = new Intent(ChangePassword.this, MainActivity.class);
                        startActivity(refresh);
                        finish();
                    }else {
                        Toast.makeText(context, "Contraseña invalida", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
        if (valor == "No hay dato") {
            oPass.setVisibility(View.INVISIBLE);
            lo.setVisibility(View.INVISIBLE);
            most.setEnabled(false);
        }else{
            oPass.setVisibility(View.VISIBLE);
            lo.setVisibility(View.VISIBLE);
            nPass.setVisibility(View.VISIBLE);
            ln.setVisibility(View.VISIBLE);
            most.setEnabled(true);
        }
    }
}
