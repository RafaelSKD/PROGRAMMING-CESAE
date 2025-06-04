package Ficha11.ex01_AirplaneStore.Objetos;

public class Aviao {
    private int numeroDeSerie;
    private  String modelo;
    private  int anoDeFabrico;
    private double peso; // kg
    private double comprimentoDaFuselagem; //m
    private double envergaduraDasAsas; //m
    private double alturaDaCauda; //m
    private int numerodeMotores;
    private int autonomia; //kms
    private int velocidadeMaxima; //km/h
    private double preco; //em euros

    public Aviao(int numeroDeSerie, String modelo, int anoDeFabrico, double peso, double comprimentoDaFuselagem, double envergaduraDasAsas, double alturaDaCauda, int numerodeMotores, int autonomia, int velocidadeMaxima, double preco) {
        this.numeroDeSerie = numeroDeSerie;
        this.modelo = modelo;
        this.anoDeFabrico = anoDeFabrico;
        this.peso = peso;
        this.comprimentoDaFuselagem = comprimentoDaFuselagem;
        this.envergaduraDasAsas = envergaduraDasAsas;
        this.alturaDaCauda = alturaDaCauda;
        this.numerodeMotores = numerodeMotores;
        this.autonomia = autonomia;
        this.velocidadeMaxima = velocidadeMaxima;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public int getAnoDeFabrico() {
        return anoDeFabrico;
    }

    public double getPeso() {
        return peso;
    }

    public double getComprimentoDaFuselagem() {
        return comprimentoDaFuselagem;
    }

    public double getEnvergaduraDasAsas() {
        return envergaduraDasAsas;
    }

    public double getAlturaDaCauda() {
        return alturaDaCauda;
    }

    public int getNumerodeMotores() {
        return numerodeMotores;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println(
                "\n  Número de Série: " + this.numeroDeSerie +
                "\n  Modelo: " + this.modelo +
                "\n  Ano de Fabrico: " + this.anoDeFabrico +
                "\n  Peso: " + this.peso + " kg" +
                "\n  Comprimento da Fuselagem: " + this.comprimentoDaFuselagem + " m" +
                "\n  Envergadura das Asas: " + this.envergaduraDasAsas + " m" +
                "\n  Altura da Cauda: " + this.alturaDaCauda + " m" +
                "\n  Número de Motores: " + this.numerodeMotores +
                "\n  Autonomia: " + this.autonomia + " km" +
                "\n  Velocidade Máxima: " + this.velocidadeMaxima + " km/h" +
                "\n  Preço: €" + this.preco
                );
    }
}
