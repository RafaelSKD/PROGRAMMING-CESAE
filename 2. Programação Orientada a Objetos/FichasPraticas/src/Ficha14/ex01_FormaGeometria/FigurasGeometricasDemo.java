package Ficha14.ex01_FormaGeometria;

import Ficha14.ex01_FormaGeometria.Objetos.Circulo;
import Ficha14.ex01_FormaGeometria.Objetos.Retangulo;
import Ficha14.ex01_FormaGeometria.Objetos.Triangulo;

public class FigurasGeometricasDemo {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("azul", 10, 5);
        Circulo circulo = new Circulo("vermelho", 15);
        Triangulo triangulo = new Triangulo("roxo", 10, 5);

        retangulo.mostrarCor();
        circulo.mostrarCor();
        triangulo.mostrarCor();

        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Área do triângulo: " + triangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
        System.out.println("Perímetro do triângulo: " + triangulo.calcularPerimetro());
    }
}
