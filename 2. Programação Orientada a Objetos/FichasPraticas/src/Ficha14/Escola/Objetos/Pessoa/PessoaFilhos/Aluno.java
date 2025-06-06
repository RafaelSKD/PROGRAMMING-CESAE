package Ficha14.Escola.Objetos.Pessoa.PessoaFilhos;

import Ficha14.Escola.Enum.Curso;
import Objetos.Pessoa;

public class Aluno extends Pessoa {
    private Curso curso;
    private double mediaNotas;
    private String[][] pauta;

    public Aluno(String nome, int idade, String cidade, String email, String telefone, Curso curso, double mediaNotas, String[][] pauta) {
        super(nome, idade, cidade, email, telefone);
        this.curso = curso;
        this.mediaNotas = mediaNotas;
        this.pauta = pauta;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public double getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(double mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public String[][] getPauta() {
        return pauta;
    }

    public void setPauta(String[][] pauta) {
        this.pauta = pauta;
    }
}
