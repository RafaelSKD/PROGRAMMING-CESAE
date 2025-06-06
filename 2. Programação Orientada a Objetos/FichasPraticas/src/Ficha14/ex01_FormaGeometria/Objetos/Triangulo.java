package Ficha14.ex01_FormaGeometria.Objetos;

public class Triangulo extends FiguraGeometria{

    private double base;
    private double altura;

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura / 2;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt((altura * altura) + ((base / 2) * (base / 2)));
        return base + (hipotenusa * 2);
    }
}
