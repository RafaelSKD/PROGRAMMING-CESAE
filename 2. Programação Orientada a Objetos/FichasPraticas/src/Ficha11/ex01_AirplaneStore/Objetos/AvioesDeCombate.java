package Ficha11.ex01_AirplaneStore.Objetos;

public class AvioesDeCombate extends Aviao{
    private String paisDeOrigem;
    private boolean camuflagem;
    private String[] armas = new String[3];

    public AvioesDeCombate(int numeroDeSerie, String modelo, int anoDeFabrico, double peso, double comprimentoDaFuselagem,
                           double envergaduraDasAsas, double alturaDaCauda, int numerodeMotores, int autonomia,
                           int velocidadeMaxima, double preco, String paisDeOrigem, boolean camuflagem, String[] armas) {
        super(numeroDeSerie, modelo, anoDeFabrico, peso, comprimentoDaFuselagem, envergaduraDasAsas, alturaDaCauda, numerodeMotores, autonomia, velocidadeMaxima, preco);
        this.paisDeOrigem = paisDeOrigem;
        this.camuflagem = camuflagem;
        this.armas = armas;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public boolean isCamuflagem() {
        return camuflagem;
    }

    public String[] getArmas() {
        return armas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println(
                "  País de Origem: " + this.paisDeOrigem +
                "\n  Camuflagem: " + (this.camuflagem ? "Sim" : "Não") +
                "\n  Armas: " + String.join(", ", this.armas)
                );
    }
}
