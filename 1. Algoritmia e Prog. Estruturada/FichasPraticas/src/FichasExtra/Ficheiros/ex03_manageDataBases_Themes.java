package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases.manageDataBasesMenu;
import static Header.console.cleanConsole;

public class ex03_manageDataBases_Themes {
    public static void main(String[] args) throws IOException {
        db_ThemesMenu();
    }
    public static void db_ThemesMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                  Temas           \n\n");
            System.out.println("#1- Novo Tema");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 1);

        switch (option) {
            case 1: // Novo Tema
                break;
            case 0:
                manageDataBasesMenu();
                break;
        }
    }
}
