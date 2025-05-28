package Objetos;

// The Produto class represents a product with attributes for name, price, and stock level.
// It includes functionality to update the price, manage stock acquisition and perform sales.

public class Produto {
    private String nome;       // Product name
    private double preco;      // Product price
    private int stock = 0;     // Quantity in stock (default is 0)

    // Constructor to initialize the product with a name and price
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Setter to update the product's price
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Getter for product name
    public String getNome() {
        return nome;
    }

    // Getter for product price
    public double getPreco() {
        return preco;
    }

    // Getter for stock quantity
    public int getStock() {
        return stock;
    }

    // Adds stock to the current quantity
    public void adquirirStock(int quantidade) {
        System.out.println("Stock actualizado\n\nAntes: " + this.stock);
        this.stock += quantidade;
        System.out.println("Depois: " + this.stock);
    }

    // Sells a quantity of the product if there is enough stock
    public void venderProduto(int quantidade) {
        if (quantidade > this.stock)
            System.out.println("Stock insuficiente");
        if (quantidade <= this.stock) {
            System.out.println("Venda Efetuada!");
            this.stock -= quantidade;
        }
    }
}
