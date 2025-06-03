package Ficha4.ex02_Carros.Objetos;

import Enums.TipoCombustivel;

public class Carro extends Veiculo{
    private int quantidadePassageiros;

    public Carro(String marca, String modelo, int ano, double potencia, int cilindrada, TipoCombustivel combustivel, double consumoLitros100km, int quantidadePassageiros) {
        super(marca, modelo, ano, potencia, cilindrada, combustivel, consumoLitros100km);
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public void calcularCusto(double distancia) { // em kms
        double custo = 0;
        switch (this.getCombustivel()) {
            case GASOLINA:
                custo = ((distancia) * (this.getConsumoLitros100km() / 100)) * 2.1; // gasoline costs 2.1EUR per liter
                System.out.println("\n" + "Custo da viagem de " + distancia + "km: " + custo + " EUR");
                break;
            case DIESEL:
                custo = ((distancia) * (this.getConsumoLitros100km() / 100)) * 1.95; // diesel costs 1.95EUR per liter
                System.out.println("\n" + "Custo da viagem de " + distancia + "km: " + custo + " EUR");
                break;
            case GPL:
                custo = ((distancia) * (this.getConsumoLitros100km() / 100)) * 1.15; // gpl costs 1.15EUR per liter
                System.out.println("\n" + "Custo da viagem de " + distancia + "km: " + custo + " EUR");
                break;
            case ELETRICO:
                custo = ((distancia) * (this.getConsumoLitros100km() / 100)) * 0.12; // electric cost is 0.12EUR per kWh
                System.out.println("\n" + "Custo da viagem de " + distancia + "km: " + custo + " EUR");
                break;
        }
    }
}
