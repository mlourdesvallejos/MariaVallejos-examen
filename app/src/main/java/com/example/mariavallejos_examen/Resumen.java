package com.example.mariavallejos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resumen extends AppCompatActivity {

    TextView estudianteRecibido;
    Bundle dato2;
    TextView u1,u2,u3,u4,u5,u6;
    Bundle  resultados1, resultados2,resultados3,resultados4,resultados5,resultados6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumen);

       //Resultados de la encuesta
        u1 = findViewById(R.id.editText6);
        u2 = findViewById(R.id.editText7);
        u3 = findViewById(R.id.editText8);
        //Recibir datos de la vista
        u4= findViewById(R.id.tvRecibirUsuario);
        u5 = findViewById(R.id.tvRecibirNombre);
        u6= findViewById(R.id.tvRecibirTotal);


        resultados1 = getIntent().getExtras();
        resultados2 = getIntent().getExtras();
        resultados3 = getIntent().getExtras();
        resultados4 = getIntent().getExtras();
        resultados5 = getIntent().getExtras();
        resultados6 = getIntent().getExtras();



        String recibir1 = resultados1.getString("dato1");
        String recibir2 = resultados2.getString("dato2");
        String recibir3 = resultados3.getString("dato3");
        //usuario
        String recibir4 = resultados4.getString("dato6");
        //nombre
        String recibir5 = resultados5.getString("dato4");
        //valor
       String recibir6 = resultados6.getString("dato5");


        u1.setText(recibir1);
        u2.setText(recibir2);
        u3.setText(recibir3);
        u4.setText(recibir4);
        u5.setText(recibir5);
        u6.setText(recibir6);

    }

}
