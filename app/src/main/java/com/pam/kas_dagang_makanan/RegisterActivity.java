package com.pam.kas_dagang_makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    EditText etUsername, etPassword;
    TextView tvPindahLogin;
    Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        daftar();
        tvPindahLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
            }
        });

    }

    private void daftar(){
        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        tvPindahLogin = findViewById(R.id.tv_pindahLogin);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if(TextUtils.isEmpty(username)){
                    etUsername.setError("Silahkan isi username anda!");
                }
                else if(TextUtils.isEmpty(password)){
                    etPassword.setError("Silahkan isi password anda!");
                }
            }
        });
    }
}