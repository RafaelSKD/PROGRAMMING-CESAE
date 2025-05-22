package FichasExtra.Ficheiros;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;
import static Header.console.*;

public class ex03_login {
    public static void login() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        String loginHotel = "src/FichasExtra/Ficheiros/FichaPraticaExtraFicheiros/ExtraHotel/loginHotel.txt";
        String splitter = ";";
        Scanner data = new Scanner(new File(loginHotel));
        String[][] loginMatriz = fileToMatriz(loginHotel, splitter, 2);
        String username = "";
        String password = "";
        int flag = 0;
        do {
            if (flag == 1){
                cleanConsole();
                System.out.println("================ Hotel JAVA ================");
                System.out.println("================   *****    ================");
                System.out.println("\n\n                   LOGIN\n\n");
                System.out.println("        ERROR!: PASSWORD/LOGIN - FAILED ");
                System.out.println("\n\n===========================================");
                System.out.println("===========================================");
                System.out.print("\n\n... TRY AGAIN-> ");
                input.next();
                input.nextLine();
            }
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                   LOGIN\n\n");
            System.out.print("             USERNAME: ");
            username = input.nextLine();
            System.out.print("             PASSWORD: ");
            password = input.nextLine();
            System.out.println("\n\n===========================================");
            System.out.println("===========================================");
            flag = 1;
        }while (!validUserPassword(loginMatriz, username, password));
        cleanConsole();
        System.out.println("================ Hotel JAVA ================");
        System.out.println("================   *****    ================");
        System.out.println("\n\n                   LOGIN\n");
        System.out.println("                 *SUCCESS* ");
        System.out.println("\n\n===========================================");
        System.out.println("===========================================");
        System.out.print("\n\n... CONTINUE-> ");
        input.next();
        input.nextLine();
    }

    public static boolean validUserPassword(String[][] loginMatriz , String username, String password){

        int x = 0, y;
        while (x < loginMatriz.length){
            y = 0;
            while (y < loginMatriz[x].length){
                if (loginMatriz[x][y].equals(username) && loginMatriz[x][y+1].equals(password))
                    return true;
                y++;
            }
            x++;
        }
        return false;
    }
}
