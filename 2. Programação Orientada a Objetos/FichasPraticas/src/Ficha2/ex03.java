package Ficha2;

import Enums.TipoAnimal;
import Objetos.Animal;

// The ex03 class demonstrates the use of the Animal class.
// It creates an Animal (a bear), makes it produce a sound, and simulates eating both an invalid and a valid food item.

public class ex03 {
    public static void main(String[] args) {
        // Creating a bear with a diet of meat, fruit, honey, vegetables, and insects
        Animal urso = new Animal(
                "Winnie the Pooh",
                "Urso",
                "Russia",
                300,
                new String[]{"Carne", "Fruta", "Mel", "Vegetais", "Insetos"},
                TipoAnimal.MAMIFERO
        );

        // Bear makes a sound based on its type (MAMIFERO)
        urso.fazerBarulho();

        // Attempt to feed the bear something not in its diet
        urso.comer("Humanos", 80);

        // Feed the bear something it accepts (Mel)
        urso.comer("Mel", 50);
    }
}
