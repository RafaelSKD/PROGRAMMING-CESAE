package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_menuBase.menuBase;
import static Header.console.cleanConsole;

public class ex03_consultReservations {
    public static void main(String[] args) throws IOException {
        consultReservationsMenu();
    }
    public static void consultReservationsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n             Consultar Reservas           \n\n");
            System.out.println("Escolha a forma da procura:\n");
            System.out.println("#1- Historico de Reservas");
            System.out.println("#2- Reservas Ativas");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 2);

        switch (option) {
            case 1: // historico
                break;
            case 2: // reservas ativas
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
