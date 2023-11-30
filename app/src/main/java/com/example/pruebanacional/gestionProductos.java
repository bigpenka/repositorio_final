package com.example.pruebanacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gestionProductos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestion_productos);
    }
    public void subirDatos (View view){
        Intent i = new Intent(this, subir.class);
        startActivity(i);
    }
    public void editarProd(View view){
        Intent i = new Intent(this, Detalle.class);
        startActivity(i);
    }
}