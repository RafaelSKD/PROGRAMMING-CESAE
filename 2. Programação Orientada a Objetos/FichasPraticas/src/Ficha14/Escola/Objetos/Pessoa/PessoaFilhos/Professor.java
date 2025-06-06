package Ficha14.Escola.Objetos.Pessoa.PessoaFilhos;

import Ficha14.Escola.Enum.AreaFormacao;
import Objetos.Pessoa;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private  ArrayList<AreaFormacao> areaFormacao;
    private int nivelAcademico;

    public Professor(String nome, int idade, String cidade, String email, String telefone, ArrayList<AreaFormacao> areaFormacao, int nivelAcademico) {
        super(nome, idade, cidade, email, telefone);
        this.areaFormacao = areaFormacao;
        this.nivelAcademico = nivelAcademico;
    }

    public ArrayList<AreaFormacao> getAreaFormacao() {
        return areaFormacao;
    }

    public void setAreaFormacao(ArrayList<AreaFormacao> areaFormacao) {
        this.areaFormacao = areaFormacao;
    }

    public int getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(int nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
}
