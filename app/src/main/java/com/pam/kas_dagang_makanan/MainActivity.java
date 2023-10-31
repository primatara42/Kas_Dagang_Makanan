package com.pam.kas_dagang_makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lProduk, lPenjualan, lPengeluaran, lStok;
        lProduk = findViewById(R.id.card_produk);
        lPenjualan = findViewById(R.id.card_penjualan);
        lPengeluaran = findViewById(R.id.card_pengeluaran);
        lStok = findViewById(R.id.card_stok);

        lProduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LihatProdukActivity.class));
            }
        });

        lPenjualan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LihatPenjualanActivity.class));
            }
        });

        lPengeluaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LihatPengeluaranActivity.class));
            }
        });

        lStok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LihatStokActivity.class));
            }
        });


    }


}