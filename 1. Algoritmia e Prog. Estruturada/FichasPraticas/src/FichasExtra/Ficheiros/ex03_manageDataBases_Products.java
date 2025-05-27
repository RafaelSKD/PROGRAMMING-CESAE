package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases.manageDataBasesMenu;
import static Header.console.cleanConsole;

public class ex03_manageDataBases_Products {
    public static void db_ProductsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                  Produtos           \n\n");
            System.out.println("#1- Novo Produto");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 1);

        switch (option) {
            case 1: // Novo Produto
                break;
            case 0:
                manageDataBasesMenu();
                break;
        }
    }
}
