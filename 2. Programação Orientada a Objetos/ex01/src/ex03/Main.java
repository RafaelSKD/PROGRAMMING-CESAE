package ex03;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("verde", 5., 10.);

        System.out.println("perimetro = " + ((retangulo.getComprimento() * 2) + (retangulo.getAltura() * 2)) + "\narea = " + (retangulo.getComprimento()) * (retangulo.getAltura()) );
    }
}
