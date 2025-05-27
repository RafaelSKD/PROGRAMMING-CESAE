package ex08;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto("cadeira", 25.99);
        Produto produto2 = new Produto("lapis", 1.00);
        Produto produto3 = new Produto("computador", 1599.99);

        produto1.adquirirStock(50);
        produto2.adquirirStock(300);
        produto3.adquirirStock(1);

        produto2.venderProduto(200);

        produto3.venderProduto(2);

        produto3.setPreco(1299.99);

        produto3.venderProduto(1);

        System.out.println("stock " + produto1.getNome() + " - " + produto1.getStock());
        System.out.println("stock " + produto2.getNome() + " - " + produto2.getStock());
        System.out.println("stock " + produto3.getNome() + " - " + produto3.getStock());
    }
}
