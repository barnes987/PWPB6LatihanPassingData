package com.example.pwpb_tugas_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {
    public static String nama_anda, alamat_anda, pesanan_anda;
    public TextView txtnama, txtalamat, txtpesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        txtnama = (TextView) findViewById(R.id.submit_nama);
        String nama_anda = getIntent().getStringExtra("nama");
        txtnama.setText(nama_anda);

        txtalamat = (TextView) findViewById(R.id.submit_alamat);
        String alamat_anda = getIntent().getStringExtra("alamat");
        txtalamat.setText(alamat_anda);

        txtpesanan = (TextView) findViewById(R.id.submit_pesanan);
        String pesanan_anda = getIntent().getStringExtra("pesanan");
        txtpesanan.setText(pesanan_anda);

        Button cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubmitActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
