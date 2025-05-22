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

public class ex03_manageDataBases {
    public static void main(String[] args) throws IOException {
        manageDataBasesMenu();
    }
    public static void manageDataBasesMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n            Gerir Base de Dados           \n\n");
            System.out.println("#1- Clientes");
            System.out.println("#2- Temas");
            System.out.println("#3- Quartos");
            System.out.println("#4- Autenticação");
            System.out.println("#5- Produtos");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 5);

        switch (option) {
            case 1: // Clientes
                db_ClientsMenu();
                break;
            case 2: // Temas
                db_ThemesMenu();
                break;
            case 3: // Quartos
                db_RoomsMenu();
                break;
            case 4: // Autenticacao
                db_AutenticationMenu();
                break;
            case 5: // Produtos
                db_ProductsMenu();
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
