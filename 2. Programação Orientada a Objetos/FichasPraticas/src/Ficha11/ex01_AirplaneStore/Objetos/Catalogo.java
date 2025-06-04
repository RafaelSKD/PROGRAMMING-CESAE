package Ficha11.ex01_AirplaneStore.Objetos;

import java.util.ArrayList;

public class Catalogo{
    private ArrayList<Aviao> listaDeAvioes = new ArrayList<>();

    public void adquirirAviao(Aviao aviao){
        this.listaDeAvioes.add(aviao);
        System.out.println("\nAviao " + aviao.getModelo() + " adicionado com sucesso!");
    }

    public void venderAviao(Aviao aviao){
        this.listaDeAvioes.remove(aviao);
        System.out.println("\nAviao " + aviao.getModelo() + " removido com sucesso!");
    }

    public void calcularTotal(){
        double total = 0;
        for (Aviao aviao : this.listaDeAvioes){
            total += aviao.getPreco();
        }
        System.out.println("O valor total em avioes no catalogo e de " + total + "euros");
    }

    public void listarCatalogo(){
        int i = 0;
        for (Aviao aviao : this.listaDeAvioes)
            aviao.exibirDetalhes();
    }
}
