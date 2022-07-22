package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class TerceiraPagina extends AppCompatActivity {
    private Button btn_anterior3, btn_proxima3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira_pagina);

        btn_anterior3 = findViewById(R.id.btn_anterior3);
        btn_proxima3 = findViewById(R.id.btn_menu);

        // Botão anterior
        btn_anterior3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TerceiraPagina.this, SegundaPagina.class));
                finish();
            }
        });


        // Botão Menu
        btn_proxima3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TerceiraPagina.this, MenuActivity.class));
                finish();
            }
        });
    }
}