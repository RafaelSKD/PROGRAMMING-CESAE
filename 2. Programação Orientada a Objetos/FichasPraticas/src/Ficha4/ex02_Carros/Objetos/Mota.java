package Ficha4.ex02_Carros.Objetos;

import Enums.TipoCombustivel;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.ref.PhantomReference;
import java.util.Scanner;

public class Mota extends Veiculo{

    public Mota(String marca, String modelo, int ano, double potencia, int cilindrada, TipoCombustivel combustivel, double consumoLitros100km) {
        super(marca, modelo, ano, potencia, cilindrada, combustivel, consumoLitros100km);
    }

    public void imagem() throws FileNotFoundException {
        Scanner data = new Scanner(new File("src/Ficha4/ex02_Carros/Files/Mota.txt"));

        while (data.hasNextLine()){
            String linha = data.nextLine();
            System.out.println(linha);
        }

        data.close();
    }
}
