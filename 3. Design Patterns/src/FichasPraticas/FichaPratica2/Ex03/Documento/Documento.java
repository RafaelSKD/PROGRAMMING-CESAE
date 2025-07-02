package FichasPraticas.FichaPratica2.Ex03.Documento;

public class Documento {
    private String autor;
    private String nome;
    private String extencao;

    public Documento(String autor, String nome, String extencao) {
        this.autor = autor;
        this.nome = nome;
        this.extencao = extencao;
    }

    public void open(){
        System.out.print("A abrir o documento de ");
    }

    public void save(){
        System.out.print("Alteracoes do " + getAutor() + " gravadas\n");
    }

    public void close(){
        System.out.print("A fechar o documento de ");
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getExtencao() {
        return extencao;
    }
}
