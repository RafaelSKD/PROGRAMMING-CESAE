package FichasPraticas.FichaPratica2.Ex02.Tacos;

public class Vegetariano extends Taco{
    public Vegetariano() {
        super();
    }

    @Override
    public void Prepare() {
        super.Prepare();
        System.out.print("Vegetariano\n");
    }

    @Override
    public void Bake() {
        super.Bake();
        System.out.print("Vegetariano\n");
    }

    @Override
    public void Box() {
        super.Box();
        System.out.print("Vegetariano\n");

    }
}
