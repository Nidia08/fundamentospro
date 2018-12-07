package com.example.nidia.progra;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Consejos extends AppCompatActivity {
String valor,valor2,valor3;
TextView apren,mat,us,cons1;
Button next;
int nex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejos);

        apren=(TextView) findViewById(R.id.Aprendizaje);
        mat = (TextView)findViewById(R.id.Mate);
        us = (TextView)findViewById(R.id.UserName);
        next = (Button)findViewById(R.id.next);

        cons1 = (TextView)findViewById(R.id.consejo1);
        cons1.setMovementMethod(new ScrollingMovementMethod());


        final SharedPreferences sharedPreferences =  getSharedPreferences("Archivo",MODE_PRIVATE);
        valor = sharedPreferences.getString("Mate", "no hay");
        valor2 = sharedPreferences.getString("newUser", "no hay");
        valor3 = sharedPreferences.getString("learn","no hay");

        if(valor3.equals("Auditive")){
            apren.setText("You are an "+valor3+ " person");
        }else{
            apren.setText("You are a "+valor3+ " person");
        }

        us.setText("Hello "+valor2+", you can practice this tips");
        mat.setText("Asignature "+valor);


        if((valor3.equals("Auditive"))&&(valor.equals("Maths"))){
            matAudi();
        }else if((valor3.equals("Visual"))&&(valor.equals("Maths"))){
            matVisual();
        }else if((valor3.equals("Kinestesico"))&&(valor.equals("Maths"))){
           matKines();
        }else if((valor3.equals("Auditive"))&&(valor.equals("NaturalSciences"))){
            snAudi();
        }else if((valor3.equals("Visual"))&&(valor.equals("NaturalSciences"))){
            snVisual();
        }else if((valor3.equals("Kinestesico"))&&(valor.equals("NaturalSciences"))){
            snkines();
        }else if((valor3.equals("Auditive"))&&(valor.equals("History"))){
            hAudi();
        }else if((valor3.equals("Visual"))&&(valor.equals("History"))){
            hVisual();
        }else if((valor3.equals("Kinestesico"))&&(valor.equals("History"))){
            hkines();
        }else if((valor3.equals("Auditive"))&&(valor.equals("Spanish"))){
            sAudi();
        }else if((valor3.equals("Visual"))&&(valor.equals("Spanish"))){
            sVisual();
        }else if((valor3.equals("Kinestesico"))&&(valor.equals("Spanish"))){
            skines();
        }


    }
    public void matAudi(){
        cons1.setText("-Listen to tutorials of the procedure of a problem that you want to solve.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Repit the procedure out loud in order to learn it.");
                    ++nex;
                }else if(nex==2){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });

    }
    public void matVisual(){
        cons1.setText("-Make memory cards or flashcards: This servers to learn the most important procedure, formulas and concepts.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-In this way, you will have all the information that you need in one place and in a summarized way.");
                    ++nex;
                }else if(nex==2){
                    cons1.setText("-You can take them with you an study them in free time.");
                    ++nex;
                }else if(nex==3){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void matKines(){
        cons1.setText("-Dramatizations: The group represents a certain situation before others, with the aim of understanding and analizing later.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-This representation and analysis can be effective for the students of both kinesthetic and auditory predominance, since while some simulate and experiment whith the body, others will remember the verbal sounds emitted by their peers.");
                    ++nex;
                }else if(nex==2){
                    cons1.setText("-One option is to solve long formulas in teams where everyone participates.");
                    ++nex;
                }else if(nex==3){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void snAudi(){
        cons1.setText("-Repeat yourselft the main concepts and ideas.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nex == 1) {
                    cons1.setText("-Make a rcording of your voice mentioning the main points you want to sttudy.");
                    ++nex;
                } else if (nex == 2) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void snVisual(){
        cons1.setText("-Create conseptual maps and infographics: To organize your notes and the obligatory bibliography.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Transform the information to how it beast suits you, convert it into images or small concepts that you can easily remember.");
                    ++nex;
                }else if(nex==2){
                    cons1.setText("-Look for key words that help your mind to have quick access to information.");
                    ++nex;
                }else if(nex==3){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void snkines(){
        cons1.setText("-Field work: outings from school or home to learn topics related to experimentation are a very effective resource for this type of students. his learning is enhanced by being in contact(touching and feeling) with what he is willing to learn. Therefore, any subject with a practical nature or the students themselves when learning a specific topic can be based on practical experimentation to enchance their learning process. For example, in a subject such as geography students can learn the diferent types of terrain or mountains by experimenting in the first person on the field.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Transform the information to how it beast suits you, convert it into images or small concepts that you can easily remember.");
                    ++nex;
                }else if(nex==2){
                    cons1.setText("-Look for key words that help your mind to have quick access to information.");
                    ++nex;
                }else if(nex==3){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void hAudi(){
        cons1.setText("-Search videos on the internet about the subject being studied and listen to everything that is mentioned.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Repeat loudly the most important points in order to memorize them and make recording of them to listen.");
                    ++nex;
                }else if(nex==2){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void hVisual(){
        cons1.setText("-Use highlighters: Implement a color code to categorize and / or organize your material.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Organize your notes whit clips, notes, etc. and give a meaning or date to each color or material.");
                    ++nex;
                }else if(nex==2){
                    cons1.setText("-So when looking for some specific information it will be easier to reach it.");
                    ++nex;
                }else if(nex==3){
                    cons1.setText("-You can organize on periods, place and/or relevance.");
                    ++nex;
                }else if(nex==4){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void hkines(){
        cons1.setText("-Role playing: with this technique the students simulate a daily situation. The fact of representing a specific topic in subject, for example in History, will possibly cause that more information remain in the memory of the participants, since they have lived it and felt it first-hand.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nex == 1) {
                    cons1.setText("-Students with inesthtic predominance can use this tecnique at hom, representing and feeling like a character of the time when studying the characteristics of that period or the way of life at that time.");
                    ++nex;
                } else if (nex == 2) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }

    public void sAudi(){
        cons1.setText("-To study something like the writing rules you can repeat them to yourself and then mention a sentence.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nex == 1) {
                    cons1.setText("-Lisent to sentences in which errors must be indentified.");
                    ++nex;
                } else if (nex == 2) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void sVisual(){
        cons1.setText("-Take notes by hand: While it may be outdated and often takes more time, scientific evidence indicates that those who implement handwriting remember data more easily compared to those who take notes on a computer or tablet.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(nex==1){
                    cons1.setText("-Write small summaries about information that you can easily remeber with your own words");
                    ++nex;
                }else if(nex==2){
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
    public void skines(){
        cons1.setText("-Mind maps: this technique can also work for visual students; however, due to the fact that it requires a learning by doing it could be ideal for the restless.");
        nex=1;
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (nex == 1) {
                    cons1.setText("-Mental maps are a way of organizing information that comes out of a common center, usually made by hand, include illustrations or images that ilustrate important concepts.");
                    ++nex;
                } else if (nex == 2) {
                    AlertDialog.Builder dialogo1 = new AlertDialog.Builder(Consejos.this);
                    dialogo1.setTitle("Important");
                    dialogo1.setMessage("Good luck!");
                    dialogo1.setCancelable(false);
                    dialogo1.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialogo1, int id) {
                            dialogo1.cancel();
                            finish();
                            Intent refresh = new Intent(Consejos.this, LoginPreguntas.class);
                            startActivity(refresh);
                            nex=0;
                        }
                    });
                    dialogo1.show();
                }
            }
        });
    }
}
