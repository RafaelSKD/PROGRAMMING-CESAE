package FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy;

public class SepiaFilterStrategy implements ImageFilterStrategy{

    @Override
    public void apply(String str) {
        System.out.println(str + " Sepia aplicado com sucesso!");
    }
}