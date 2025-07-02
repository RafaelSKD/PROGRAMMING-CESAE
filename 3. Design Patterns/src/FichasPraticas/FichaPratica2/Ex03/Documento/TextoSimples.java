package FichasPraticas.FichaPratica2.Ex03.Documento;

public class TextoSimples extends Documento{
    public TextoSimples(String autor, String nome, String extencao) {
        super(autor, nome, extencao);
    }

    @Override
    public void open() {
        super.open();
        System.out.print("Texto Simples: " + getNome() + "." + getExtencao() + "\n");
    }

    @Override
    public void close() {
        super.close();
        System.out.print("Texto Simples.\n");
    }
}
