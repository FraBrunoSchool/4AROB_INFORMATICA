package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TrisActivity extends AppCompatActivity {
    private TextView lbTilt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);
    }

    private void bindComponents(){
        lbTilt=findViewById(R.id.lblTit);
        Intent intent=getIntent();
        lbTilt.setText(intent.getStringExtra("g1")+"VS"+intent.getStringExtra("g2"));
    }
}
