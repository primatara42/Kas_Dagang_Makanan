package com.pam.kas_dagang_makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FirebaseAuth auth;
//        FirebaseUser user;
//        auth = FirebaseAuth.getInstance();
//        user = auth.getCurrentUser();

        TextView tvUsername;
        LinearLayout lProduk, lPenjualan, lPengeluaran, lStok;

        tvUsername = findViewById(R.id.tv_username);
        lProduk = findViewById(R.id.card_produk);
        lPenjualan = findViewById(R.id.card_penjualan);
        lPengeluaran = findViewById(R.id.card_pengeluaran);
        lStok = findViewById(R.id.card_stok);

//        if(user == null){
//            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//            startActivity(intent);
//            finish();
//        }
//
//        else{
//            tvUsername.setText(user.getEmail());
//        }




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