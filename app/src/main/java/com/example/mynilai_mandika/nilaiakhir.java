package com.example.mynilai_mandika;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class nilaiakhir extends AppCompatActivity {
    TextView tv_nama,tv_nim;
    String namaB,nimA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nilaiakhir);

        TextView mataKuliah = findViewById(R.id.matakuliah);
        tv_nim = (TextView) findViewById(R.id.tv_nim);
        tv_nama = (TextView) findViewById(R.id.tv_nama);

        if(getIntent().getStringExtra("nim") != null){
            nimA = getIntent().getStringExtra("nim");
            tv_nim.setText("NIM : " + "" + nimA);
        }
        if(getIntent().getStringExtra("nama") != null){
            namaB = getIntent().getStringExtra("nama");
            tv_nama.setText("NAMA : " + "" + namaB);


        }
    }
}