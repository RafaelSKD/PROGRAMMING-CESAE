package FichasPraticas.FichaPratica2.Ex03.Documento;

public class FolhasDeCalculo extends Documento{
    public FolhasDeCalculo(String autor, String nome, String extencao) {
        super(autor, nome, extencao);
    }
    @Override
    public void open() {
        super.open();
        System.out.print("Folha de Calculo: " + getNome() + "." + getExtencao() + "\n");
    }

    @Override
    public void close() {
        super.close();
        System.out.print("Folha de Calculo.\n");
    }
}
