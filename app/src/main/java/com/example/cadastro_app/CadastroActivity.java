package com.example.cadastro_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    Button btnCadastrar;
    EditText nome, endereco, email, dataNascimento, telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome.findViewById(R.id.txtName);
        endereco.findViewById(R.id.txtEndereco);
        email.findViewById(R.id.txtEmail);
        dataNascimento.findViewById(R.id.txtDate);
        telefone.findViewById(R.id.txtPhone);
        btnCadastrar.findViewById(R.id.btnCadastroFinal);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //condições para cadastro: preencher todos os campos
                if (nome.getText().toString().isEmpty() || endereco.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() || dataNascimento.getText().toString().isEmpty()
                        || telefone.getText().toString().isEmpty()) {
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos para continuar", Toast.LENGTH_LONG).show();
                }
                //else: salvar tudo no objeto
                else {
                    GerenciaCadastro novoCadastro = new GerenciaCadastro(nome.getText().toString(),endereco.getText().toString(),
                            email.getText().toString(),dataNascimento.getText().toString(),telefone.getText().toString());

                    Toast.makeText(getApplicationContext(), "Cadastro Realizado!", Toast.LENGTH_SHORT).show();

                }

            }
        });
    }
}


//mostrar toast após cadastro
