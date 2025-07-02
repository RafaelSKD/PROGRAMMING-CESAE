package FichasPraticas.FichaPratica2.Ex02;

import FichasPraticas.FichaPratica2.Ex02.Tacos.Taco;

import java.util.Scanner;

import static FichasPraticas.FichaPratica2.Ex02.Tacos.FabricaTacos.TacoFactory.criarTaco;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("\n\n  Tipo de taco :");
            String tipo = input.nextLine();
            if (criarTaco(tipo) == null)
                continue;
            Taco taco = criarTaco(tipo);
            taco.Prepare();
            sleep (1000);
            taco.Bake();
            sleep (1000);
            taco.Box();
        }while (true);
    }
}
