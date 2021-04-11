package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNama   = findViewById(R.id.et_nama);
        EditText etNim    = findViewById(R.id.et_nim);
        EditText etNilai  = findViewById(R.id.et_nilai);
        Button btnSubmit = findViewById(R.id.btn_submit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Activity2.class);
                i.putExtra("nama", etNama.getText().toString());
                i.putExtra("nim", etNim.getText().toString());
                String sNilai   = etNilai.getText().toString();
                String hasil = "";
                double nilai    = Double.parseDouble(sNilai);
                if (nilai > 3.66 && nilai <= 4.00){
                    hasil = "A";
                } else if (nilai > 3.33 && nilai <= 3.66) {
                    hasil = "A-";
                } else if (nilai > 3.00 && nilai <= 3.33) {
                    hasil = "B+";
                } else if (nilai > 2.66 && nilai <= 3.00) {
                    hasil = "B";
                } else if (nilai > 2.33 && nilai <= 2.66) {
                    hasil = "B-";
                } else if (nilai > 2.00 && nilai <= 2.33) {
                    hasil = "C+";
                } else if (nilai > 1.66 && nilai <= 2.00) {
                    hasil = "C";
                } else if (nilai > 1.33 && nilai <= 1.66) {
                    hasil = "C-";
                } else if (nilai > 1.00 && nilai <= 1.33) {
                    hasil = "D+";
                } else if (nilai == 1.00) {
                    hasil = "D";
                }
                i.putExtra("nilai", hasil);
                startActivity(i);
            }
        });
    }
}