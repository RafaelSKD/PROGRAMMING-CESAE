package FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy;

public class BlackAndWhiteFilterStrategy implements ImageFilterStrategy{

    @Override
    public void apply(String str) {
        System.out.println(str + " BW aplicado com sucesso!");
    }
}
