package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrimeiraPagina extends AppCompatActivity {

    private Button btn_anterior, btn_proxima, btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_proxima = findViewById(R.id.btn_proxima);
        btn_menu = findViewById(R.id.btn_menu);


        // Botão Próxima
        btn_proxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrimeiraPagina.this, SegundaPagina.class));
                finish();
            }
        });

        // Botão Menu
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrimeiraPagina.this, MenuActivity.class));
                finish();
            }
        });
    }
}