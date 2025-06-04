package Ficha12.ex01_VidaMundial.Objetos.MeioAmbiente;

import Ficha12.ex01_VidaMundial.Enums.DietaAnimal;
import Ficha12.ex01_VidaMundial.Enums.FamiliaPlantas;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Animal;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Inseto;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.Planta;
import Ficha12.ex01_VidaMundial.Objetos.SerVivo.SerVivo;

import java.util.ArrayList;
import java.util.Random;

public class MeioAmbiente {
    private String nome;
    private double agua; // litros de agua no meio
    private ArrayList<SerVivo> seresVivos = new ArrayList<SerVivo>();
    private SerVivo ultimoVivo = null;

    public MeioAmbiente(String nome, double agua) {
        this.nome = nome;
        this.agua = agua;
    }

    public boolean plantaBebe(int indexPlanta){
        SerVivo planta = seresVivos.get(indexPlanta);

        if (planta instanceof Planta){
            if (((Planta) planta).getFamilia() == FamiliaPlantas.ARVORES){
                if (this.agua >= 1){ // arvores bebem 1L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Arvore " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 1l de agua");
                    this.agua -= 1; // retira 1L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n");
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Arvore " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente");
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.FLORES){
                if (this.agua >= 0.1){ // flores bebem 0.1L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Flor " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.1l de agua");
                    this.agua -= 0.1; // retira 0.1L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n");
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Flor " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente");
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.ERVAS){
                if (this.agua >= 0.25){ // ervas bebem 0.25L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Erva " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.25l de agua");
                    this.agua -= 0.25; // retira 0.25L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n");
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Erva " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente");
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.COMEINSETOS){
                if (this.agua >= 0.15){ // comeinsetos bebem 0.15L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Come Insetos " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.15l de agua");
                    this.agua -= 0.15; // retira 0.15L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n");
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Come Insetos " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente");
                return false;
            }
        }
        System.out.println("Erro - Ser vivo fornecido nao e uma planta");
        return false;
    }

    public boolean plantaComeInsetos(int indexPlanta){
        SerVivo planta = seresVivos.get(indexPlanta);

        if (planta instanceof Planta){
            if (((Planta) planta).getFamilia() == FamiliaPlantas.COMEINSETOS){
                for (SerVivo serVivo : this.seresVivos){
                    if (serVivo instanceof Inseto){
                        System.out.println("a Planta ComeInsetos " + planta.getNome() + " da especie " +
                                planta.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                "da especie " + serVivo.getEspecie());
                        seresVivos.remove(serVivo);
                        return true;
                    }
                }
                System.out.println("a Planta ComeInsetos " + planta.getNome() + " da especie " +
                        planta.getEspecie() + " nao conseguiu comer nenhum inseto\n" +
                        "MOTIVO : Nao existem insetos disponiveis no meio ambiente");
                return false;
            }
            System.out.println("A planta fornecida nao pertence a classe de Comedoras de Insetos");
            return false;
        }
        System.out.println("O ser vivo fornecido nao e uma planta");
        return false;
    }

    public void plantaAbanaComVento(int indexPlanta){
        System.out.println("Está muito vento");
    }

    public void animalfazBarulho(int indexAnimal){
        SerVivo animal = seresVivos.get(indexAnimal);
        if (animal instanceof Animal) {
            System.out.println(((Animal) animal).getBarulho());
        }
    }

    public void animalMovimenta(int indexAnimal){
        SerVivo animal = seresVivos.get(indexAnimal);
        System.out.println("O " + animal.getNome() + " movimentou-se");
    }

    public boolean animalBebe(int indexAnimal){
        SerVivo animal = seresVivos.get(indexAnimal);
        double agua = 0;
        if (animal instanceof Animal) {
            agua = (((Animal) animal).getPeso()) * 0.025; // bebe 0.025L por cada kg de peso
            if (this.agua >= agua){ // verificar se existe agua suficiente
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() + "bebeu " + agua + "L de agua");
                this.agua -= agua; // retira agua bebida
                System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n");
                return true;
            }
            System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
            System.out.println("O Animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                    "nao conseguiu beber agua\nMOTIVO: Agua insuficiente");
            return false;
        }
        System.out.println("O ser vivo fornecido nao e da classe Animal");
        return false;
    }

