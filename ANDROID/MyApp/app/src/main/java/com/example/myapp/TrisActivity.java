package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrisActivity extends AppCompatActivity {
    private TextView lbTilt, lbToccaA;
    Button matrix[][];
    String idBtn;
    private String part1;
    private String part2;
    private Button btnReset;
    boolean turno = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tris);
        bindComponents();
        Intent intent;
        intent=getIntent();
        part1=intent.getStringExtra("g1");
        part2=intent.getStringExtra("g2");
        lbTilt.setText(part1+" VS "+part2);
        lbToccaA.setText("Tocca a: " + part1);
        setupEventListener();
    }

    private void bindComponents(){
        lbTilt=findViewById(R.id.lblTit);
        lbToccaA=findViewById(R.id.lbToccaA);
        btnReset = findViewById(R.id.reset);
        matrix = new Button[3][3];
        matrix[0][0] = findViewById(R.id.btn_0_0);
        matrix[0][1] = findViewById(R.id.btn_0_1);
        matrix[0][2] = findViewById(R.id.btn_0_2);
        matrix[1][0] = findViewById(R.id.btn_1_0);
        matrix[1][1] = findViewById(R.id.btn_1_1);
        matrix[1][2] = findViewById(R.id.btn_1_2);
        matrix[2][0] = findViewById(R.id.btn_2_0);
        matrix[2][1] = findViewById(R.id.btn_2_1);
        matrix[2][2] = findViewById(R.id.btn_2_2);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j].setTransitionName("btn_" + i + "_" + j);
                matrix[i][j].setOnClickListener(new myListener());
            }
        }
    }

    void bloccaPulsanti(){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j].setEnabled(false);
            }
        }
    }

    class myListener implements View.OnClickListener{
        private static final String TAG = "ClassListener";
        @Override
        public void onClick(View v) {
            int x, y;
            x = Integer.parseInt(((Button) v).getTransitionName().split("_")[1]);
            y = Integer.parseInt(((Button) v).getTransitionName().split("_")[2]);
            Log.d(TAG, "onClick: "+ x + " " + y);
            if(turno){
                lbToccaA.setText("Tocca a: " + part2);
                ((Button) v).setText("X");
                check(x, y);
                turno = false;
            }else{
                lbToccaA.setText("Tocca a: " + part1);
                ((Button) v).setText("O");
                check(x, y);
                turno = true;
            }
            ((Button) v).setEnabled(false); // disabilitiamo il click del pulsante*/

        }
        public void check(int x, int y){
            boolean vittoria = false;
            if(matrix[0][y].getText().equals(matrix[x][y].getText())
                && matrix[1][y].getText().equals(matrix[x][y].getText())
                && matrix[2][y].getText().equals(matrix[x][y].getText())){
                // vittoria verticale
                vittoria = true;
            }else{
                // ORIZZONTALE
                if(matrix[x][0].getText().equals(matrix[x][y].getText())
                    && matrix[x][1].getText().equals(matrix[x][y].getText())
                    && matrix[x][2].getText().equals(matrix[x][y].getText())){
                    // vittoria orizzontale
                    vittoria = true;
                }else{
                    // Diagonale principale
                    if(matrix[0][0].getText().equals(matrix[x][y].getText())
                            && matrix[1][1].getText().equals(matrix[x][y].getText())
                            && matrix[2][2].getText().equals(matrix[x][y].getText())){
                        // Vittoria diagonale p.
                        vittoria = true;
                    }else if(matrix[0][2].getText().equals(matrix[x][y].getText())
                            && matrix[1][1].getText().equals(matrix[x][y].getText())
                            && matrix[2][0].getText().equals(matrix[x][y].getText())){// Diagonale secondaria
                        // Vittoria diagonale s.
                        vittoria = true;
                    }
                }
            }
            if(vittoria){
                if (turno)lbToccaA.setText("VINCE " + part1);
                else lbToccaA.setText("VINCE " + part2);
                bloccaPulsanti();
            }
        }
    }
    private void setupEventListener(){
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // cambia il testo "La mia prima app" al click del pulsante
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        matrix[i][j].setText("-");
                        matrix[i][j].setEnabled(true);
                    }
                }
            }
        });
    }
}
