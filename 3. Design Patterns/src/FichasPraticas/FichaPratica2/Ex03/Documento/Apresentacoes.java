package FichasPraticas.FichaPratica2.Ex03.Documento;

public class Apresentacoes extends Documento{

    public Apresentacoes(String autor, String nome, String extencao) {
        super(autor, nome, extencao);
    }

    @Override
    public void open() {
        super.open();
        System.out.print("Apresentacao: " + getNome() + "." + getExtencao() + "\n");
    }

    @Override
    public void close() {
        super.close();
        System.out.print("Apresentacao.\n");
    }
}
