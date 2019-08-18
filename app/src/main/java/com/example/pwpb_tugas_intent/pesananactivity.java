package com.example.pwpb_tugas_intent;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class pesananactivity extends AppCompatActivity implements View.OnClickListener {
    waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesanan);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(pesananactivity.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, waktu_loading);
    }

    @Override
    public void onClick(View view) {

    }
}
