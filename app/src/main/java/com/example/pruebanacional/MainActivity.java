package com.example.pruebanacional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void verProd(View v){
        Intent i = new Intent(this, verProductos.class);
        startActivity(i);
    }
    public void gestionProd(View view){
        Intent i = new Intent(this, gestionProductos.class);
        startActivity(i);
    }

}