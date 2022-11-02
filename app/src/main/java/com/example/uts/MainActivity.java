package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button btnApply;
    EditText etName, etNumber, etJalur;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Formulir Pendaftaran");
        btnApply = findViewById(R.id.btn_apply);
        etName = findViewById(R.id.et_name);
        etNumber = findViewById(R.id.et_number);
        etJalur = findViewById(R.id.et_jalur);
        btnApply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String number = etNumber.getText().toString();
                String name = etName.getText().toString();
                String jalur = etJalur.getText().toString();
                if (number.trim().equals("") || name.trim().equals("") || jalur.trim().equals(""))
                {
                    Toast.makeText(MainActivity.this, "Semua wajib diisi!!!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent move = new Intent(MainActivity.this, SecondaryActivity.class);
                    move.putExtra("xNumber", number);
                    move.putExtra("xName", name);
                    move.putExtra("xJalur", jalur);
                    startActivity(move);
                }
            }
        });
    }
}