package ex02;

public class Main {
    public static void main(String[] args) {
        Edificio elCorteIngles = new Edificio("El Corte Ingles", "rua dos quintos, 666", "verde", 6, true);

        System.out.println("nome = " + elCorteIngles.getNome());
        System.out.println("rua = " + elCorteIngles.getRua());
        System.out.println("cor = " + elCorteIngles.getCor());
        System.out.println("andares = " + elCorteIngles.getAndares());
        System.out.println("Tem garagem? = " + elCorteIngles.getGaragem());

        elCorteIngles.setCor("Rosa");

        System.out.println();

        System.out.println("nome = " + elCorteIngles.getNome());
        System.out.println("rua = " + elCorteIngles.getRua());
        System.out.println("cor = " + elCorteIngles.getCor());
        System.out.println("andares = " + elCorteIngles.getAndares());
        System.out.println("Tem garagem? = " + elCorteIngles.getGaragem());
    }
}
