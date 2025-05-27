package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases.manageDataBasesMenu;
import static Header.console.cleanConsole;

public class ex03_manageDataBases_Autentication {
    public static void main(String[] args) throws IOException {
        db_AutenticationMenu();
    }
    public static void db_AutenticationMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                Autenticacao           \n\n");
            System.out.println("#1-  Novas Credenciais");
            System.out.println("#2-  Excluir Credenciais");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 2);

        switch (option) {
            case 1: //  Novas Credenciais
                break;
            case 2:
                break;
            case 0:
                manageDataBasesMenu();
                break;
        }
    }
}
