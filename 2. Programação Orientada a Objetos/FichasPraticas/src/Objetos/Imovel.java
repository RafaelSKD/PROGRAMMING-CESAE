// The Imovel class represents a property with details such as address, type, finishing, area, number of rooms, and pool area.
// It allows calculating the estimated value of the property based on its characteristics and comparing it with another property.

package Objetos;

import Enums.TipoAcabamentoImovel; // Enum that represents the type of finishing (e.g., new, used, needs renovation)
import Enums.TipoImovel;           // Enum that represents the type of property (e.g., apartment, house, mansion)

public class Imovel {
    private String rua;                         // Street name where the property is located
    private int numeroPorta;                    // Door number of the property
    private String cidade;                      // City where the property is located
    private TipoImovel tipo;                    // Property type (APARTAMENTO, CASA, MANSAO)
    private TipoAcabamentoImovel acabamento;    // Type of finishing (e.g., NOVA, USADA, PARA_RESTAURO)
    private double areaTotal;                   // Total area of the property in square meters
    private int numeroQuartos;                  // Number of bedrooms
    private int numeroCasasDeBanho;             // Number of bathrooms
    private double areaPiscina;                 // Pool area in square meters

    // Constructor that initializes all the attributes of the property
    public Imovel(String rua, int numeroPorta, String cidade, TipoImovel tipo, TipoAcabamentoImovel acabamento, double areaTotal, int numeroQuartos, int numeroCasasDeBanho, double areaPiscina) {
        this.rua = rua;
        this.numeroPorta = numeroPorta;
        this.cidade = cidade;
        this.tipo = tipo;
        this.acabamento = acabamento;
        this.areaTotal = areaTotal;
        this.numeroQuartos = numeroQuartos;
        this.numeroCasasDeBanho = numeroCasasDeBanho;
        this.areaPiscina = areaPiscina;
    }

    // Returns a string with all the property details, including its calculated value
    public String getInfo() {
        return  "\nrua= " + rua +
                "\nnumeroPorta= " + numeroPorta +
                "\ncidade= " + cidade +
                "\ntipo= " + tipo +
                "\nacabamento= " + acabamento +
                "\nareaTotal= " + areaTotal +
                "\nnumeroQuartos= " + numeroQuartos +
                "\nnumeroCasasDeBanho= " + numeroCasasDeBanho +
                "\nareaPiscina= " + areaPiscina +
                "\nValor do Imóvel= " + this.calcularValor() + "EUR";
    }

    // Sets or updates the property finishing type
    public void setAcabamento(TipoAcabamentoImovel acabamento) {
        this.acabamento = acabamento;
    }

    // Calculates the property value based on its type, area, finishing, number of bedrooms, and pool area
    public double calcularValor(){
        switch (tipo) {
            case APARTAMENTO:
                return addValorPiscina(addValorQuartos(addValorDesconto(this.areaTotal * 1000)));
            case CASA:
                return addValorPiscina(addValorQuartos(addValorDesconto(this.areaTotal * 3000)));
            case MANSAO:
                return addValorPiscina(addValorQuartos((addValorDesconto(this.areaTotal * 5000))));
        }
        return 0.0;
    }

    // Applies discount or markup to the base value depending on the finishing type
    double addValorDesconto(double valorImovel) {
        switch (this.acabamento){
            case PARA_RESTAURO:
                return valorImovel * 0.5; // 50% discount
            case USADA:
                return valorImovel * 0.10; // 10% discount
            case NOVA:
                return valorImovel; // No discount or markup
            case NOVA_COM_ALTO_ACABAMENTO:
                return valorImovel * 1.25; // 25% increase
        }
        return 0.0;
    }

    // Adds value to the property based on the number of bedrooms
    double addValorQuartos(double valorImovel){
        return valorImovel + this.numeroQuartos * 7500;
    }

    // Adds value to the property based on the pool area
    double addValorPiscina(double valorImovel){
        return valorImovel + this.areaPiscina * 1000;
    }

    // Compares this property with another one and returns the one with the higher value
    public Imovel compararImoveis(Imovel outroImovel) {
        if (this.calcularValor() > outroImovel.calcularValor()) {
            return this;
        } else if (outroImovel.calcularValor() > this.calcularValor()) {
            return outroImovel;
        } else {
            return null; // Properties have the same value
        }
    }
}
