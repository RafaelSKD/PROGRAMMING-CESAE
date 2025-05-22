package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_menuBase.menuBase;
import static Header.console.cleanConsole;

public class ex03_NewBooking {
    public static void main(String[] args) throws IOException {
        newBookingMenu();
    }
    public static void newBookingMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                Nova Reserva           \n\n");
            System.out.println("#1- Efetuar Nova Reserva");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 1);

        switch (option) {
            case 1: // nova reserva
                break;
            case 0:
                menuBase();
                break;
        }
    }
}
