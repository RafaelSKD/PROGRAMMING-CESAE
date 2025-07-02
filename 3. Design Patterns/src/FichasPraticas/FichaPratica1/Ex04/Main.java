package FichasPraticas.FichaPratica1.Ex04;

import FichasPraticas.FichaPratica1.Ex04.FileManager.FileManager;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileManager fileManager = FileManager.getInstance();
        fileManager.setRootDirectory("/textFiles");
        fileManager.createFile("file.txt");
        fileManager.createFile("ficheiroNovo.txt");
        fileManager.deleteFile("file.txt");
        fileManager.setRootDirectory("/csvFiles");
        fileManager.createFile("tabela.csv");
        fileManager.createFile("filmes.csv");
        fileManager.createFile("jogos.csv");
        fileManager.deleteFile("tabela.csv ");
    }
}
