package Ficha9;

import Enums.TipoAcabamentoImovel;
import Enums.TipoImovel;
import Objetos.Imovel;

// The ex04 class demonstrates the use of the Imovel class and its property comparison feature.
// It creates two properties, compares their estimated value, and prints the details of the more expensive one.

public class ex04 {
    public static void main(String[] args) {
        // Create first property: an apartment in Porto
        Imovel imovel1 = new Imovel(
                "Rua do Sol", 101, "Porto",
                TipoImovel.APARTAMENTO,
                TipoAcabamentoImovel.USADA,
                85.0, 2, 1, 0.0
        );

        // Create second property: a mansion in Faro with premium finishing and a pool
        Imovel imovel2 = new Imovel(
                "Avenida das Palmeiras", 1, "Faro",
                TipoImovel.MANSAO,
                TipoAcabamentoImovel.NOVA_COM_ALTO_ACABAMENTO,
                500.0, 6, 5, 60.0
        );

        // Compare the two properties and get the more expensive one
        Imovel imovelMaisCaro = imovel1.compararImoveis(imovel2);

        // Print the details of the more valuable property
        System.out.println(imovelMaisCaro.getInfo());
    }
}
