package com.example.mariavallejos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    EditText montoinicial, cuotas, estudiante;
    TextView usuarioRecibido;
    String recibiru,total;
    //este me permite recibir de la otra ventana
    Bundle dato;
    Double totalpagar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        //AQUI RECIBO EL DATO DEL USUARIO
        usuarioRecibido = findViewById(R.id.tvRecibir2);
        dato = getIntent().getExtras();
        recibiru = dato.getString("usuarioenviado");

    }

    public void Calcular(View v) {

        double valor1, valor2;
        montoinicial = findViewById(R.id.etMontoI);
        cuotas = findViewById(R.id.etCuotas);

        valor1 = Double.parseDouble(montoinicial.getText().toString());
        valor2 = ((1800 - valor1)/3)+(1800*.05);
        cuotas.setText(String.format("%.2f",valor2));
        totalpagar = valor1 + (valor2*3);
        total=Double.toString(totalpagar);

    }

    public void Guardar(View v)
    {

        //ESTOY ENVIANDO EL DATO DEL NOMBRE ESTUDIANTE
        estudiante = findViewById(R.id.etNombre);
        String estu = estudiante.getText().toString();


        Intent intentReg = new Intent(Registro.this, Encuesta.class);
        intentReg.putExtra("nombreenviado", estu);
        intentReg.putExtra("totalpagar", total);
        intentReg.putExtra("usuarioenviado",recibiru);
        startActivity(intentReg);


        Toast.makeText(getApplicationContext(), "Elemento guardado con éxito", Toast.LENGTH_LONG).show();

    }
}
