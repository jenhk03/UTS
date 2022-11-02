package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity
{
    TextView tvNumber, tvName, tvJP;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        getSupportActionBar().setTitle("Konfirmasi Pendaftaran");
        tvNumber = findViewById(R.id.tv_number);
        tvName = findViewById(R.id.tv_name);
        tvJP = findViewById(R.id.tv_jp);
        Intent accept = getIntent();
        String yNumber = accept.getStringExtra("xNumber");
        String yName = accept.getStringExtra("xName");
        String yJalur = accept.getStringExtra("xJalur");
        tvNumber.setText(yNumber);
        tvName.setText(yName);
        tvJP.setText(yJalur);
    }
}