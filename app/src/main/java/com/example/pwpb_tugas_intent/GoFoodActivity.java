package com.example.pwpb_tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GoFoodActivity extends AppCompatActivity implements View.OnClickListener {
    public Button konfirmasi;
    public EditText nama, alamat, pesanan;
    String testa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitygofood);
        nama = findViewById(R.id.Nama);
        alamat = findViewById(R.id.Alamat);
        pesanan = findViewById(R.id.Pesanan);

        konfirmasi = (Button) findViewById(R.id.konfirmasi);
        konfirmasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent njay = new Intent(GoFoodActivity.this, SubmitActivity.class);
        testa = nama.getText().toString();
        String testa2 = alamat.getText().toString();
        String testa3 = pesanan.getText().toString();

        njay.putExtra("nama", testa );
        njay.putExtra("alamat", testa2);
        njay.putExtra("pesanan", testa3);

        startActivity(njay);
    }
}
