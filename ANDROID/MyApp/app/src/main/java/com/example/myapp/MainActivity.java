package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private TextView txtSaluta;
    private Button btnSaluta, btnAltobasso, btnAccelerometro, btnFotocamera, btnTris, btnForza4;
    private boolean stato = true;
    private String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Collego componenti grafiche
        bindComponents();
        // Collego Listener per gestione eventi
        setupEventListener();
    }

    private void bindComponents(){
        //assegna ad una variabile i componenti di activity_main
        txtSaluta = findViewById(R.id.lblTitolo);
        btnSaluta = findViewById(R.id.btnSaluta);
        btnAltobasso = findViewById(R.id.btnAltobasso);
        btnAccelerometro = findViewById(R.id.btnAccel);
        btnFotocamera = findViewById(R.id.btnFoto);
        btnTris = findViewById(R.id.btnTris);
        btnForza4 = findViewById(R.id.btnForza4);
        text = (String) txtSaluta.getText();
    }

    private void setupEventListener(){
        btnSaluta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cambia il testo "La mia prima app" al click del pulsante
                if(stato == true){
                    txtSaluta.setText("Ciao a tutti!!!");
                    stato = false;
                }else{
                    txtSaluta.setText(text);
                    stato=true;
                }
            }
        });
        //al click su questi button si apre una nuova activity
        btnAltobasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AltobassoActivity.class);
                startActivity(intent);
            }
        });
        btnAccelerometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccActivity.class);
                startActivity(intent);
            }
        });
        btnFotocamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent intent = new Intent(MainActivity.this, FotoActivity.class);
                // startActivity(intent);
            }
        });
        btnTris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenzione;
                intenzione = new Intent(MainActivity.this, TrisActivity.class);
                intenzione.putExtra("g1", "Marco");
                intenzione.putExtra("g2", "Luca");
                startActivity(intenzione);
            }
        });
        btnForza4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Forza4Activity.class);
                startActivity(intent);
            }
        });
    }
}