package FichasExtra.Ficheiros;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static FichasExtra.Ficheiros.ex03_menuBase.menuBase;
import static Header.console.cleanConsole;

public class ex03_Dashboard {
    public static void main(String[] args) throws IOException {
        dashboardMenu();
    }
    public static void dashboardMenu() throws IOException {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            cleanConsole();
            System.out.println("================ Hotel JAVA ================");
            System.out.println("================   *****    ================");
            System.out.println("\n\n                Dashboard           \n\n");
            System.out.println("Consultar:\n");
            System.out.println("#1-  Receita Total por Anos");
            System.out.println("#2-  Despesa Total por Anos");
            System.out.println("#3-  Lucro por Anos");
            System.out.println("#4-  Melhor Cliente");
            System.out.println("#5-  Cliente mais consumista");
            System.out.println("#6-  Cliente mais presente");
            System.out.println("#7-  Tema mais procurado");
            System.out.println("#8-  Tema mais lucrativo");
            System.out.println("#9-  Tema menos lucrativo");
            System.out.println("#10- Produto/Serviço mais procurado");
            System.out.println("#11- Produto/Serviço menos procurado");
            System.out.println("#12- Produto/Serviço mais lucrativo");

            System.out.println("\n#0- Cancelar");
            System.out.print("\nOpcao: ");
            option = input.nextInt();
        } while (option < 0 || option > 12);

        switch (option) {
            case 1: // Receita Total por Anos
                break;
            case 2: // Despesa Total por Anos
                break;
            case 3: // Lucro por Anos
                break;
            case 4: // Melhor Cliente
                break;
            case 5: // Cliente mais consumista
                break;
            case 6: // Cliente mais presente
                break;
            case 7: // Tema mais procurado
                break;
            case 8: // Tema mais lucrativo
                break;
            case 9: // Tema menos lucrativo
                break;
            case 10: // Produto/Serviço mais procurado
                break;
            case 11: // Produto/Serviço menos procurado
                break;
            case 12: // Produto/Serviço mais lucrativo
                break;
            case 0: // Cancelar
                menuBase();
                break;
        }
    }
}
