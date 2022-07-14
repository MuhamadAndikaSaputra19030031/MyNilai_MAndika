package com.example.mynilai_mandika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class inputmahasiswa extends AppCompatActivity {
    Button Submit;
    EditText nim,nama,kehadiran, tugas, uts, uas;
    String nimA,namaB,kehadiranA,tugasA,utsA,uasA;
    String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputmahasiswa);

        Submit = (Button) findViewById(R.id.Submit);
        nim      = (EditText) findViewById(R.id.nim);
        nama     = (EditText) findViewById(R.id.nama);

        TextView txtmatakuliah = findViewById(R.id.matakuliah);
        String namaA = getIntent().getStringExtra("matakuliah");
        txtmatakuliah.setText(namaA);


        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nimA= nim.getText().toString();
                namaB = nama.getText().toString();
                TextView mataKuliah = findViewById(R.id.matakuliah);

                String Matakuliah = mataKuliah.getText().toString();
                Log.d(TAG, Matakuliah);

                Intent i = new Intent(inputmahasiswa.this,inputnilai.class);
                i.putExtra("nim",nimA);
                i.putExtra("nama",namaB);
                i.putExtra("matakuliah", Matakuliah);


                startActivity(i);
            }
        });
    }
}