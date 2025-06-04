package Ficha11.ex03_ex04_Pizzaria.Objetos;

import Ficha11.ex03_ex04_Pizzaria.Enum.TamPizza;

import java.util.ArrayList;

public class Pizza {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private TamPizza tamanho;
    private ArrayList<IngredientePizza> ingredientes = new ArrayList<IngredientePizza>();
    private Base base;

    public Pizza(int codigo, String nome, String descricao, double preco, TamPizza tamanho, Base base) {
        this.codigo = codigo;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.base = base;
    }

    public void adicionarIngrediente(IngredientePizza ingredienteNovo){
        if(this.ingredientes.size() < 5){
            this.ingredientes.add(ingredienteNovo);
            System.out.println("\nadicionado com sucesso");
            return;
        }
        System.out.println("\nNumero de ingredientes maximo excedido");
    }

    public void editarQuantidadeIngrediente(double quantidadeNova, int id){
        for (IngredientePizza novo : this.ingredientes){
            if (id == novo.getCodigo()){
                novo.quantidade = quantidadeNova;
                return;
            }
        }
    }

    public void removerIngrediente(int id){
        int i = 0;
        for (IngredientePizza novo : this.ingredientes){
            if (id == novo.getCodigo()) {
                ingredientes.remove(i);
                return;
            }
            i++;
        }
    }

    public double calcularKcalPizza(){
        double kcal = 0;
        for (IngredientePizza novo : this.ingredientes){
            kcal += novo.getQuantidade() * novo.getKcalPorUnidadeMedida();
        }
        kcal += this.base.getQuantidade() * this.base.getKcalPorUnidadeMedida();
        return kcal;
    }

    public void getDetalhes() {
        System.out.println();
        System.out.println("***** Pizzaria JAVA *****");
        System.out.println();
        System.out.println("Codigo: " + this.getCodigo());
        System.out.println("Tipo: " + getTipoPizza());
        System.out.println("Nome : " + this.getNome());
        System.out.println("Descricao: " + this.getDescricao());
        System.out.println("Preco: " + this.getPreco() + "€");
        System.out.println("Tamanho: " + this.getTamanho());
        System.out.println("Tipo de massa " + this.base.getBase());
        System.out.println("Informacao Nutricional: " + calcularKcalPizza() + "kcal");
        System.out.println("Ingredientes: ");
        int i = 1;
        for (IngredientePizza ingrediente : this.getIngredientes()) {
            System.out.println("Ingrediente " + i++ + ": [id= " +
                    ingrediente.getCodigo() + " | nome= " +
                    ingrediente.getNome() + " | Calorias Extra: " +
                    ingrediente.getKcalIngrediente() + "kcal | Quantidade: " +
                    ingrediente.getQuantidade()  + " " + ingrediente.getUnidadeMedida() + "]");
        }
    }

    private String getTipoPizza() {
        int carne = 0, frutomar = 0, queijo = 0, vegetal = 0;
        for (IngredientePizza novo : this.ingredientes){
            if(novo instanceof Carne)
                carne++;
            if(novo instanceof FrutoMar)
                frutomar++;
            if(novo instanceof Queijo)
                queijo++;
            if(novo instanceof Vegetal)
                vegetal++;
        }
        if (carne > 0 && frutomar == 0 && queijo == 0 && vegetal == 0)
            return "Pizza de Carne";
        if (carne == 0 && frutomar > 0 && queijo == 0 && vegetal == 0)
            return "Pizza do Mar";
        if (carne == 0 && frutomar == 0 && queijo == 0 && vegetal > 0)
            return "Pizza Vegetariana";
        if (carne > 0 && frutomar > 0 && queijo > 0 && vegetal > 0)
            return "Pizza Completa";
        else
            return "Pizza Mista";
    }


    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public TamPizza getTamanho() {
        return tamanho;
    }

    public ArrayList<IngredientePizza> getIngredientes() {
        return ingredientes;
    }
}
