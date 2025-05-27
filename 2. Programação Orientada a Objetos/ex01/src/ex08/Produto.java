package ex08;

public class Produto {
    private String nome;
    private double preco;
    private int stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getStock() {
        return stock;
    }

    public void adquirirStock(int quantidade){
        System.out.println("Stock actualizado\n\nAntes: " + this.stock);
        this.stock += quantidade;
        System.out.println("Depois: " + this.stock);
    }

    public void venderProduto(int quantidade){
        if (quantidade > this.stock)
            System.out.println("Stock insuficiente");
        if (quantidade <= this.stock){
            System.out.println("Venda Efetuada!");
            this.stock -= quantidade;
        }
    }

}
