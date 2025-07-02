package GrandesNegocios.Controllers;

import GrandesNegocios.Models.Sale;
import GrandesNegocios.Repositories.SalesRepository;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientController {

    private static SalesRepository salesRepository;

    static {
        try {
            salesRepository = new SalesRepository();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            salesRepository = null;
        }
    }

    public ClientController() throws FileNotFoundException {
        this.salesRepository = new SalesRepository();
    }

//    tipo_produto,produto,quantidade_vendida,preco_unitario

    // devolve o stock baseado na categoria
    public static ArrayList<String> consultProducts(String way) {
        ArrayList<String> stock = new ArrayList<>();

        for (Sale sale : salesRepository.getSalesArray()) {
            // Pega o nome do produto e a quantidade vendida
            String produto = sale.getNomeProduto();
            String preco = String.valueOf(sale.getPrecoUnitario());
            String linha = "";
            if (way.equals("allStock")) {
                // Monta uma string com essas informações
                linha = produto + " - " + preco;
            } else {
                // Monta a linha apenas da categoria
                if (sale.getTipoProduto().toLowerCase().equals(way))
                    linha = produto + " - " + preco;
            }
            // Adiciona somente se ainda não estiver na lista
            if (!stock.contains(linha))
                stock.add(linha);
        }
        return stock;
    }

    // devolve o produto mais caro ou mais barato
    public static String extremePrice(String maxmin){
        String produto = "";

        // Inicializa com extremos diferentes para max e min
        double precoMaxMin = maxmin.equals("max") ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;

        for (Sale sale : salesRepository.getSalesArray()) {
            double preco = sale.getPrecoUnitario();

            if (maxmin.equals("max")) {
                if (preco > precoMaxMin) {
                    produto = sale.getNomeProduto();
                    precoMaxMin = preco;
                }
            } else {
                if (preco < precoMaxMin) {
                    produto = sale.getNomeProduto();
                    precoMaxMin = preco;
                }
            }
        }

        return (produto + " - " + precoMaxMin);
    }

}
