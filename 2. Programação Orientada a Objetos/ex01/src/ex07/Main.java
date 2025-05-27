package ex07;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Rafael", 28, "emailrafael@sss", "WEBC" ,15);
        Aluno aluno1 = new Aluno("Zacarias", 30, "emailzacarias@sss", "Ingles" , 7.5);

        if (aluno.situacaoAprovacao()){
            System.out.println("Aprovado");
        };
        if (!aluno.situacaoAprovacao()){
            System.out.println("Reprovado");
        }
    }
}

