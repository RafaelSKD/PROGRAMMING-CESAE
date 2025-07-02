package FichasPraticas.FichaPratica2.Ex01;

import FichasPraticas.FichaPratica2.Ex01.Produtos.Product;
import FichasPraticas.FichaPratica2.Ex01.Produtos.ProductFactory;

public class Main {
    public static void main(String[] args) {
        Product book = ProductFactory.createProduct("book");
        Product electronics = ProductFactory.createProduct("electronics");
        Product clothing = ProductFactory.createProduct("clothing");
        book.display();
        electronics.display();
        clothing.display();
    }
}

