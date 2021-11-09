package com.csto.pruebamapabyronsernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class ventana2 extends AppCompatActivity {
    Intent I;
    String seleccionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
    }
    public void volver(View V){
        Intent I = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(I);
    }
    public void satelite(View V){

        Intent I = new Intent(getApplicationContext(),MapsActivity.class);
        startActivity(I);



    }
}