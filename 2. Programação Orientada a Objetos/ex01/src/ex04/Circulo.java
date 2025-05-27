package ex04;

public class Circulo {
    private String cor;
    private double raio;

    public Circulo(String cor, double raio){
        this.cor = cor;
        this.raio = raio;
    }

    public double perimetroCirculo(){
        return(2 * Math.PI * this.raio);
    }

    public double areaCirculo(){
        return(Math.PI * this.raio * this.raio);
    }
}
