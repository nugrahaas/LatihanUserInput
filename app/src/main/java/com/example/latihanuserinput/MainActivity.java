package com.example.latihanuserinput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText bil1;
    private EditText bil2;
    private EditText jumlah;
    private Button btnHasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }

    private void initEvent() {
        btnHasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungJumlah();
            }
        });

    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(bil1.getText().toString());
        int angka2 = Integer.parseInt(bil2.getText().toString());
        int total = angka1 + angka2;
        jumlah.setText(total+"");

    }

    private void initUI() {
        bil1 = findViewById(R.id.txtBil1);
        bil2 = findViewById(R.id.txtBil2);
        jumlah = findViewById(R.id.jumlah);
        btnHasil = findViewById(R.id.btnHasil);

    }
}
