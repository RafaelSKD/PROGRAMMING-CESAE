package ex01;

public class main {
    public static void main(String[] args) {
        Pessoa rafael = new Pessoa("Rafael", 28, 1.85);
        Pessoa sofia = new Pessoa("Sofia", 28, 1.50);
        System.out.println("Nome: " + rafael.getNome());
        System.out.println("Idade: " + rafael.getAge());
        System.out.println("Altura: " + rafael.getheight());
        System.out.println();
        System.out.println("Nome: " + sofia.getNome());
        System.out.println("Idade: " + sofia.getAge());
        System.out.println("Altura: " + sofia.getheight());
    }
}
