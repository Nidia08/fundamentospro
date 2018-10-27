package com.example.nidia.admin;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Aprendizaje extends AppCompatActivity {
    String valor;
    Button sig;
    RadioButton oU,oD,oT;
    TextView pregunta;
    int a=1,b=0, audi,visual,kine,per=0;
    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aprendizaje);

        sig = (Button) findViewById(R.id.sig);
        oU = (RadioButton) findViewById(R.id.oU);
        oD = (RadioButton) findViewById(R.id.oD);
        oT = (RadioButton) findViewById(R.id.oT);
        pregunta = (TextView) findViewById(R.id.pregunta);
        group = (RadioGroup) findViewById(R.id.group);

        SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass", "no hay");

            AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Aprendizaje.this);
            dialogo1.setTitle("Importante");
            dialogo1.setMessage("Porfavor contesta las siguientes preguntas");
            dialogo1.setCancelable(false);
            dialogo1.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    dialogo1.cancel();
                    pregunta.setText("Cuando conversas con otra persona, tú: ");
                    oU.setText("a) La escuchas atentamente ");
                    oD.setText("b) La observas ");
                    oT.setText("c) Tiendes a tocarla");
                   b=1;

                }
            });
            dialogo1.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogo1, int id) {
                    SharedPreferences.Editor edito = getSharedPreferences("Archivo", MODE_PRIVATE).edit();
                    edito.clear().apply();
                    Intent intent = new Intent (Aprendizaje.this, MainActivity.class);
                    startActivity(intent);

                }
            });
            dialogo1.show();




        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(b==1){
                if ((oU.isChecked())&&(oU.getText()=="a) La escuchas atentamente ")) {
                   ++audi;
                }
                if ((oD.isChecked())&&(oD.getText()=="b) La observas ")) {
                    ++visual;
                }
                if ((oT.isChecked())&&(oT.getText()=="c) Tiendes a tocarla")) {
                    ++ kine;
                }
                    b=2;
                    group.clearCheck();
                }
                    if ((a == 1)) {

                        pregunta.setText("¿Qué prefieres hacer un sábado por la tarde? ");
                        oU.setText("a) Quedarte en casa  ");
                        oD.setText("b) Ir a un concierto  ");
                        oT.setText("c) Ir al cine");

                        if ((oU.isChecked()) && (oU.getText() == "a) Quedarte en casa  ")) {
                            ++audi;
                        }
                        if ((oD.isChecked()) && (oD.getText() == "b) Ir a un concierto  ")) {
                            ++kine;
                        }
                        if ((oT.isChecked()) && (oT.getText() == "c) Ir al cine")) {
                            ++visual;
                        }
                        ++a;
                        group.clearCheck();
                    } else {
                        if (a == 2) {

                            pregunta.setText("¿Qué tipo de exámenes se te facilitan más?  ");
                            oU.setText("a) Examen oral");
                            oD.setText("b) Examen escrito");
                            oT.setText("c) Examen de opción múltiple");
                            if ((oU.isChecked()) && (oU.getText() == "a) Examen oral")) {
                                ++audi;
                            }
                            if ((oD.isChecked()) && (oD.getText() == "b) Examen escrito")) {
                                ++kine;
                            }
                            if ((oT.isChecked()) && (oT.getText() == "c) Examen de opción múltiple")) {
                                ++visual;
                            }
                            ++a;
                            group.clearCheck();
                        } else {
                            if (a == 3) {

                                pregunta.setText("¿De qué manera se te facilita aprender algo? ");
                                oU.setText("a) Repitiendo en voz alta  ");
                                oD.setText("b) Escribiéndolo varias veces ");
                                oT.setText("c) Relacionándolo con algo divertido");
                                if ((oU.isChecked()) && (oU.getText() == "a) Repitiendo en voz alta  ")) {
                                    ++audi;
                                }
                                if ((oD.isChecked()) && (oD.getText() == "b) Escribiéndolo varias veces ")) {
                                    ++visual;
                                }
                                if ((oT.isChecked()) && (oT.getText() == "c) Relacionándolo con algo divertido")) {
                                    ++kine;
                                }
                                ++a;
                                group.clearCheck();
                            } else {
                                if (a == 4) {

                                    pregunta.setText("¿De qué manera te formas una opinión de otras personas?");
                                    oU.setText("a) Por la sinceridad en su voz ");
                                    oD.setText("b) Por la forma de estrecharte la mano ");
                                    oT.setText("c) Por su aspecto");
                                    if ((oU.isChecked()) && (oU.getText() == "a) Por la sinceridad en su voz ")) {
                                        ++audi;
                                        per=1;
                                    }
                                    if ((oD.isChecked()) && (oD.getText() == "b) Por la forma de estrecharte la mano ")) {
                                        ++kine;
                                        per=1;
                                    }
                                    if ((oT.isChecked()) && (oT.getText() == "c) Por su aspecto")) {
                                        ++visual;
                                        per=1;
                                    }
                                    if(per==1){
                                        a = 0;
                                    }
                                    group.clearCheck();
                                }

                            }
                        }
                    }
                    if (a==0){
                        Toast.makeText(Aprendizaje.this, "Visual " + visual, Toast.LENGTH_SHORT).show();
                        Toast.makeText(Aprendizaje.this, "Kinestesico " + kine, Toast.LENGTH_SHORT).show();
                        Toast.makeText(Aprendizaje.this, "Auditivo " + audi, Toast.LENGTH_SHORT).show();
                    }



            }


        });


    }








}
