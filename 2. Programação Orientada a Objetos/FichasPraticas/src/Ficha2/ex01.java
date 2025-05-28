package Ficha2;

import Objetos.Carro;
import Enums.TipoCombustivel;

// The ex01 class demonstrates the use of the extended Carro class (Ficha 2).
// It creates multiple cars with detailed attributes, simulates engine starts,
// runs races between them, determines a final champion, and calculates fuel consumption.

public class ex01 {
    public static void main(String[] args) {
        // Create car objects with full details (make, model, color, year, horsepower, engine size, fuel type, and consumption)
        Carro bmw = new Carro("BMW", "e61 550i", "verde", 2007, 367, 4799, TipoCombustivel.GASOLINA, 15.9);
        Carro mercedes = new Carro("Mercedes", "c300h", "preto", 2017, 203, 1999, TipoCombustivel.DIESEL, 6.5);
        Carro audi = new Carro("Audi", "a80", "azul", 1972, 136, 2200, TipoCombustivel.DIESEL, 10.5);
        Carro volkswagen = new Carro("Volkswagen", "golf", "branco", 1991, 150, 1395, TipoCombustivel.GASOLINA, 5.5);

        // Simulate starting each car
        bmw.ligarCarro();
        mercedes.ligarCarro();
        audi.ligarCarro();
        volkswagen.ligarCarro();

        // Race between BMW and Mercedes
        Carro vencedor = bmw.corrida(mercedes);
        System.out.println("\nVencedor da corrida entre BMW e Mercedes: " + vencedor.getMarca());

        // Race between Audi and Volkswagen
        Carro vencedor2 = audi.corrida(volkswagen);
        System.out.println("Vencedor da corrida entre Audi e Volkswagen: " + vencedor2.getMarca());

        // Final race between the two previous winners
        Carro campeao = vencedor.corrida(vencedor2);
        System.out.println("\nCampeão da corrida entre os vencedores anterirores: " + campeao.getMarca());

        // Calculate fuel consumption of the champion over 65 km
        System.out.println("Consumo do campeão em 65 km: " + campeao.calcularConsumo(65.0) + " litros");
    }
}
