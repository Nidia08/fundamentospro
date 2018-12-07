package com.example.nidia.progra;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Aprendizaje extends AppCompatActivity {

    String valor,valor2, valor3;
    Button sig;
    RadioButton oU,oD,oT;
    TextView pregunta;
    int a=1,b=0, audi=0,visual=0,kine=0;
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


       final SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        valor = sharedPreferences.getString("newPass", "no hay");
        valor2 = sharedPreferences.getString("newUser", "no hay");

        AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Aprendizaje.this);
        dialogo1.setTitle("Important");
        dialogo1.setMessage("Please answer the following questions");
        dialogo1.setCancelable(false);
        dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                dialogo1.cancel();
                pregunta.setText("When you talk to another person, you:");
                oU.setText("a) You listen carefully");
                oD.setText("b) You watch it");
                oT.setText("c) You tend to touch her");
                b=1;


            }
        });
        dialogo1.show();




        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b == 1) {
                    if ((oU.isChecked()) && (oU.getText() == "a) You listen carefully")) {
                        ++audi;
                    } else if ((oD.isChecked()) && (oD.getText() == "b) You watch it")) {
                        ++visual;
                    } else if ((oT.isChecked()) && (oT.getText() == "c) You tend to touch her")) {
                        ++kine;
                    }
                    group.clearCheck();
                    b = 2;
                    a = 1;
                }
                if ((a == 1) && (b == 2)) {
                    pregunta.setText("What do you prefer to do on a Saturday afternoon?");
                    oU.setText("a) Stay at home");
                    oD.setText("b) Go to a concert");
                    oT.setText("c) Go to the movies");
                    if ((oU.isChecked()) && (oU.getText() == "a) Stay at home")) {
                        ++audi;
                    } else if ((oD.isChecked()) && (oD.getText() == "b) Go to a concert")) {
                        ++kine;

                    } else if ((oT.isChecked()) && (oT.getText() == "c) Go to the movies")) {
                        ++visual;
                    }
                    ++a;
                    group.clearCheck();
                } else {
                    if (a == 2) {
                        pregunta.setText("What kind of test are easier for you?");
                        oU.setText("a) Oral test");
                        oD.setText("b) Written test");
                        oT.setText("c) Multiple choice test");
                        if ((oU.isChecked()) && (oU.getText() == "a) Oral test")) {
                            ++audi;
                        } else if ((oD.isChecked()) && (oD.getText() == "b) Written test")) {
                            ++kine;
                        } else if ((oT.isChecked()) && (oT.getText() == "c) Multiple choice test")) {
                            ++visual;
                        }
                            ++a;
                            group.clearCheck();
                        } else {
                            if (a == 3) {
                                pregunta.setText("In what way is it easier to learn something?");
                                oU.setText("a) Repeating out loud");
                                oD.setText("b) Writing it several times");
                                oT.setText("c) Relating it to something fun");
                                if ((oU.isChecked()) && (oU.getText() == "a) Repeating out loud")) {
                                    ++audi;
                                } else if ((oD.isChecked()) && (oD.getText() == "b) Writing it several times")) {
                                    ++visual;
                                } else if ((oT.isChecked()) && (oT.getText() == "c) Relating it to something fun")) {
                                    ++kine;
                                }
                                ++a;
                                group.clearCheck();
                            } else {
                                if (a == 4) {
                                    pregunta.setText("How do you form an opinion of other people?");
                                    oU.setText("a) For the sincerity in his voice");
                                    oD.setText("b) By the way you shake your hand");
                                    oT.setText("c) Because of its appearance");
                                    if ((oU.isChecked()) && (oU.getText() == "a) For the sincerity in his voice")) {
                                        ++audi;
                                    } else if ((oD.isChecked()) && (oD.getText() == "b) By the way you shake your hand")) {
                                        ++kine;
                                    } else if ((oT.isChecked()) && (oT.getText() == "c) Because of its appearance")) {
                                        ++visual;
                                    }
                                    ++a;
                                    group.clearCheck();
                                } else {
                                    if (a == 5) {
                                        pregunta.setText("Choose one:");
                                        oU.setText("a) At school I prefer to listen to the teacher carefully.");
                                        oD.setText("b) At school I am restless, I need it to end soon.");
                                        oT.setText("c) At school I prefer to look at what they write on the board.");
                                        if ((oU.isChecked()) && (oU.getText() == "a) At school I prefer to listen to the teacher carefully.")) {
                                            ++audi;
                                        } else if ((oD.isChecked()) && (oD.getText() == "b) At school I am restless, I need it to end soon.")) {
                                            ++kine;
                                        } else if ((oT.isChecked()) && (oT.getText() == "c) At school I prefer to look at what they write on the board.")) {
                                            ++visual;
                                        }
                                        ++a;
                                        group.clearCheck();
                                    } else {
                                        if (a == 6) {
                                            int k = kine, aud = audi, vis = visual;
                                            int sum = k + aud + vis+1;
                                            //Toast.makeText(Aprendizaje.this, sum, Toast.LENGTH_SHORT).show();
                                            if (sum ==6) {
                                                if ((visual > kine) && (visual > audi)) {
                                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                                    editor.putString("learn", "Visual");
                                                    editor.commit();
                                                    finish();
                                                    Intent intent = new Intent(Aprendizaje.this, LoginPreguntas.class);
                                                    startActivity(intent);
                                                } else if ((kine > visual) && (kine > audi)) {
                                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                                    editor.putString("learn", "Kinestesico");
                                                    editor.commit();
                                                    finish();
                                                    Intent intent = new Intent(Aprendizaje.this, LoginPreguntas.class);
                                                    startActivity(intent);
                                                } else if ((audi > visual) && (audi > kine)) {
                                                    SharedPreferences.Editor editor = sharedPreferences.edit();
                                                    editor.putString("learn", "Auditive");
                                                    editor.commit();
                                                    finish();
                                                    Intent intent = new Intent(Aprendizaje.this, LoginPreguntas.class);
                                                    startActivity(intent);
                                                }
                                            } else {
                                                AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Aprendizaje.this);
                                                dialogo1.setTitle("Important");
                                                dialogo1.setMessage("Please answer all the questions"+sum);
                                                dialogo1.setCancelable(false);
                                                dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                                                    public void onClick(DialogInterface dialogo1, int id) {
                                                        dialogo1.cancel();
                                                        Intent intent = new Intent(Aprendizaje.this, Aprendizaje.class);
                                                        startActivity(intent);
                                                    }
                                                });
                                                dialogo1.show();

                                            }
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
        });
    }
}


