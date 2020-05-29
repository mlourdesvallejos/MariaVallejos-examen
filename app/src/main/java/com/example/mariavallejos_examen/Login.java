package com.example.mariavallejos_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText etUser, etPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ////Asocio los elementos et1 y et2
        etUser = findViewById(R.id.etUsuario);
        etPass = findViewById(R.id.etPassword);
    }

    public void Login(View v) {

        String usuario = etUser.getText().toString();
        String password = etPass.getText().toString();
        String datouser = "estudiante2020";
        String datopass = "uisrael2020";


        if (usuario.equals(datouser) && password.equals(datopass)) {

            Intent intentLog = new Intent(Login.this, Registro.class);
            intentLog.putExtra("usuarioenviado", usuario);
            startActivity(intentLog);
            Toast.makeText(getApplicationContext(), "Usuario Conectado: " + etUser.getText() , Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(), "Datos incorrectos", Toast.LENGTH_LONG).show();
        }


    }


}
