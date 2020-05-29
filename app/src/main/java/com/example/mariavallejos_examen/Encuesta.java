package com.example.mariavallejos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;

public class Encuesta extends AppCompatActivity {

    TextView estudianteRecibido;
    Bundle dato2,dato3,dato4;
    String resultado1,resultado2,resultado3,recibirnombre,recibirvalor,recibirusuario;

    CheckBox natacion,futbol,tenis;
    RadioButton si, no;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        //mostrar nombre estudiante
        //estudianteRecibido = findViewById(R.id.tvRecibir2);
        dato2 = getIntent().getExtras();
        recibirnombre = dato2.getString("nombreenviado");
        //estudianteRecibido.setText(recibir);
        dato3 = getIntent().getExtras();
        recibirvalor= dato3.getString("totalpagar");
        //recibir usuario
        dato4 = getIntent().getExtras();
        recibirusuario=dato4.getString("usuarioenviado");

        //recibirvalor = dato3.getString("valorenviado");


    }


    public void GuardarEncuesta(View v) {

        //Asignar a las variables los objetos;
        texto = findViewById(R.id.etRes);
        natacion=findViewById(R.id.cb1);
        futbol= findViewById(R.id.cb2);
        tenis = findViewById(R.id.cb3);
        si = findViewById(R.id.rb1);
        no = findViewById(R.id.rb2);


        //Presentar resultados

        if (natacion.isChecked() == true) {
            resultado2 = natacion.getText().toString();

        } else if (futbol.isChecked() == true) {
            resultado2 = futbol.getText().toString();
        } else if (tenis.isChecked() == true) {
            resultado2 = tenis.getText().toString();
        }


        if (si.isChecked() == true) {
            resultado3 = si.getText().toString();
        } else {
            resultado3 = no.getText().toString();
        }

        resultado1=texto.getText().toString();

        Intent intentEnvioApp3R1 = new Intent(Encuesta.this, Resumen.class);
        intentEnvioApp3R1.putExtra("dato1", resultado1);
        intentEnvioApp3R1.putExtra("dato2", resultado2);
        intentEnvioApp3R1.putExtra("dato3", resultado3);
        intentEnvioApp3R1.putExtra("dato4",recibirnombre);
        intentEnvioApp3R1.putExtra("dato5",recibirvalor);
        intentEnvioApp3R1.putExtra("dato6",recibirusuario);

        startActivity(intentEnvioApp3R1);
    }



}
