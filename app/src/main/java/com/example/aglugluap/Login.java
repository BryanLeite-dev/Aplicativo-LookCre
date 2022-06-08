package com.example.aglugluap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

public class Login extends AppCompatActivity {

    TabLayout tabLayout;
    Button login;
    TextView esqueci;
    EditText user, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tabLayout = findViewById(R.id.tab_layout);

        tabLayout.addTab(tabLayout.newTab().setText("Login"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        login = findViewById(R.id.login2);
        esqueci = findViewById(R.id.esqueci);
        user = findViewById(R.id.login);
        senha = findViewById(R.id.senha);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(user.getText().toString().equals("admin")&&senha.getText().toString().equals("admin")) {
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    MensagemError();
                }
            }
        });

        esqueci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Mensagem();
            }
        });
    }

    private void Mensagem(){
        Toast.makeText(this, "Login e Senha mais fáceis no mundo da programação!", Toast.LENGTH_LONG).show();
    }

    private void MensagemError(){
        Toast.makeText(this, "Dados Inválidos!", Toast.LENGTH_SHORT).show();
    }

}