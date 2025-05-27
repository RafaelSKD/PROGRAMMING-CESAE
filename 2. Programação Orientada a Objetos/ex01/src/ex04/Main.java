package ex04;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo("verde", 5);
        Circulo circulo1 = new Circulo("azul", 10);

        double area = circulo.areaCirculo();
        double perimetro = circulo.perimetroCirculo();

        if (perimetro < circulo1.perimetroCirculo())
            perimetro = circulo1.perimetroCirculo();
        if (area < circulo1.areaCirculo())
            area = circulo1.areaCirculo();

        System.out.println("O perimetro do maior circulo e de :" + perimetro +
        "\n A area do maior circulo e de :" + area);
    }
}
