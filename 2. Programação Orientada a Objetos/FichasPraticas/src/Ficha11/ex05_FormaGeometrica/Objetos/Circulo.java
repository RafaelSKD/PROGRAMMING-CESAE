package Ficha11.ex05_FormaGeometrica.Objetos;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * this.raio * this.raio;
        System.out.println("A area do Circulo e de: " + area);
    }
}
