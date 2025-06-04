package Ficha11.ex05_FormaGeometrica.Objetos;

public class Retangulo extends FormaGeometrica{
    private double largura;
    private double comprimento;

    public Retangulo(double largura, double comprimento) {
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public void calcularArea() {
        double area = this.comprimento * this.largura;
        System.out.println("A area do Retangulo e de: " + area);
    }
}
