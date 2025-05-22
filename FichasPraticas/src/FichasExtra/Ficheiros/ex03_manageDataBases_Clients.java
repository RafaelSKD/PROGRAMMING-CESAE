package FichasExtra.Ficheiros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_manageDataBases.*;
import static FichasExtra.Ficheiros.ex03_menuBase.menuBase;
import static Header.console.cleanConsole;
import static Header.files.*;

public class ex03_manageDataBases_Clients {
    public static void main(String[] args) throws IOException {
        db_ClientsMenu();
    }
    public static void db_ClientsMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                  Clientes           \n\n");
            System.out.println("#1- Novo Cliente");
            System.out.println("#2- Atualizar Contactos do Cliente");
            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 2);

        switch (option) {
            case 1: //  Novo Cliente
                addNewClient();
                break;
            case 2: //  Atualizar Contactos do Cliente
                break;
            case 0:
                manageDataBasesMenu();
                break;
        }
    }


    public static void addNewClient() throws IOException {
        Scanner input = new Scanner(System.in);
        File file = new File("src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/clientesHotel.csv");

        String[][] loginMatriz = fileToMatriz("src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/clientesHotel.csv", ";", 5);

        String newId = getNextId(loginMatriz);
        System.out.println(newId);
    }

    public static String getNextId(String[][] loginMatriz){
        char c1000 = loginMatriz[loginMatriz.length - 1][0].charAt(2);
        char c0100 = loginMatriz[loginMatriz.length - 1][0].charAt(3);
        char c0010 = loginMatriz[loginMatriz.length - 1][0].charAt(4);
        char c0001 = loginMatriz[loginMatriz.length - 1][0].charAt(5);
        int i1000 = c1000 - '0';
        i1000 *= 1000;
        int i0100 = c0100 - '0';
        i0100 *= 100;
        int i0010 = c0010 - '0';
        i0010 *= 10;
        int i0001 = c0001 - '0';
        int idNumber = i1000 + i0100 + i0010 + i0001;
        idNumber++;
        return ("c-" + idNumber);
    }
}
