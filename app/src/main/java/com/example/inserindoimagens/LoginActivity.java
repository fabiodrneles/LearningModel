package com.example.inserindoimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText user, senha;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final LoadingDialog loadingDialog = new LoadingDialog(LoginActivity.this);

        user = (EditText) findViewById(R.id.user);
        senha = (EditText) findViewById(R.id.senha);
        btn = (Button) findViewById(R.id.btn);

    }

    // Uma das varias opções
    public void clicaBotao(View view){
        /*startActivity(new Intent(MainActivity.this, Segunda.class));*/
        if(user.getText().toString().equals("admin") && senha.getText().toString().equals("123"))
            startActivity(new Intent(LoginActivity.this, MenuActivity.class));
        else
            Toast.makeText(this, "Usuário ou senha Inválidos", Toast.LENGTH_SHORT).show();
    }
}