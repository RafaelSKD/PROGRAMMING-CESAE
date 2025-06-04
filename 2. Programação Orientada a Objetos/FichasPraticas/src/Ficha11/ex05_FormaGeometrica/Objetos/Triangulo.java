package Ficha11.ex05_FormaGeometrica.Objetos;

public class Triangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public Triangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularArea() {
        double area = (this.altura * this.largura) / 2;
        System.out.println("A area do Triangulo e de: " + area);
    }
}
