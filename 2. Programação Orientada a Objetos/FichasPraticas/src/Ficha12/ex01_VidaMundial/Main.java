package Ficha12.ex01_VidaMundial;

import Ficha12.ex01_VidaMundial.Enums.DietaAnimal;
import Ficha12.ex01_VidaMundial.Enums.FamiliaPlantas;
import Ficha12.ex01_VidaMundial.Objetos.MeioAmbiente.MeioAmbiente;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Animal;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Inseto;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Planta;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MeioAmbiente ambiente = new MeioAmbiente("Floresta Amazônica", 75.5);

// Insetos
        Inseto inseto1 = new Inseto("Formiga", "Solenopsis", "Brasil", 1, false);
        Inseto inseto2 = new Inseto("Vespa", "Vespula", "México", 2, true);
        Inseto inseto3 = new Inseto("Besouro", "Scarabaeus", "Egito", 3, false);
        Inseto inseto4 = new Inseto("Mosquito", "Aedes", "Índia", 1, true);
        Inseto inseto5 = new Inseto("Cigarra", "Magicicada", "EUA", 5, false);
        Inseto inseto6 = new Inseto("Gafanhoto", "Caelifera", "China", 2, false);
        Inseto inseto7 = new Inseto("Mariposa", "Saturniidae", "Peru", 3, false);
        Inseto inseto8 = new Inseto("Grilo", "Gryllidae", "Brasil", 1, false);
        Inseto inseto9 = new Inseto("Barata", "Blattodea", "Austrália", 4, false);
        Inseto inseto10 = new Inseto("Escorpião", "Scorpiones", "Marrocos", 6, true);

// Plantas
        Planta planta1 = new Planta("Girassol", "Helianthus", "Brasil", 1, FamiliaPlantas.FLORES, 2);
        Planta planta2 = new Planta("Dente-de-leão", "Taraxacum", "França", 2, FamiliaPlantas.ERVAS, 1);
        Planta planta3 = new Planta("Drosera", "Drosera capensis", "África do Sul", 3, FamiliaPlantas.COMEINSETOS, 4);
        Planta planta4 = new Planta("Nepenthes", "Nepenthes rajah", "Malásia", 4, FamiliaPlantas.COMEINSETOS, 5);
        Planta planta5 = new Planta("Camomila", "Matricaria chamomilla", "Alemanha", 2, FamiliaPlantas.ERVAS, 1);
        Planta planta6 = new Planta("Tulipa", "Tulipa gesneriana", "Holanda", 3, FamiliaPlantas.FLORES, 2);
        Planta planta7 = new Planta("Baobá", "Adansonia", "Madagáscar", 15, FamiliaPlantas.ARVORES, 3);
        Planta planta8 = new Planta("Lavanda", "Lavandula", "Espanha", 4, FamiliaPlantas.ERVAS, 2);
        Planta planta9 = new Planta("Ipê", "Handroanthus", "Brasil", 8, FamiliaPlantas.ARVORES, 3);
        Planta planta10 = new Planta("Orvalhinha", "Drosera rotundifolia", "Canadá", 1, FamiliaPlantas.COMEINSETOS, 4);


// Animais
        Animal animal1 = new Animal("Leão", "Panthera leo", "África do Sul", 8, true, 190.5, 70.0, DietaAnimal.CARNIVORO, "Rugido");
        Animal animal2 = new Animal("Elefante", "Loxodonta", "Quênia", 25, false, 5400.0, 80.0, DietaAnimal.HERBIVORO, "Bramido");
        Animal animal3 = new Animal("Urso", "Ursus arctos", "Rússia", 10, true, 300.0, 60.0, DietaAnimal.OMNIVORO, "Rugido");
        Animal animal4 = new Animal("Cobra", "Python regius", "Índia", 5, false, 25.0, 20.0, DietaAnimal.CARNIVORO, "Sibilo");
        Animal animal5 = new Animal("Papagaio", "Amazona", "Brasil", 3, false, 1.5, 55.0, DietaAnimal.HERBIVORO, "Fala");
        Animal animal6 = new Animal("Macaco", "Cebus", "Peru", 7, true, 12.0, 75.0, DietaAnimal.OMNIVORO, "Grito");
        Animal animal7 = new Animal("Cavalo", "Equus ferus", "EUA", 6, false, 400.0, 50.0, DietaAnimal.HERBIVORO, "Relincho");
        Animal animal8 = new Animal("Tigre", "Panthera tigris", "Índia", 9, true, 220.0, 68.0, DietaAnimal.CARNIVORO, "Rugido");
        Animal animal9 = new Animal("Cachorro", "Canis lupus", "Alemanha", 4, true, 30.0, 60.0, DietaAnimal.OMNIVORO, "Latido");
        Animal animal10 = new Animal("Gato", "Felis catus", "Egito", 3, false, 4.0, 65.0, DietaAnimal.CARNIVORO, "Miado");

// Adicionar tudo ao ambiente
        ambiente.addSerVivo(inseto1);
        ambiente.addSerVivo(inseto2);
        ambiente.addSerVivo(inseto3);
        ambiente.addSerVivo(inseto4);
        ambiente.addSerVivo(inseto5);
        ambiente.addSerVivo(inseto6);
        ambiente.addSerVivo(inseto7);
        ambiente.addSerVivo(inseto8);
        ambiente.addSerVivo(inseto9);
        ambiente.addSerVivo(inseto10);
        ambiente.addSerVivo(planta1);
        ambiente.addSerVivo(planta2);
        ambiente.addSerVivo(planta3);
        ambiente.addSerVivo(planta4);
        ambiente.addSerVivo(planta5);
        ambiente.addSerVivo(planta6);
        ambiente.addSerVivo(planta7);
        ambiente.addSerVivo(planta8);
        ambiente.addSerVivo(planta9);
        ambiente.addSerVivo(planta10);
        ambiente.addSerVivo(animal1);
        ambiente.addSerVivo(animal2);
        ambiente.addSerVivo(animal3);
        ambiente.addSerVivo(animal4);
        ambiente.addSerVivo(animal5);
        ambiente.addSerVivo(animal6);
        ambiente.addSerVivo(animal7);
        ambiente.addSerVivo(animal8);
        ambiente.addSerVivo(animal9);
        ambiente.addSerVivo(animal10);

        ambiente.simulador(10);
    }
}
