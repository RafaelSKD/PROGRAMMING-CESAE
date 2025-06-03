package Ficha3;

import Enums.MarcaBarco;
import Objetos.BarcoPesca;
import Objetos.Marisco;
import Objetos.Peixe;

public class ex03 {
    public static void main(String[] args) {
        // Create a fishing boat
        BarcoPesca barco = new BarcoPesca("Poseidon", "Azul", "2015", 5, 500.0, MarcaBarco.QUICKSILVER);

        // Create some fish
        Peixe peixe1 = new Peixe("Sardinha", 50.0, 3.5);  // 50kg, €3.5/kg
        Peixe peixe2 = new Peixe("Atum", 320.0, 5.0);     // 120kg, €5/kg
        Peixe peixe3 = new Peixe("Robalo", 90.0, 4.0);    // 90kg, €4/kg

        // Create some seafood
        Marisco marisco1 = new Marisco("Camarão", 20.0, 8.0); // 20kg, €8/kg
        Marisco marisco2 = new Marisco("Lula", 30.0, 6.0);     // 30kg, €6/kg

        // Try fishing all items
        barco.pescarPeixe(peixe1); // Should succeed
        barco.pescarPeixe(peixe2); // Should succeed
        barco.pescarPeixe(peixe3); // Should succeed
        barco.pescarPeixe(peixe3); // Might fail due to load limit

        barco.pescarMarisco(marisco1); // Should succeed
        barco.pescarMarisco(marisco2); // Might fail due to load limit

        // Show current load
        System.out.println("\nCarga atual: " + barco.cargaAtual() + " kg");

        // Calculate total value of catch
        System.out.println("\nValor total da pesca: €" + barco.calcularTotal());

        // Calculate salary per crew member
        System.out.println("\nSalário por tripulante: €" + barco.salarioTripulacao());

        // Drop a fish and a seafood by index
        barco.largarPeixe(0);
        barco.largarMarisco(0);

        // Show updated status
        System.out.println("\nApós largar alguns produtos:");
        System.out.println("Carga atual: " + barco.cargaAtual() + " kg");
        System.out.println("Valor total da pesca: €" + barco.calcularTotal());
        System.out.println("Salário por tripulante: €" + barco.salarioTripulacao());
    }
}
