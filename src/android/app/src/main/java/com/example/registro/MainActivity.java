package com.example.registro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titolo= findViewById(R.id.labelRegistroElettronico);
        TextView titolo1= findViewById(R.id.labelRegistroElettronico);


        Button buttonDocente = findViewById(R.id.buttonProfessore);
        Button buttonGenitore = findViewById(R.id.buttonGenitore);
        Button buttonStudente = findViewById(R.id.buttonStudente);


        buttonDocente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, logDocenteActivity.class);
                startActivity(intent);
            }
        });

        buttonGenitore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, logGenitoreActivity.class);
                startActivity(intent);
            }
        });

        buttonStudente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this, logStudenteActivity.class);
                startActivity(intent);
            }
        });
    }

}
