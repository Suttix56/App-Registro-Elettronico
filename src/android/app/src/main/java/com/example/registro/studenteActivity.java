package com.example.registro;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class studenteActivity extends AppCompatActivity {

    private RelativeLayout cerchioVerde;
    private TextView numeroTextView, materiaTextView;
    private LinearLayout votiLayout;
    private ArrayList<String> materie;
    private ArrayList<Integer> voti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studente);

        cerchioVerde = findViewById(R.id.cerchio_verde);
        numeroTextView = findViewById(R.id.numero);
        materiaTextView = findViewById(R.id.media);
        votiLayout = findViewById(R.id.materieLayout);

        // Inizializza i dati
        voti = new ArrayList<>();
        voti.add(3);
        voti.add(4);
        voti.add(10);
        voti.add(7);

        materie = new ArrayList<>();
        materie.add("Italiano");
        materie.add("Matematica");
        materie.add("Inglese");
        materie.add("Scienze");

        int voto = voti.get(0);
        String materia = materie.get(0);

        numeroTextView.setText(String.valueOf(voto));

        if (voto >= 6) {
            cerchioVerde.setBackgroundResource(R.drawable.cerchio_verde);
        } else {
            cerchioVerde.setBackgroundResource(R.drawable.cerchio_rosso);
        }

        TextView valutazioniTextView = findViewById(R.id.valutazioni);
        valutazioniTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerchioVerde.setVisibility(View.GONE);
                numeroTextView.setVisibility(View.GONE);
                materiaTextView.setVisibility(View.GONE);

                votiLayout.setVisibility(View.VISIBLE);
                votiLayout.removeAllViews();

                for (int i = 0; i < voti.size(); i++) {
                    Button votoButton = new Button(studenteActivity.this);
                    votoButton.setText(materie.get(i));
                    votoButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // Azione da eseguire quando viene cliccato un voto
                        }
                    });
                    votiLayout.addView(votoButton);
                }
            }
        });

        TextView valutazioniTesxtView = findViewById(R.id.valutazioni);
        valutazioniTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cerchioVerde.setVisibility(View.GONE);
                numeroTextView.setVisibility(View.GONE);
                materiaTextView.setVisibility(View.GONE);

                votiLayout.setVisibility(View.VISIBLE);
                votiLayout.removeAllViews();

                for (int i = 0; i < voti.size(); i++) {
                    Button votoButton = new Button(studenteActivity.this);
                    votoButton.setText(materie.get(i));
                    votoButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            // Azione da eseguire quando viene cliccato un voto
                        }
                    });
                    votiLayout.addView(votoButton);
                }
            }
        });
    }
}
