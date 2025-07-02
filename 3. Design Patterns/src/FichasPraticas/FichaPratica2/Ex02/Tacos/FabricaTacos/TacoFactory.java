package FichasPraticas.FichaPratica2.Ex02.Tacos.FabricaTacos;

import FichasPraticas.FichaPratica2.Ex02.Tacos.Carne;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Frango;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Taco;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Vegetariano;

public class TacoFactory {
    public static Taco criarTaco(String tipo){
        switch (tipo.toLowerCase()){
            case "carne":
                return new Carne();
            case "vegetariano":
                return new Vegetariano();
            case "frango":
                return new Frango();
            default:
                System.out.println("Nao existe esse tipo!");
                return null;
        }
    }
}
