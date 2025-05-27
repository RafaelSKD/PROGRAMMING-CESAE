package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_dispacher.*;
import static FichasExtra.Ficheiros.ex03_login.login;
import static Header.console.cleanConsole;

public class ex03_menuBase {
    public static void menuBase() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================\n");
            System.out.println("================    MENU    ================\n");
            System.out.println("#1- Gerir Base de Dados");
            System.out.println("#2- Consular Clientes");
            System.out.println("#3- Consultar Quartos Disponíveis");
            System.out.println("#4- Consultar Reservas");
            System.out.println("#5- Registar Nova Reserva");
            System.out.println("#6- Dashboard de Análise");
            System.out.println("#7- Galeria");
            System.out.println("\n#0- Logout");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 7);
        if (option == 0){
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                  LOGOUT\n");
            System.out.println("                 *SUCCESS* ");
            System.out.println("\n\n===========================================");
            System.out.println("===========================================");
            System.out.print("\n\n... CONTINUE-> ");
            input.next();
            input.nextLine();
            login();
        }
        dispacher(option);
    }
}
