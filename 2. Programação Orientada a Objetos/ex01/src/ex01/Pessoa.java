package ex01;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome_temp, int idade_temp, Double altura_temp) {
        this.nome = nome_temp;
        this.idade = idade_temp;
        this.altura = altura_temp;
    }

    public String getNome(){
        return this.nome;
    }
    public int getAge(){
        return this.idade;
    }
    public double getheight(){
        return this.altura;
    }
}