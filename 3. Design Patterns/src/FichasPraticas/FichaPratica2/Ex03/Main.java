package FichasPraticas.FichaPratica2.Ex03;

import FichasPraticas.FichaPratica2.Ex02.Tacos.Taco;
import FichasPraticas.FichaPratica2.Ex03.Documento.Documento;

import java.util.Scanner;

import static FichasPraticas.FichaPratica2.Ex02.Tacos.FabricaTacos.TacoFactory.criarTaco;
import static FichasPraticas.FichaPratica2.Ex03.Documento.FabricaDocumentos.criarDoc;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\n\n\n\n\n");
            System.out.println("                                       Criacao de Docs\n\n");
            System.out.print("\n\n Tipo de Documento ( csv | pptx | txt): ");
            String tipo = input.nextLine();
            System.out.print("\n\n Autor: ");
            String autor = input.nextLine();
            System.out.print("\n\n Nome do Documento: ");
            String nome = input.nextLine();
            if (criarDoc(tipo, autor, nome) == null)
                continue;
            Documento doc = criarDoc(tipo, autor, nome);
            sleep (1000);
            System.out.println();
            doc.open();
            sleep (1000);
            doc.save();
            sleep (1000);
            doc.close();
            sleep (1000);
        }while (true);
    }
}
