package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";
    private Button btnSal, btnAltoBasso;
    private TextView txtS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void bindComponent(){
        btnSal = findViewById(R.id.btnSaluta);
        txtS = findViewById(R.id.txtSaluta);
        btnAltoBasso = findViewById(R.id.btnAltoBasso);
    }

    private void setupEventListener(){
        btnSal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtS.setText("Benvenuto, Marco!");
            }
        });
        btnAltoBasso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Avvio nuova Activity per giocare ad Alto&Basso
                Intent intent = new Intent(MainActivity.this, AltobassoActivity.class);
                //intent.putExtra("var", "valore");
                startActivity(intent);
            }
        });
    }
}
