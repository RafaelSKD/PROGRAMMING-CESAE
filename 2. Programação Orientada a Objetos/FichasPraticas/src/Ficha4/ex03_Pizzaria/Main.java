package Ficha4.ex03_Pizzaria;

import Ficha4.ex03_Pizzaria.Enum.*;
import Ficha4.ex03_Pizzaria.Objetos.*;

public class Main {
    public static void main(String[] args) {
// Ingredientes
//  //  Bases
        Base massaAlta = new Base(
                301,
                "Massa Alta Clássica",
                UnidadeDeMedida.GRAMAS,
                0.05,
                250.0,
                PizzaBase.MASSAALTA
        );

        Base massaFina = new Base(
                302,
                "Massa Fina Crocante",
                UnidadeDeMedida.GRAMAS,
                2.0,
                180.0,
                PizzaBase.MASSAFINA
        );
//  // Carne
        Carne pepperoni = new Carne(
                1,
                "Pepperoni Frances",
                UnidadeDeMedida.GRAMAS,
                300.0,
                5,
                OrigemProduto.IMPORTADO,
                TiposCarne.PEPPERONI
        );
        Carne presunto = new Carne(
                2,
                "Presunto de Porco Preto",
                UnidadeDeMedida.GRAMAS,
                150.0,
                6,
                OrigemProduto.NACIONAL,
                TiposCarne.PRESUNTO
        );

        Carne frango = new Carne(
                3,
                "Frango Desfiado",
                UnidadeDeMedida.GRAMAS,
                120.0,
                9,
                OrigemProduto.NACIONAL,
                TiposCarne.FRANGO_DESFIADO
        );

//  // Queijo
        Queijo mozzarella = new Queijo(
                4,
                "Mozzarella",
                UnidadeDeMedida.GRAMAS,
                280.0,
                10,
                OrigemProduto.NACIONAL,
                TiposQueijo.MOSSARELLA
        );

        Queijo gorgonzola = new Queijo(
                5,
                "Gorgonzola",
                UnidadeDeMedida.GRAMAS,
                340.0,
                7,
                OrigemProduto.IMPORTADO,
                TiposQueijo.GORGONZOLA
        );

//  // Vegetal
        Vegetal tomate = new Vegetal(
                6,
                "Tomate cereja",
                UnidadeDeMedida.GRAMAS,
                20.0,
                25,
                OrigemProduto.NACIONAL,
                TiposVegetais.TOMATE
        );

        Vegetal cebola = new Vegetal(
                7,
                "Cebola Roxa",
                UnidadeDeMedida.GRAMAS,
                15.0,
                30,
                OrigemProduto.NACIONAL,
                TiposVegetais.CEBOLA
        );

//  // Fruto do Mar
        FrutoMar atum = new FrutoMar(
                8,
                "Atum Bluefin",
                UnidadeDeMedida.GRAMAS,
                130.0,
                6,
                OrigemProduto.NACIONAL,
                TiposFrutoMar.ATUM
        );

        FrutoMar camarao = new FrutoMar(
                9,
                "Camarão Tigre",
                UnidadeDeMedida.GRAMAS,
                100.0,
                5,
                OrigemProduto.IMPORTADO,
                TiposFrutoMar.CAMARAO
        );

// Pizzas
//  // Pizza só de carne
        Pizza carnivora = new Pizza(
                201,
                "Carnívora Suprema",
                "Só para os amantes de carne – uma explosão de sabor!",
                12.99,
                TamPizza.GRANDE,
                massaAlta
        );
        carnivora.adicionarIngrediente(pepperoni);
        carnivora.adicionarIngrediente(presunto);
        carnivora.adicionarIngrediente(frango);

// Pizza só com vegetais
        Pizza vegetariana = new Pizza(
                202,
                "Verde Vida",
                "Uma seleção fresca e crocante dos melhores vegetais.",
                10.99,
                TamPizza.MEDIA,
                massaAlta
        );
        vegetariana.adicionarIngrediente(tomate);
        vegetariana.adicionarIngrediente(cebola);

// Pizza só com frutos do mar
        Pizza maritima = new Pizza(
                203,
                "Delícia do Mar",
                "Para os fãs do oceano – uma combinação sofisticada.",
                14.99,
                TamPizza.GRANDE,
                massaFina
        );
        maritima.adicionarIngrediente(atum);
        maritima.adicionarIngrediente(camarao);

// Pizza com um ingrediente de cada tipo
        Pizza quatroElementos = new Pizza(
                204,
                "Quatro Elementos",
                "Terra, mar, campo e horta em perfeita harmonia.",
                15.49,
                TamPizza.PEQUENA,
                massaAlta
        );
        quatroElementos.adicionarIngrediente(pepperoni);      // carne
        quatroElementos.adicionarIngrediente(mozzarella);     // queijo
        quatroElementos.adicionarIngrediente(tomate);         // vegetal
        quatroElementos.adicionarIngrediente(atum);           // fruto do mar
        quatroElementos.adicionarIngrediente(gorgonzola);     // queijo
        quatroElementos.adicionarIngrediente(camarao);        // ERRO > de 5 ingredientes

// Pizza com mais de um ingrediente mas sem usar todos os tipos (ex: carne + queijo apenas)
        Pizza duoSabor = new Pizza(
                205,
                "Duo Sabor",
                "A clássica combinação de carne e queijo que nunca falha.",
                11.49,
                TamPizza.MEDIA,
                massaFina
        );
        duoSabor.adicionarIngrediente(presunto);
        duoSabor.adicionarIngrediente(frango);
        duoSabor.adicionarIngrediente(gorgonzola);

        // ver detalhes de cada pizza
        carnivora.getDetalhes();
        vegetariana.getDetalhes();
        maritima.getDetalhes();
        quatroElementos.getDetalhes();
        duoSabor.getDetalhes();

        // substituir quantidade de um ingrediente a ultima pizza e voltar a exibir detalhes
        duoSabor.editarQuantidadeIngrediente(666, 3);
        duoSabor.getDetalhes();

        // remover ingrediente
        duoSabor.removerIngrediente(3);
        duoSabor.getDetalhes();
    }

}
