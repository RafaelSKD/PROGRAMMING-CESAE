package FichasExtra.Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import static Header.console.cleanConsole;

public class ex01 {
    public static void main(String[] args) {
        try {
            dupFileWithWord();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void dupFileWithWord() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        File file1 = new File("src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/exercicio_01.txt");
        File file2 = new File("src/FichasExtra/Ficheiros/NewFiles/exercicio_01_cpy.txt");

        Scanner scanner1 = new Scanner(file1);
        PrintWriter file2Writer = new PrintWriter(file2);



        cleanConsole();
        System.out.println("=========== Copy lines ===========\n");

        System.out.println("Escolha uma palavra : ");

        String word = input.nextLine();
        String linha;

        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            if (linha.contains(word))
                file2Writer.println(linha);
        }

        scanner1.close();
        file2Writer.close();
    }
}
