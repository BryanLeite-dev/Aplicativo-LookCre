package com.example.aglugluap;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Roupa1 extends AppCompatActivity {

    ImageView imagem1, imagem2, imagem3, imagem4;
    Button salvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roupa1);

        imagem1 = findViewById(R.id.ivAcessorio1);
        imagem2 = findViewById(R.id.ivAcessorio2);
        imagem3 = findViewById(R.id.ivAcessorio3);
        imagem4 = findViewById(R.id.ivAcessorio);

        salvar = findViewById(R.id.btSalvar);

        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto1();

            }
        });

        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto2();

            }
        });

        imagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto3();

            }
        });

        imagem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPhoto4();

            }
        });

        salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Salvar();
            }
        });
    }

        private void selectPhoto1(){

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 0);

        }

    private void selectPhoto2(){

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 1);

    }
    private void selectPhoto3(){

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 2);

    }
    private void selectPhoto4(){

        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, 3);

    }

    private void Salvar(){
        Toast.makeText(this, "Função válida para a próxima versão!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case 0: {
                imagem1.setImageURI(data.getData());
                break;
            }
            case 1: {
                imagem2.setImageURI(data.getData());
                break;
            }
            case 2: {
                imagem3.setImageURI(data.getData());
                break;
            }
            case 3: {
                imagem4.setImageURI(data.getData());
                break;
            }
            default:{
                Toast.makeText(this, "Algo deu errado!", Toast.LENGTH_SHORT).show();
                break;
            }
            }
    }
}