package com.example.sarpras4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RuanganActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruangan);

        Button btnRuangan1 = findViewById(R.id.btnruangan1);

        btnRuangan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RuanganActivity.this, Ruangan1Activity.class);
                startActivity(intent);
            }
        });
    }
}