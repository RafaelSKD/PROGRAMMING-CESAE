package Ficha14.Escola.Objetos.Pessoa.PessoaSuper;

abstract class Pessoa {
    private String nome;
    private int anoNascimento;
    private String email;
    private String telemovel;

    public Pessoa(String nome, int anoNascimento, String email, String telemovel) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    abstract void obterFuncao();

    public void exibirDetalhes(){
        System.out.println("\n\nNome: " + nome);
        System.out.println("Ano de Nascimento: " + anoNascimento);
        System.out.println("Email: " + email);
        System.out.println("Telemóvel: " + telemovel);
    }

    abstract void imprimirHorario();
}
