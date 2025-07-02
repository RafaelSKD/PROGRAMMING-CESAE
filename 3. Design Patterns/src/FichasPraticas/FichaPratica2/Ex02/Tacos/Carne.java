package FichasPraticas.FichaPratica2.Ex02.Tacos;

public class Carne extends Taco{
    public Carne() {
        super();
    }

    @Override
    public void Prepare() {
        super.Prepare();
        System.out.print("de Carne\n");
    }

    @Override
    public void Bake() {
        super.Bake();
        System.out.print("de Carne\n");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.print("de Carne\n");

    }
}
