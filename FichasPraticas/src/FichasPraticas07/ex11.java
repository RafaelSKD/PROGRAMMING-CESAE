package FichasPraticas07;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

import static Header.console.cleanConsole;
import static Header.files.dupFile;
import static Header.files.printContentOccurrences;

public class ex11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);

        String srcOrigin = "src/FichasPraticas07/Ficheiros/exercicio_11.csv";
        String src = "src/FichasPraticas07/NewFiles/exercicio_11.csv";
        String splitter = ",";
        int month;
        try {
            dupFile(srcOrigin, src);
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
        while (true) {
            do {
                cleanConsole();
                System.out.println("=========== Festivais ===========\n");

                System.out.println("Escolha um mes: (1-12)");

                month = input.nextInt();
            } while (month < 1 || month > 12);

            switch (month) {
                case 1:
                    printContentOccurrences(src, splitter, "Janeiro", 2, 0, 1, 2, 3, 4);
                    break;
                case 2:
                    printContentOccurrences(src, splitter, "Fevereiro", 2, 0, 1, 2, 3, 4);
                    break;
                case 3:
                    printContentOccurrences(src, splitter, "Março", 2, 0, 1, 2, 3, 4);
                    break;
                case 4:
                    printContentOccurrences(src, splitter, "Abril", 2, 0, 1, 2, 3, 4);
                    break;
                case 5:
                    printContentOccurrences(src, splitter, "Maio", 2, 0, 1, 2, 3, 4);
                    break;
                case 6:
                    printContentOccurrences(src, splitter, "Junho", 2, 0, 1, 2, 3, 4);
                    break;
                case 7:
                    printContentOccurrences(src, splitter, "Julho", 2, 0, 1, 2, 3, 4);
                    break;
                case 8:
                    printContentOccurrences(src, splitter, "Agosto", 2, 0, 1, 2, 3, 4);
                    break;
                case 9:
                    printContentOccurrences(src, splitter, "Setembro", 2, 0, 1, 2, 3, 4);
                    break;
                case 10:
                    printContentOccurrences(src, splitter, "Outubro", 2, 0, 1, 2, 3, 4);
                    break;
                case 11:
                    printContentOccurrences(src, splitter, "Novembro", 2, 0, 1, 2, 3, 4);
                    break;
                case 12:
                    printContentOccurrences(src, splitter, "Dezembro", 2, 0, 1, 2, 3, 4);
                    break;
            }
            System.out.print("\n... para continuar digite qualquer coisa ");
            input.next();
            input.nextLine();
            cleanConsole();
            String option;
            do{
                System.out.print("Continuar? (S/N)");
                option = input.nextLine().toUpperCase();
            }while (!option.equals("S") && !option.equals("N"));
            if (option.equals("N"))
                break;
        }
    }
}