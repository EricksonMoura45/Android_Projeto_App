package com.example.cadastro_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class EscolhaActivity extends AppCompatActivity {

    Button btnConsultar;
    Button btnCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha);

        btnCadastrar.findViewById(R.id.button_cadastro);
        btnConsultar.findViewById(R.id.button_consultar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openCadastroActivity();
            }
        });

        btnConsultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openExibeActivity();
            }
        });
    }
    public void openCadastroActivity(){
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
    public void openExibeActivity(){
        Intent intent = new Intent(this, ExibeActivity.class);
        startActivity(intent);
    }


}
