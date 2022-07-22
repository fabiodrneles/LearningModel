package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaPagina extends AppCompatActivity {
    private Button btn_anterior2, btn_proxima2,btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pagina);

        btn_anterior2 = findViewById(R.id.btn_anterior2);
        btn_proxima2 = findViewById(R.id.btn_proxima2);
        btn_menu = findViewById(R.id.btn_menu);


        // Botão anterior
        btn_anterior2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaPagina.this, PrimeiraPagina.class));
                finish();
            }
        });

        // Botão próxima
        btn_proxima2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaPagina.this, TerceiraPagina.class));
                finish();
            }
        });

        // Botão Menu
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SegundaPagina.this, MenuActivity.class));
                finish();
            }
        });
    }
}