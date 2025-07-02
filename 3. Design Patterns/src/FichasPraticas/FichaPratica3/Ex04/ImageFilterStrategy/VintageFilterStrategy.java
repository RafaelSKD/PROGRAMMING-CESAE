package FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy;

public class VintageFilterStrategy implements ImageFilterStrategy{

    @Override
    public void apply(String str) {
        System.out.println(str + " Vintage aplicado com sucesso!");
    }
}