package Ficha4.AirplaneStore;

import Ficha4.AirplaneStore.Enum.Categoria;
import Ficha4.AirplaneStore.Objetos.Aviao;
import Ficha4.AirplaneStore.Objetos.AvioesDeCombate;
import Ficha4.AirplaneStore.Objetos.Catalogo;
import Ficha4.AirplaneStore.Objetos.JatosParticulares;

public class Main {
    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        Aviao aviao1 = new AvioesDeCombate(1, "F-22 Raptor", 2010, 19700, 19.0, 13.6, 5.1, 2, 3000, 2410, 150000, "EUA", true, new String[]{"Mísseis", "Canhão", "Bombas"});
        Aviao aviao2 = new JatosParticulares(2, "Gulfstream G650", 2018, 29000, 30.4, 28.5, 7.7, 2, 12900, 982, 700000, 18, 4200_000, Categoria.HEAVYJET, new String[]{"Bar", "Wi-Fi", "Sala de reuniões"});

        catalogo.adquirirAviao(aviao1);
        catalogo.adquirirAviao(aviao2);

        catalogo.listarCatalogo();
        catalogo.calcularTotal();
    }
}