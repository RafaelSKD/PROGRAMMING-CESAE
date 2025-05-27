package ex03;

public class Retangulo {
    private String cor;
    private double altura;
    private double comprimento;

    public Retangulo(String cor, Double altura, Double comprimento) {
        this.cor = cor;
        this.altura = altura;
        this.comprimento = comprimento;
    }

    public String getcor(){

        return this.cor;
    }
    public Double getAltura(){

        return this.altura;
    }
    public Double getComprimento(){

        return this.comprimento;
    }
}
