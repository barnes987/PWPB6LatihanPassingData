package com.example.pwpb_tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public ImageButton btn_gofood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_gofood = (ImageButton) findViewById(R.id.gofood);
        btn_gofood.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent gofood_intent = new Intent(MainActivity.this, GoFoodActivity.class);
        startActivity(gofood_intent);

    }
}
