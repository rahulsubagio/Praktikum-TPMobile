package com.example.tugas2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tvNama = findViewById(R.id.tv_nama);
        TextView tvNim  = findViewById(R.id.tv_nim);
        TextView tvNilai= findViewById(R.id.tv_nilai);
        Bundle bundle   = getIntent().getExtras();
        String sNama    = bundle.getString("nama");
        String sNim     = bundle.getString("nim");
        String sNilai   = bundle.getString("nilai");
        tvNama.setText(sNama);
        tvNim.setText(sNim);
        tvNilai.setText(sNilai);
    }
}
