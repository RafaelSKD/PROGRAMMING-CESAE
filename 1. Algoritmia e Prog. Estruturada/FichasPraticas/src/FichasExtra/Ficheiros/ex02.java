package FichasExtra.Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static Header.console.cleanConsole;

public class ex02 {
    public static void main(String[] args) {
        try {
            showMostRepWord();
        } catch (FileNotFoundException e) {
            System.out.println("Erro: ficheiro não encontrado ou caminho inválido.");
        }
    }

    public static void showMostRepWord() throws FileNotFoundException{
        Scanner input = new Scanner(System.in);
        File file1 = new File("src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/exercicio_02.txt");

        Scanner scanner1 = new Scanner(file1);

        StringBuilder text = new StringBuilder();

        while (scanner1.hasNextLine()){
            text.append(scanner1.nextLine());
            text.append(" ");
        }
        findMostRepWord(String.valueOf(text));
        scanner1.close();
    }

    public static void findMostRepWord(String text){
        int i = 0, compare, counter;

        text = text.replaceAll("[^\\p{L}\\p{Nd}]+", " ");
        String[] words = text.split(" ");

        String mostRepWord1 = "", mostRepWord2 = "", mostRepWord3 = "", mostRepWord4 = "", mostRepWord5 = "", mostRepWord6 = "", mostRepWord7 = "", mostRepWord8 = "", mostRepWord9 = "", mostRepWord10 = "";

        int mostRep1 = 0, mostRep2 = 0, mostRep3 = 0, mostRep4 = 0, mostRep5 = 0, mostRep6 = 0, mostRep7 = 0, mostRep8 = 0, mostRep9 = 0, mostRep10 = 0;

        while (i < words.length){
            compare = i + 1;
            counter = 1;
            while (compare < words.length){
                if (words[i].equals(words[compare]) && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5) && !words[i].equals(mostRepWord6) && !words[i].equals(mostRepWord7) && !words[i].equals(mostRepWord8) && !words[i].equals(mostRepWord9) && !words[i].equals(mostRepWord10)){
                    counter++;
                }
                compare++;
            }


            if (counter > mostRep1) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = mostRepWord5;
                mostRep6 = mostRep5;
                mostRepWord5 = mostRepWord4;
                mostRep5 = mostRep4;
                mostRepWord4 = mostRepWord3;
                mostRep4 = mostRep3;
                mostRepWord3 = mostRepWord2;
                mostRep3 = mostRep2;
                mostRepWord2 = mostRepWord1;
                mostRep2 = mostRep1;
                mostRepWord1 = words[i];
                mostRep1 = counter;
            } else if (counter > mostRep2 && !words[i].equals(mostRepWord1)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = mostRepWord5;
                mostRep6 = mostRep5;
                mostRepWord5 = mostRepWord4;
                mostRep5 = mostRep4;
                mostRepWord4 = mostRepWord3;
                mostRep4 = mostRep3;
                mostRepWord3 = mostRepWord2;
                mostRep3 = mostRep2;
                mostRepWord2 = words[i];
                mostRep2 = counter;
            } else if (counter > mostRep3 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = mostRepWord5;
                mostRep6 = mostRep5;
                mostRepWord5 = mostRepWord4;
                mostRep5 = mostRep4;
                mostRepWord4 = mostRepWord3;
                mostRep4 = mostRep3;
                mostRepWord3 = words[i];
                mostRep3 = counter;
            } else if (counter > mostRep4 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = mostRepWord5;
                mostRep6 = mostRep5;
                mostRepWord5 = mostRepWord4;
                mostRep5 = mostRep4;
                mostRepWord4 = words[i];
                mostRep4 = counter;
            } else if (counter > mostRep5 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = mostRepWord5;
                mostRep6 = mostRep5;
                mostRepWord5 = words[i];
                mostRep5 = counter;
            } else if (counter > mostRep6 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = mostRepWord6;
                mostRep7 = mostRep6;
                mostRepWord6 = words[i];
                mostRep6 = counter;
            } else if (counter > mostRep7 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5) && !words[i].equals(mostRepWord6)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = mostRepWord7;
                mostRep8 = mostRep7;
                mostRepWord7 = words[i];
                mostRep7 = counter;
            } else if (counter > mostRep8 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5) && !words[i].equals(mostRepWord6) && !words[i].equals(mostRepWord7)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = mostRepWord8;
                mostRep9 = mostRep8;
                mostRepWord8 = words[i];
                mostRep8 = counter;
            } else if (counter > mostRep9 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5) && !words[i].equals(mostRepWord6) && !words[i].equals(mostRepWord7) && !words[i].equals(mostRepWord8)) {
                mostRepWord10 = mostRepWord9;
                mostRep10 = mostRep9;
                mostRepWord9 = words[i];
                mostRep9 = counter;
            } else if (counter > mostRep10 && !words[i].equals(mostRepWord1) && !words[i].equals(mostRepWord2) && !words[i].equals(mostRepWord3) && !words[i].equals(mostRepWord4) && !words[i].equals(mostRepWord5) && !words[i].equals(mostRepWord6) && !words[i].equals(mostRepWord7) && !words[i].equals(mostRepWord8) && !words[i].equals(mostRepWord9)) {
                mostRepWord10 = words[i];
                mostRep10 = counter;
            }
            i++;
        }
        System.out.println("A palavra mais repetida foi: " + mostRepWord1 + "\nFoi repetida " + mostRep1 + "x.\nA segunda palavra mais repetida foi: " + mostRepWord2 + "\nFoi repetida " + mostRep2 + "x.\nA terceira palavra mais repetida foi: " + mostRepWord3 + "\nFoi repetida " + mostRep3 + "x.\nA quarta palavra mais repetida foi: " + mostRepWord4 + "\nFoi repetida " + mostRep4 + "x.\nA quinta palavra mais repetida foi: " + mostRepWord5 + "\nFoi repetida " + mostRep5 + "x.\nA sexta palavra mais repetida foi: " + mostRepWord6 + "\nFoi repetida " + mostRep6 + "x.\nA sétima palavra mais repetida foi: " + mostRepWord7 + "\nFoi repetida " + mostRep7 + "x.\nA oitava palavra mais repetida foi: " + mostRepWord8 + "\nFoi repetida " + mostRep8 + "x.\nA nona palavra mais repetida foi: " + mostRepWord9 + "\nFoi repetida " + mostRep9 + "x.\nA décima palavra mais repetida foi: " + mostRepWord10 + "\nFoi repetida " + mostRep10 + "x.");

    }
}
