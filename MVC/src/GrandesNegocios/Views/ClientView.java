package GrandesNegocios.Views;
import java.util.ArrayList;
import java.util.Scanner;

import static GrandesNegocios.Controllers.ClientController.consultProducts;
import static GrandesNegocios.Controllers.ClientController.extremePrice;

public class ClientView {

    public void clientMenu(){

        Scanner input = new Scanner(System.in);
        int opcaoCliente;

        do {

            System.out.println("\n\n********** MENU CLIENTE **********");
            System.out.println("1. Consultar Produtos Disponíveis");
            System.out.println("2. Consultar Produtos p/ Categoria");
            System.out.println("3. Consultar Produto Mais Barato / Mais Caro");
            System.out.println("0. Voltar");

            System.out.print("Opção: ");
            opcaoCliente= input.nextInt();

            switch (opcaoCliente){
                case 1: // Consultar Produtos Disponíveis
                    ArrayList<String> stock = consultProducts("allStock");
                    for (String produto : stock) {
                        System.out.println(produto);
                    }
                    break;
                case 2 : // Consultar Produtos p/ Categoria
                    System.out.print("Categoria: ");
                    input.nextLine(); // << Adicionado para consumir a quebra de linha
                    String way = input.nextLine().toLowerCase();
                    ArrayList<String> categoria = consultProducts(way);
                    for (String produto : categoria) {
                        System.out.println(produto);
                    }
                    break;
                case 3: // Consultar Produto Mais Barato / Mais Caro
                    System.out.print("\n1. Mais caro\n2. Mais Barato\n\nEscolha:");
                    opcaoCliente= input.nextInt();
                    if (opcaoCliente == 1)
                        System.out.println("\n" + extremePrice("max"));
                    else if (opcaoCliente == 2)
                        System.out.println("\n" + extremePrice("min"));
                    else
                        System.out.println("\nOpção Inválida!");
                    break;
                case 0: // Voltar
                    break;
                default:
                    System.out.println("\nOpção Inválida!");
            }
        }while (opcaoCliente!=0);
    }
}
