package com.example.tugas3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    TextView tvName, tvDetail;
    ImageView ivPhoto, ivBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvName = findViewById(R.id.tv_name);
        tvDetail = findViewById(R.id.tv_detail);
        ivPhoto = findViewById(R.id.iv_photo);

        tvName.setText(getIntent().getStringExtra("name"));
        tvDetail.setText(getIntent().getStringExtra("detail"));

        Glide.with(getApplicationContext())
                .load(getIntent().getStringExtra("photo"))
                .into(ivPhoto);
    }
}

