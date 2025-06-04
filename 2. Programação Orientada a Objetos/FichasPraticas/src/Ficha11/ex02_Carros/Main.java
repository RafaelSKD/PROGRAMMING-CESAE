package Ficha11.ex02_Carros;

import Enums.TipoCombustivel;
import Ficha11.ex02_Carros.Objetos.Camiao;
import Ficha11.ex02_Carros.Objetos.Carro;
import Ficha11.ex02_Carros.Objetos.Mota;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro(
                "Toyota",             // marca
                "Corolla",            // modelo
                2022,                 // ano
                110.0,                // potência em cavalos
                1800,                 // cilindrada
                TipoCombustivel.GASOLINA, // combustível
                6.5,                  // consumo em L/100km
                5                     // quantidade de passageiros
        );

        Carro carro2 = new Carro(
                "Honda",              // marca
                "Civic",              // modelo
                2023,                 // ano
                130.0,                // potência
                2000,                 // cilindrada
                TipoCombustivel.GASOLINA, // combustível
                5.8,                  // consumo em L/100km
                5                     // quantidade de passageiros
        );

        Mota mota = new Mota(
                "Yamaha",             // marca
                "MT-07",              // modelo
                2021,                 // ano
                74.0,                 // potência
                689,                  // cilindrada
                TipoCombustivel.GASOLINA, // combustível
                4.3                   // consumo em L/100km
        );

        Camiao camiao = new Camiao(
                "Volvo",              // marca
                "FH16",               // modelo
                2020,                 // ano
                750.0,                // potência
                16000,                // cilindrada
                TipoCombustivel.DIESEL,   // combustível
                30.0,                 // consumo em L/100km
                25000.0               // capacidade de carga em kg
        );

        carro.corrida(carro2);
        mota.corrida(camiao);
        carro.calcularCusto(150);
        camiao.viagem(1000, 25001); // invalid
        camiao.viagem(1000, 25000); // valid

    }
}
