package FichasPraticas.FichaPratica2.Ex02.Tacos;

public class Frango extends Taco{
    public Frango() {
        super();
    }

    @Override
    public void Prepare() {
        super.Prepare();
        System.out.print("de Frango\n");
    }

    @Override
    public void Bake() {
        super.Bake();
        System.out.print("de Frango\n");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.print("de Frango\n");

    }
}
