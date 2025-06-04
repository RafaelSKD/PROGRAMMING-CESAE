package Ficha8;

import Objetos.Produto;

// The ex08 class demonstrates the use of the Produto class.
// It creates several products, manages their stock, performs sales, updates price, and prints remaining stock.

public class ex08 {
    public static void main(String[] args) {
        // Create three products with name and price
        Produto produto1 = new Produto("cadeira", 25.99);
        Produto produto2 = new Produto("lapis", 1.00);
        Produto produto3 = new Produto("computador", 1599.99);

        // Acquire stock for each product
        produto1.adquirirStock(50);
        produto2.adquirirStock(300);
        produto3.adquirirStock(1);

        // Attempt to sell 200 units of 'lapis'
        produto2.venderProduto(200);

        // Attempt to sell 2 units of 'computador' (should fail due to insufficient stock)
        produto3.venderProduto(2);

        // Update the price of 'computador'
        produto3.setPreco(1299.99);

        // Sell 1 unit of 'computador' (should succeed now)
        produto3.venderProduto(1);

        // Display remaining stock for all products
        System.out.println("stock " + produto1.getNome() + " - " + produto1.getStock());
        System.out.println("stock " + produto2.getNome() + " - " + produto2.getStock());
        System.out.println("stock " + produto3.getNome() + " - " + produto3.getStock());
    }
}
