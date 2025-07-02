package FichasPraticas.FichaPratica2.Ex03.Documento;

import FichasPraticas.FichaPratica2.Ex02.Tacos.Carne;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Frango;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Taco;
import FichasPraticas.FichaPratica2.Ex02.Tacos.Vegetariano;

public class FabricaDocumentos {
    public static Documento criarDoc(String tipo, String autor, String nome){
        switch (tipo.toLowerCase()){
            case "txt":
                return new TextoSimples(autor, nome, tipo);
            case "pptx":
                return new Apresentacoes(autor, nome, tipo);
            case "csv":
                return new FolhasDeCalculo(autor, nome, tipo);
            default:
                System.out.println("Nao existe esse tipo!");
                return null;
        }
    }
}
