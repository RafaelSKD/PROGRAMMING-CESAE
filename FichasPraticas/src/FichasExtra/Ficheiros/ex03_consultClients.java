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

public class ex03_consultClients {
    public static void main(String[] args) throws IOException {
        consultClientsMenu();
    }
    public static void consultClientsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n             Consultar Clientes           \n\n");
            System.out.println("Escolha a forma da procura:\n");
            System.out.println("#1- idClientes");
            System.out.println("#2- Telemovel");
            System.out.println("#3- Email");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 3);

        switch (option) {
            case 1: // id
                break;
            case 2: // Telemovel
                break;
            case 3: // Email
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
