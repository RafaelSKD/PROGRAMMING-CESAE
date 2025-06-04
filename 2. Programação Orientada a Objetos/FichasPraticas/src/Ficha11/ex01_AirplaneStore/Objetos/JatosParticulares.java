package Ficha11.ex01_AirplaneStore.Objetos;

import Ficha11.ex01_AirplaneStore.Enum.Categoria;

public class JatosParticulares extends Aviao {
    private int lotacao;
    private int capacidadedeBagagem; //cm3
    private Categoria categoria; // tipo de aviao
    private String[] instalacoes;

    public JatosParticulares(int numeroDeSerie, String modelo, int anoDeFabrico, double peso, double comprimentoDaFuselagem,
                             double envergaduraDasAsas, double alturaDaCauda, int numerodeMotores, int autonomia,
                             int velocidadeMaxima, double preco, int lotacao, int capacidadedeBagagem, Categoria categoria, String[] instalacoes) {
        super(numeroDeSerie, modelo, anoDeFabrico, peso, comprimentoDaFuselagem, envergaduraDasAsas, alturaDaCauda, numerodeMotores, autonomia, velocidadeMaxima, preco);
        this.lotacao = lotacao;
        this.capacidadedeBagagem = capacidadedeBagagem;
        this.categoria = categoria;
        this.instalacoes = instalacoes;
    }

    public int getLotacao() {
        return lotacao;
    }

    public int getCapacidadedeBagagem() {
        return capacidadedeBagagem;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String[] getInstalacoes() {
        return instalacoes;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(
                "  Lotação: " + this.lotacao +
                "\n  Capacidade de Bagagem: " + this.capacidadedeBagagem + " cm³" +
                "\n  Categoria: " + this.categoria +
                "\n  Instalações: " + String.join(", ", this.instalacoes) +
                "\n"
        );
    }
}
