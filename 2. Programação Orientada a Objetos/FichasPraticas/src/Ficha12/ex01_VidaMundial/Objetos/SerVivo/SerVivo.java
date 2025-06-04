package Ficha12.ex01_VidaMundial.Objetos.SerVivo;

public class SerVivo {
    private String Nome;  // nome do animal
    private String Especie;  // especie do animal
    private String Pais;  // pais de origem
    private int idade;  // idade do animal

    public SerVivo(String nome, String especie, String pais, int idade) {
        Nome = nome;
        Especie = especie;
        Pais = pais;
        this.idade = idade;
    }

    public String getNome() {
        return Nome;
    }

    public String getEspecie() {
        return Especie;
    }

    public String getPais() {
        return Pais;
    }

    public int getIdade() {
        return idade;
    }

    public void exibirDetalhes(){
        System.out.println("\n===== Instituto de Vida Mundial® =====\n");
        System.out.println("Nome: " + this.Nome);
        System.out.println("Especie: " + this.Especie);
        System.out.println("Pais: " + this.Pais);
        System.out.println("Idade: " + this.idade + " anos");
    }
}
