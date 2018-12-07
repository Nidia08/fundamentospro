package com.example.nidia.progra;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
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
    Button nPass,acceder,register, delete;
    String valor,valor2,valor3,Pass,User;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass", "no hay");
        valor2 = sharedPreferences.getString("newUser", "no hay");
        valor3 = sharedPreferences.getString("learn","no hay");
        //Toast.makeText(this, valor, Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, valor3, Toast.LENGTH_LONG).show();

        pass = (EditText) findViewById(R.id.password);
        user = (EditText) findViewById(R.id.user);
        nPass = (Button) findViewById(R.id.newPassword);
        register = (Button) findViewById(R.id.register);
        acceder = (Button) findViewById(R.id.acceder);
        delete = (Button) findViewById(R.id.delete);
        Tuser = (TextView)findViewById(R.id.user);
        acceder.setEnabled(true);
        delete.setEnabled(true);
        nPass.setEnabled(true);
        pass.setEnabled(true);
        user.setEnabled(true);
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
                if ((valor.equals(pass.getText().toString())) && (valor2.equals(user.getText().toString())) && (valor3.equals("no hay"))) {
                    Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
                    finish();
                    Intent intent = new Intent(MainActivity.this, Aprendizaje.class);
                    startActivity(intent);
                } else {
                    if ((valor.equals(pass.getText().toString())) && (valor2.equals(user.getText().toString())) && (!valor3.equals("no hay"))) {
                        Toast.makeText(MainActivity.this, "Welcome" , Toast.LENGTH_SHORT).show();
                        finish();
                        Intent intent = new Intent(MainActivity.this, LoginPreguntas.class);
                        startActivity(intent);
                    } else {
                        Toast.makeText(MainActivity.this, "Invalid data", Toast.LENGTH_SHORT).show();
                        user.setText("");
                        pass.setText("");
                        user.requestFocus();
                    }
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pass = pass.getText().toString();
                User = user.getText().toString();
                //Toast.makeText(MainActivity.this, Pass + " " +User, Toast.LENGTH_LONG).show();
                if ((Pass.equals("")) || (User.equals("")) || ((Pass.equals("")) && (User.equals("")))){
                    Toast.makeText(MainActivity.this, "Please enter the user and the password", Toast.LENGTH_SHORT).show();
                    user.requestFocus();
                } else {
                    if ((!valor.equals(Pass)) && (!valor2.equals(User))) {
                        Toast.makeText(MainActivity.this, "Invalid data", Toast.LENGTH_LONG).show();
                        pass.setText(" ");
                        user.setText(" ");
                        user.requestFocus();
                    } else {
                        //Toast.makeText(context, pass, Toast.LENGTH_SHORT).show();
                        //Toast.makeText(context, valor, Toast.LENGTH_SHORT).show();
                        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MainActivity.this);
                        dialogo1.setTitle("Important");
                        dialogo1.setMessage("Are you shure?");
                        dialogo1.setCancelable(false);
                        dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {
                                dialogo1.cancel();
                                    SharedPreferences.Editor edito = getSharedPreferences("Archivo", MODE_PRIVATE).edit();
                                    edito.clear().apply();
                                    // /sharedPreferences.edit().clear().commit();
                                    valor = sharedPreferences.getString("newPass", "No hay dato");
                                    Toast.makeText(MainActivity.this, "Account deleted", Toast.LENGTH_SHORT).show();
                                    finish();
                                    Intent refresh = new Intent(MainActivity.this, MainActivity.class);
                                    startActivity(refresh);
                            }
                        });
                        dialogo1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialogo1, int id) {

                            }
                        });
                        dialogo1.show();
                    }
                }
            }
        });

       if((valor.equals("no hay"))&&(valor2.equals("no hay"))){
           AlertDialog.Builder dialogo1 = new AlertDialog.Builder(MainActivity.this);
           dialogo1.setTitle("Important");
           dialogo1.setMessage("You do not have an account, pleas create one");
           dialogo1.setCancelable(false);
           dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialogo1, int id) {
                   dialogo1.cancel();
                   finish();
                   Intent intent = new Intent (MainActivity.this, Register.class);
                   startActivity(intent);
               }
           });
           dialogo1.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
               public void onClick(DialogInterface dialogo1, int id) {
                   finish();

               }
           });
           dialogo1.show();
            acceder.setEnabled(false);
            delete.setEnabled(false);
            nPass.setEnabled(false);
            pass.setEnabled(false);
            user.setEnabled(false);
        }


}
}
