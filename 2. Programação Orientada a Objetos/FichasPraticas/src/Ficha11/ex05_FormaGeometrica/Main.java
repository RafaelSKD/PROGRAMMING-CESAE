package Ficha11.ex05_FormaGeometrica;

import Ficha11.ex05_FormaGeometrica.Objetos.Circulo;
import Ficha11.ex05_FormaGeometrica.Objetos.FormaGeometrica;
import Ficha11.ex05_FormaGeometrica.Objetos.Retangulo;
import Ficha11.ex05_FormaGeometrica.Objetos.Triangulo;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(10, 5);
        Triangulo triangulo = new Triangulo(10, 5);
        FormaGeometrica formaGeometrica = new FormaGeometrica();

        circulo.calcularArea();
        retangulo.calcularArea();
        triangulo.calcularArea();
        formaGeometrica.calcularArea();
    }
}
