package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases_Autentication.db_AutenticationMenu;
import static FichasExtra.Ficheiros.ex03_manageDataBases_Clients.*;
import static FichasExtra.Ficheiros.ex03_manageDataBases_Products.db_ProductsMenu;
import static FichasExtra.Ficheiros.ex03_manageDataBases_Rooms.db_RoomsMenu;
import static FichasExtra.Ficheiros.ex03_manageDataBases_Themes.db_ThemesMenu;
import static FichasExtra.Ficheiros.ex03_menuBase.*;
import static Header.console.cleanConsole;

public class ex03_consultRooms {
    public static void main(String[] args) throws IOException {
        consultRoomsMenu();
    }
    public static void consultRoomsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n        Consultar Quartos Disponiveis   \n\n");
            System.out.println("Consultar:\n");
            System.out.println("#1- Quartos Disponiveis - todos");
            System.out.println("#2- Quartos Disponiveis - por tema");
            System.out.println("#3- Quartos Disponiveis - por tipo de quarto");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 3);

        switch (option) {
            case 1: // todos
                break;
            case 2: // tema
                break;
            case 3: // tipo
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
