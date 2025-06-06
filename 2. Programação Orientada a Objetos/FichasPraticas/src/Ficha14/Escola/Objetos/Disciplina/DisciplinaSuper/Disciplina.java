package Ficha14.Escola.Objetos.Disciplina.DisciplinaSuper;

import Ficha14.Escola.Enum.AreaFormacao;

import java.util.Scanner;

import Ficha14.Escola.Utils.Print.*;

public class Disciplina {
    private String nome;
    private AreaFormacao area;
    private int duracaoHoras;

    public Disciplina(String nome, AreaFormacao area, int duracaoHoras) {
        this.nome = nome;
        this.area = area;
        this.duracaoHoras = duracaoHoras;
    }

    public void disciplinaInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nAdicionar nova Disciplina:\n\n");
        System.out.println("Nome: ");
        String nome = input.nextLine();



    }
}
