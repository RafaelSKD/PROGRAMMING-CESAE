package FichasPraticas.FichaPratica3.Ex04.ImageProcessor;

import FichasPraticas.FichaPratica3.Ex04.ImageFilterStrategy.ImageFilterStrategy;

public class ImageProcessor {
    private ImageFilterStrategy FS;

    public ImageProcessor(ImageFilterStrategy FS) {
        this.FS = FS;
    }

    public void applyFilter(String str){
        FS.apply(str);
    }
}
