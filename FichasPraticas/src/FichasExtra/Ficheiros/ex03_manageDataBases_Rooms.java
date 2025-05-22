package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases.manageDataBasesMenu;
import static Header.console.cleanConsole;

public class ex03_manageDataBases_Rooms {
    public static void main(String[] args) throws IOException {
        db_RoomsMenu();
    }
    public static void db_RoomsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                  Quartos           \n\n");
            System.out.println("#1- Novo Quarto");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 1);

        switch (option) {
            case 1: // Novo Quarto
                break;
            case 0:
                manageDataBasesMenu();
                break;
        }
    }
}
