package com.example.aglugluap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Inicial extends AppCompatActivity {
    Button buttonContinue;
    ImageView look;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_inicial);

        buttonContinue = findViewById(R.id.buttonContinue);
        look = findViewById(R.id.look);

        buttonContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Inicial.this, Login.class);
                startActivity(intent);
            }
        });

        look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://pt.wikihow.com/Desenvolver-seu-Senso-de-Estilo"));
                startActivity(intent);
            }
        });


    }
}