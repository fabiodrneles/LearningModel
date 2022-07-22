package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Section2Primeira extends AppCompatActivity {
    private Button btn_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section2_primeira);

        btn_menu = findViewById(R.id.btn_menu);

        // Botão Menu
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Section2Primeira.this, MenuActivity.class));
                finish();
            }
        });
    }
}