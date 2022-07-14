package com.example.mynilai_mandika;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class inputnilai extends AppCompatActivity {
    Button Hitung;
    EditText absen,latihan,latihan1,latihan2;
    String absenA,latihanA,latihan1A,latihan2A;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inputnilai);
        Hitung = (Button) findViewById(R.id.Hitung);
        absen        = (EditText) findViewById(R.id.absen);
        latihan      = (EditText) findViewById(R.id.latihan);
        latihan1     = (EditText) findViewById(R.id.latihan2);
        latihan2     = (EditText) findViewById(R.id.latihan3);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                absenA = absen.getText().toString();
                latihanA = latihan.getText().toString();
                latihan1A = latihan1.getText().toString();
                latihan2A = latihan2.getText().toString();


                Intent i = new Intent(inputnilai.this, nilaimahasiswa.class);
                i.putExtra("nim", absenA);
                i.putExtra("nama", latihanA);
                i.putExtra("nama", latihan1A);
                i.putExtra("nama", latihan2A);
                startActivity(i);
            }
        });
    }
}