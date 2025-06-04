package Ficha11.ex02_Carros.Objetos;

import Enums.TipoCombustivel;

public class Camiao extends Veiculo {
    private double capacidadeCarga; // em kg

    public Camiao(String marca, String modelo, int ano, double potencia, int cilindrada, TipoCombustivel combustivel, double consumoLitros100km, double capacidadeCarga) {
        super(marca, modelo, ano, potencia, cilindrada, combustivel, consumoLitros100km);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void viagem(double distancia, double carga){ //km, kg
        if (carga > this.capacidadeCarga)
            System.out.println("\n" + "Erro: A carga excede a capacidade do camião.");
        else {
            double consumo = this.getConsumoLitros100km() + (carga * 0.001); // more 0.1l/100km so more 0.001L/1km
            double custo = ((distancia) * (consumo / 100)) * 1.95; // diesel costs 1.95EUR per liter
            System.out.println("\n" + "Custo da viagem de " + distancia + "km: " + custo + " EUR");
        }
    }

}
