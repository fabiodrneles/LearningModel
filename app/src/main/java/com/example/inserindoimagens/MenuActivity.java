package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    private Button btn_cv, btn_sair, btn_section2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btn_cv = findViewById(R.id.btn_section1);
        btn_section2 = findViewById(R.id.btn_section2);
        btn_sair = findViewById(R.id.btn_sair);

        // Botão ir para Área de dicas para Curriculo.
        btn_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent( MenuActivity.this, PrimeiraPagina.class));
                finish();
            }
        });

        // TODO construir os botões que dão acesso ao conteúdo.

        // Botão section2
        btn_section2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, Section2Primeira.class));
                finish();
            }
        });


        // Botão sair
        btn_sair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuActivity.this, LoginActivity.class));
                finish();
            }
        });


    }
}