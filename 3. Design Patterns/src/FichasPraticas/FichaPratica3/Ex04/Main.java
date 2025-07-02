package FichasPraticas.FichaPratica3.Ex04;

import FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy.BlackAndWhiteFilterStrategy;
import FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy.SepiaFilterStrategy;
import FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy.VintageFilterStrategy;
import FichasPraticas.FichaPratica3.Ex04.ImageProcessor.ImageProcessor;

public class Main {
    public static void main(String[] args) {
        ImageProcessor processor = new ImageProcessor(new BlackAndWhiteFilterStrategy());
        processor.applyFilter("imagem1.jpg");

        processor = new ImageProcessor(new SepiaFilterStrategy());
        processor.applyFilter("imagem2.jpg");

        processor = new ImageProcessor(new VintageFilterStrategy());
        processor.applyFilter("imagem3.jpg");
    }
}