    public boolean animalCome(int indexAnimal){
        SerVivo animal = seresVivos.get(indexAnimal);
        if (animal instanceof Animal) {
            boolean fome = (((Animal) animal).isFome());
            if (fome) {
                if ((((Animal) animal).getDieta()) == DietaAnimal.CARNIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Inseto) {
                            if (!((Inseto) serVivo).isVenenoso()){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie());
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nATENCAO : O inseto e venenoso\n" +
                                        "O " + animal.getNome() + " MORREU! ");
                                seresVivos.remove(serVivo);
                                this.ultimoVivo = animal;
                                seresVivos.remove(animal);
                                return false;
                            }
                        }
                        if (serVivo instanceof Animal && serVivo != animal) {  // evitar que o animal coma a si mesmo
                            if (comerAnimal(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie());
                                this.ultimoVivo = serVivo;
                                seresVivos.remove(serVivo);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : O animal tem um grau de defesa superior ao ataque do animal");
                                ((Animal) animal).setFome(true);
                                return false;
                            }
                        }
                    }
                    System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                            " nao conseguiu comer nenhum inseto ou animal\nMOTIVO : Nao existem insetos ou animais disponiveis no meio ambiente");
                }
                if ((((Animal) animal).getDieta()) == DietaAnimal.HERBIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Planta) {
                            if (comerPlanta(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie());
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                return true;
                            }
                            else
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : A planta tem um grau de defesa superior a inteligencia do animal");
                        }
                    }
                    System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                            " nao conseguiu comer nenhuma planta\nMOTIVO : Nao existem plantas disponiveis no meio ambiente");
                }
                if ((((Animal) animal).getDieta()) == DietaAnimal.OMNIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Planta) {
                            if (comerPlanta(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie());
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                return true;
                            }
                            else
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : A planta tem um grau de defesa superior a inteligencia do animal");
                        }
                        if (serVivo instanceof Animal && serVivo != animal) {  // evitar que o animal coma a si mesmo
                            if (comerAnimal(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie());
                                this.ultimoVivo = serVivo;
                                seresVivos.remove(serVivo);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : O animal tem um grau de defesa superior ao ataque do animal");
                                ((Animal) animal).setFome(true);
                                return false;
                            }
                        }
                    }
                }

            } else
                System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() + " esta de barriga cheia!");
            ((Animal) animal).setFome(true);
            return false;
        }
        System.out.println("O ser vivo fornecido nao e da classe Animal");
        return false;
    }

    private boolean comerAnimal(SerVivo animal, SerVivo serVivo) {
        double animalAtaque = ((Animal) animal).getPeso() + (((Animal) animal).getInteligencia() * 2);
        double animalDefesa = ((Animal) serVivo).getPeso() + (((Animal) serVivo).getInteligencia() * 2);
        if (animalAtaque > animalDefesa)
            return true;
        if (animalAtaque < animalDefesa)
            return false;
        return false;
    }

    private boolean comerPlanta(SerVivo animal, SerVivo planta) { //verifica se a inteligencia do animal permite comer a planta
        int forca = (int) ((((Animal) animal).getInteligencia()) / 20);
        if (((Animal) animal).getInteligencia() >= 95)
            forca = 5;
        if (forca >= ((Planta) planta).getGrauDefesa())
            return true;
        return false;
    }

    public void insetoChateia(){
        Random rd = new Random();
        int ramdom = rd.nextInt(3);
        if (ramdom == 0)
            System.out.println("Bzzzz bzzzz");
        if (ramdom == 1)
            System.out.println("Tic tic tic tic");
        if (ramdom == 2)
            System.out.println("Pssssssss");
    }

    public void addSerVivo(SerVivo novo){
        this.seresVivos.add(novo);
    }

    public void listarTodos(){
        for (SerVivo serVivo : this.seresVivos){
            serVivo.exibirDetalhes();
        }
    }

    private int acontecimento (int quantidade){
        Random rd = new Random();
        return rd.nextInt(quantidade) + 1;
    }

    private int randomSerVivo(String tipoSerVivo){
        SerVivo ser = null;
        switch (tipoSerVivo){
            case "Animal":
                do{
                    ser = seresVivos.get(acontecimento(this.seresVivos.size()-1));
                }while (!(ser instanceof Animal));
                break;
            case "Planta":
                do{
                    ser = seresVivos.get(acontecimento(this.seresVivos.size()-1));
                }while (!(ser instanceof Planta));
                break;
            case "Inseto":
                do{
                    ser = seresVivos.get(acontecimento(this.seresVivos.size()-1));
                }while (!(ser instanceof Inseto));
                break;
            default:
                System.out.println("Tipo de ser vivo invalido");
                return -1;
        }
        return this.seresVivos.indexOf(ser);
    }

    private void acaoPlanta(int acao){
        switch (acao){
            case 1: // Planta abana
                plantaAbanaComVento(randomSerVivo("Planta"));
                break;
            case 2: // planta bebe
                plantaBebe(randomSerVivo("Planta"));
                break;
            case 3: // Planta come insetos
                plantaComeInsetos(randomSerVivo("Planta"));
                break;
            default:
                System.out.println("Acao invalida para planta");
        }
    }

    private void acaoAnimal(int acao){
        switch (acao){
            case 1: // Animal faz barulho
                animalfazBarulho(acontecimento(randomSerVivo("Animal")));
                break;
            case 2: // Animal movimenta
                animalMovimenta(acontecimento(randomSerVivo("Animal")));
                break;
            case 3: // Animal bebe
                animalBebe(acontecimento(randomSerVivo("Animal")));
                break;
            case 4: // Animal come
                animalCome(acontecimento(randomSerVivo("Animal")));
                break;
            default:
                System.out.println("Acao invalida para animal");
        }
    }

    private void catastrofe(int acao) {
        switch (acao){
            case 1: //  Seca: Diminui a água para metade
                this.agua /= 2;
                break;
            case 2: //  Chuvas: Aumenta a água para o dobro.
                this.agua *= 2;
                break;
            case 3: //  Erupção Vulcânica: Morrem metade das plantas e metade dos animais.
                thanos();
                break;
            default:
                System.out.println("Acao invalida para planta");
        }
    }

    private void thanos() {
        int animais = 0;
        int plantas = 0;

        for (SerVivo serVivo : this.seresVivos){
            if (serVivo instanceof Animal)
                animais++;
            if (serVivo instanceof Planta)
                plantas++;
        }
        animais /= 2;
        plantas /= 2;
        while (animais-- > 0){
            int i = randomSerVivo("Animal");
            this.ultimoVivo = this.seresVivos.get(i);
            this.seresVivos.remove(i);
        }

        while (plantas-- > 0)
            this.seresVivos.remove(randomSerVivo("Planta"));
        System.out.println("\nThanos estalou os dedos\n" +
                "Metade da populacao de plantas e animais foi morta por uma Erupcao Vulcanica\n");
    }

    public void simulador(int dias) throws InterruptedException {
        while (dias >= 0){ // roda os dias todos
            Thread.sleep(2000);
            System.out.println("Um novo dia comeca no " + this.nome + "\n");
            System.out.println("Animais vivos : \n");
            for (SerVivo serVivo : this.seresVivos){ // lista apenas nomes e especie para evitar demasiada info e mete todos os animais com fome
                System.out.println(serVivo.getNome() + " " + serVivo.getEspecie());
                if (serVivo instanceof Animal)
                    ((Animal) serVivo).setFome(true);
            }
            Thread.sleep(2000);
            cleanConsole();
            int momentos = 3; // o dia esta dividido em três momentos (manhã, tarde e noite)
            while (momentos >= 0){
                int acao = acontecimento(4);
                if (acao == 1){ //  Uma planta irá ter uma ação.
                    acaoPlanta(acontecimento(3));
                }
                if (acao == 2){ // Um animal irá ter uma ação.
                    acaoAnimal(acontecimento(4));
                }
                if (acao == 3){ // Um inseto irá ter uma ação.
                    insetoChateia();
                }
                if (acao == 4){ // Catástrofe natural.
                    catastrofe(acontecimento(3));
                }
                momentos--;
                Thread.sleep(3000);
                cleanConsole();
            }
            // final do dia
            Thread.sleep(2000);
            cleanConsole();
            System.out.println("Fim do dia\nAnimais com fome tentam comer!");
            Thread.sleep(2000);
            animaisComFomeTentamComer(dias);
            Thread.sleep(2000);
            cleanConsole();
            if (!this.seresVivos.isEmpty()){
                System.out.println("Seres que sobreviveram a mais um dia:");
                for (SerVivo serVivo : this.seresVivos) // lista apenas nomes e especie para evitar demasiada info
                    System.out.println(serVivo.getNome() + " " + serVivo.getEspecie());
            }
            else{
                cleanConsole();
                Thread.sleep(2000);
                System.out.println("MORRERAM TODOS!");
                Thread.sleep(2000);
                System.out.println("Ultimo a morrer foi :");
                this.ultimoVivo.exibirDetalhes();
            }
            dias--;
        }
    }

    private void animaisComFomeTentamComer(int dias) throws InterruptedException {
        ArrayList<Integer> Matadouro = new ArrayList<>();
        System.out.println("Fim do dia " + (dias - 30));
        System.out.println("Animais com fome tentam se alimentar um ultima vez hoje!");
        for (int i = 0; i < this.seresVivos.size(); i++){
            if (this.seresVivos.get(i) instanceof Animal){
                if (((Animal) this.seresVivos.get(i)).isFome()){
                    if ((!animalCome(this.seresVivos.indexOf(this.seresVivos.get(i))))){
                        this.ultimoVivo = this.seresVivos.get(i);
                        Matadouro.add(this.seresVivos.indexOf(this.seresVivos.get(i)));
                        i--;
                        System.out.println("Infelizmente ja passaram 24H e morreu a fome");
                        Thread.sleep(2000);
                    }
                }
            }
        }
        for (int i : Matadouro)
            this.seresVivos.remove(i);
    }

    public void cleanConsole(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}

