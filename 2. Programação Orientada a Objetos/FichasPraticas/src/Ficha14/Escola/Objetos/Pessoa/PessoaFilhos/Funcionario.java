package Ficha14.Escola.Objetos.Pessoa.PessoaFilhos;

import Objetos.Pessoa;

public class Funcionario extends Pessoa {
    private String funcao;

    public Funcionario(String nome, int idade, String cidade, String email, String telefone, String funcao) {
        super(nome, idade, cidade, email, telefone);
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
