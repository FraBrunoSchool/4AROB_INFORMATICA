package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrisActivity extends AppCompatActivity {
    private TextView lbTilt, lbToccaA;
    private Button matrix[][] = new Button[3][3];
    String idBtn;
    private String part1;
    private String part2;
    int i;
    int j;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);
        bindComponents();
        setupEventListener();
    }

    private void bindComponents(){
        lbTilt=findViewById(R.id.lblTit);
        lbToccaA=findViewById(R.id.lbToccaA);
        Intent intent=getIntent();
        part1=intent.getStringExtra("g1");
        part2=intent.getStringExtra("g2");
        lbTilt.setText(part1+"VS"+part2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                idBtn = "@+id/btn"+i+j;
                matrix[i][j]=findViewById(Integer.parseInt(idBtn));
            }
        }
    }

    private void setupEventListener() {
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matrix[i][j].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (lbToccaA.getText().equals(part1)){
                            matrix[i][j].setText("O");
                            lbToccaA.setText(part2);
                        }else{
                            if (lbToccaA.getText().equals(part2)){
                                matrix[i][j].setText("X");
                                lbToccaA.setText(part1);
                            }
                        }
                    }
                });
            }
        }
    }
}
