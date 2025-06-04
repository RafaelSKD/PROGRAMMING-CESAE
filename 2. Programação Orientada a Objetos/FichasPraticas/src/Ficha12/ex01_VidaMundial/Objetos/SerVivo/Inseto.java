package Ficha12.ex01_VidaMundial.Objetos.SerVivo;

public class Inseto extends SerVivo{
    private boolean Venenoso; // se e venenoso

    public Inseto(String nome, String especie, String pais, int idade, boolean venenoso) {
        super(nome, especie, pais, idade);
        Venenoso = venenoso;
    }

    public boolean isVenenoso() {
        return Venenoso;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Venenoso: " + (Venenoso ? "Sim" : "Não"));
    }
}
