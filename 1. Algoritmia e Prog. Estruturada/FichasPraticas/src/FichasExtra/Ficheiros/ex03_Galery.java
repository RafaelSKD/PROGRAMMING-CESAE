package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_menuBase.menuBase;
import static Header.console.cleanConsole;

public class ex03_Galery {
    public static void main(String[] args) throws IOException {
        galeryMenu();
    }
    public static void galeryMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                Galeria           \n\n");
            System.out.println("#1- Ver Quarto");
            System.out.println("#2- Ver Fachada");
            System.out.println("#3- Ver Spa");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 3);

        switch (option) {
            case 1: // Ver Quarto
                break;
            case 2: // Ver Fachada
                break;
            case 3: // Ver Spa
                break;
            case 0: // Cancelar
                menuBase();
                break;
        }
    }
}
