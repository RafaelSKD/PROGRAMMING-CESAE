package FichasExtra.Ficheiros;

import java.util.Scanner;
import java.io.*;
import java.util.Scanner;
import static Header.array.*;
import static Header.print.*;
import static Header.num.*;
import static Header.files.*;
import static Header.console.*;

import static Header.console.cleanConsole;

public class ex03_1stMenu {
    public static void menuHome(){
        Scanner input = new Scanner(System.in);
        cleanConsole();
        System.out.println("================ Hotel JAVA ================");
        System.out.println("================   *****    ================");
        System.out.println("\n\n          Bem-Vindo ao Hotel Java\n\n");
        System.out.println("===========================================");
        System.out.println("===========================================");
        System.out.print("\n\n... CONTINUE-> ");
        input.next();
    }
}
