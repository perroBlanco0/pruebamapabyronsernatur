package com.csto.pruebamapabyronsernatur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Valores = new ArrayList<>();
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner)findViewById(R.id.spinner);
        Valores.add("San fernando");
        Valores.add("Sao Paulo, Brasil");
        Valores.add("Francfor de meno, Alemania");
        ArrayAdapter<String> Adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,Valores);
        spinner.setAdapter(Adaptador);


    }
    public void continuar(View V){
        if(spinner.getSelectedItem().toString().equals("San fernando")){
            Intent I = new Intent(getApplicationContext(),ventana2.class);
            I.putExtra("pais2","1");
            startActivity(I);
        }
        if(spinner.getSelectedItem().toString().equals("Sao Paulo, Brasil")){
            Intent I = new Intent(getApplicationContext(),ventana2.class);
            I.putExtra("pais2","2");
            startActivity(I);
        }
        if(spinner.getSelectedItem().toString().equals("Francfor de meno, Alemania")){
            Intent I = new Intent(getApplicationContext(),ventana2.class);
            I.putExtra("pais2","3");
            startActivity(I);
        }
    }
}