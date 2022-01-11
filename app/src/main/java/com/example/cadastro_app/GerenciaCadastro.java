package com.example.cadastro_app;

import fragments.DetalhesFragment;
import fragments.ListaMenuFragment;

public class GerenciaCadastro{

    /* Classe responsável por receber dados do cadastro */

    String nome;
    String endereco;
    String email;
    String DataNascimento;
    String Telefone;


    public GerenciaCadastro(String nomeC, String enderecoC, String emailC, String DataNascimentoC, String TelefoneC) {
        nome = nomeC;
        endereco = enderecoC;
        email = emailC;
        DataNascimento = DataNascimentoC;
        Telefone = TelefoneC;
    }


}
