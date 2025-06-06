package Ficha14.ex01_FormaGeometria.Objetos;

public class Retangulo extends FiguraGeometria{

    private double largura;
    private double comprimento;

    public Retangulo(String cor, double largura, double comprimento) {
        super(cor);
        this.largura = largura;
        this.comprimento = comprimento;
    }

    @Override
    public double calcularArea() {
        return largura * comprimento;
    }

    @Override
    public double calcularPerimetro() {
        return (largura * 2) + (comprimento * 2);
    }
}
