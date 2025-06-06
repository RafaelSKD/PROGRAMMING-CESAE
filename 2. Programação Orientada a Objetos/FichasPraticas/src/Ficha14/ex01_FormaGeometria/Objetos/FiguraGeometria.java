package Ficha14.ex01_FormaGeometria.Objetos;

abstract class FiguraGeometria {
    private String cor;

    public FiguraGeometria(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void mostrarCor(){
        System.out.println("A forma geometria e " + this.getCor());
    }

    abstract double calcularArea();
    abstract double calcularPerimetro();

}
