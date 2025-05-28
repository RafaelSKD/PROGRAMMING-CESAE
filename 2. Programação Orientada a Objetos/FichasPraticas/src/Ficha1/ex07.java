package Ficha1;

import Objetos.Aluno;

// The ex07 class demonstrates the use of the Aluno class.
// It creates two Aluno objects and checks if one of them is approved based on their average grade.

public class ex07 {
    public static void main(String[] args) {
        // Creating two students with name, age, email, course, and average grade
        Aluno aluno = new Aluno("Rafael", 28, "emailrafael@sss", "WEBC", 15);
        Aluno aluno1 = new Aluno("Zacarias", 30, "emailzacarias@sss", "Ingles", 7.5);

        // Check and print Rafael's approval status
        if (aluno.situacaoAprovacao()) {
            System.out.println("Aprovado");
        }
        if (!aluno.situacaoAprovacao()) {
            System.out.println("Reprovado");
        }
    }
}
