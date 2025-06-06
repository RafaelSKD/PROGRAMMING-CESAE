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

    public boolean plantaBebe(int indexPlanta) throws InterruptedException {
        SerVivo planta = seresVivos.get(indexPlanta);
        cleanConsole();
        if (planta instanceof Planta){
            if (((Planta) planta).getFamilia() == FamiliaPlantas.ARVORES){
                if (this.agua >= 1){ // arvores bebem 1L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Arvore " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 1l de agua");
                    this.agua -= 1; // retira 1L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n\n\n\n\n");
                    Thread.sleep(2000);
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Arvore " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente\n\n\n\n\n");
                Thread.sleep(2000);
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.FLORES){
                if (this.agua >= 0.1){ // flores bebem 0.1L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Flor " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.1l de agua");
                    this.agua -= 0.1; // retira 0.1L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n\n\n\n\n\n");
                    Thread.sleep(2000);
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Flor " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente\n\n\n\n\n");
                Thread.sleep(2000);
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.ERVAS){
                if (this.agua >= 0.25){ // ervas bebem 0.25L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Erva " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.25l de agua");
                    this.agua -= 0.25; // retira 0.25L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n\n\n\n\n");
                    Thread.sleep(2000);
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Erva " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente\n\n\n\n\n");
                Thread.sleep(2000);
                return false;
            }
            if (((Planta) planta).getFamilia() == FamiliaPlantas.COMEINSETOS){
                if (this.agua >= 0.15){ // comeinsetos bebem 0.15L
                    System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                    System.out.println("A Come Insetos " + planta.getNome() + " da especie " + planta.getEspecie() + "bebeu 0.15l de agua");
                    this.agua -= 0.15; // retira 0.15L de agua
                    System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n\n\n\n\n");
                    Thread.sleep(2000);
                    return true;
                }
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("A Come Insetos " + planta.getNome() + " da especie " + planta.getEspecie() +
                        "nao conseguiu beber agua\nMOTIVO: Agua insuficiente\n\n\n\n\n");
                Thread.sleep(2000);
                return false;
            }
            return false;
        }
        System.out.println("Erro - Ser vivo fornecido nao e uma planta\n\n\n\n\n");
        Thread.sleep(2000);
        return false;
    }

    public boolean plantaComeInsetos(int indexPlanta) throws InterruptedException {
        SerVivo planta = seresVivos.get(indexPlanta);
        cleanConsole();
        if (planta instanceof Planta){
            if (((Planta) planta).getFamilia() == FamiliaPlantas.COMEINSETOS){
                for (SerVivo serVivo : this.seresVivos){
                    if (serVivo instanceof Inseto){
                        System.out.println("a Planta ComeInsetos " + planta.getNome() + " da especie " +
                                planta.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                        Thread.sleep(2000);
                        seresVivos.remove(serVivo);
                        return true;
                    }
                }
                System.out.println("a Planta ComeInsetos " + planta.getNome() + " da especie " +
                        planta.getEspecie() + " nao conseguiu comer nenhum inseto\n" +
                        "MOTIVO : Nao existem insetos disponiveis no meio ambiente\n\n\n\n\n");
                Thread.sleep(2000);
                return false;
            }
            System.out.println("A planta fornecida nao pertence a classe de Comedoras de Insetos\n\n\n\n\n");
            Thread.sleep(2000);
            return false;
        }
        System.out.println("O ser vivo fornecido nao e uma planta\n\n\n\n\n");
        Thread.sleep(2000);
        return false;
    }

    public void plantaAbanaComVento(int indexPlanta) throws InterruptedException {
        cleanConsole();
        System.out.println("Está muito vento\n\n\n\n\n");
        Thread.sleep(2000);
    }

    public void animalfazBarulho(int indexAnimal) throws InterruptedException {
        SerVivo animal = seresVivos.get(indexAnimal);
        if (animal instanceof Animal) {
            cleanConsole();
            System.out.println(((Animal) animal).getBarulho());
            System.out.println("\n\n\n\n\n");
            Thread.sleep(2000);
        }
    }

    public void animalMovimenta(int indexAnimal) throws InterruptedException {
        cleanConsole();
        SerVivo animal = seresVivos.get(indexAnimal);
        System.out.println("O " + animal.getNome() + " movimentou-se\n\n\n\n\n");
        Thread.sleep(2000);
    }

    public boolean animalBebe(int indexAnimal) throws InterruptedException {
        SerVivo animal = seresVivos.get(indexAnimal);
        cleanConsole();
        double agua = 0;
        if (animal instanceof Animal) {
            agua = (((Animal) animal).getPeso()) * 0.025; // bebe 0.025L por cada kg de peso
            if (this.agua >= agua){ // verificar se existe agua suficiente
                System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
                System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() + "bebeu " + agua + "L de agua");
                this.agua -= agua; // retira agua bebida
                System.out.println("Agua disponivel no Meio Ambiente apos ser bebida: " + this.agua + "L\n\n\n\n\n");
                Thread.sleep(2000);
                return true;
            }
            System.out.println("Agua disponivel no Meio Ambiente: " + this.agua + "L\n");
            System.out.println("O Animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                    "nao conseguiu beber agua\nMOTIVO: Agua insuficiente\n\n\n\n\n");
            Thread.sleep(2000);
            return false;
        }
        System.out.println("O ser vivo fornecido nao e da classe Animal\n\n\n\n\n");
        Thread.sleep(2000);
        return false;
    }

    public boolean animalCome(int indexAnimal) throws InterruptedException {
        SerVivo animal = seresVivos.get(indexAnimal);
        cleanConsole();
        if (animal instanceof Animal) {
            boolean fome = (((Animal) animal).isFome());
            if (fome) {
                if ((((Animal) animal).getDieta()) == DietaAnimal.CARNIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Inseto) {
                            if (!((Inseto) serVivo).isVenenoso()){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                Thread.sleep(2000);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o inseto " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nATENCAO : O inseto e venenoso\n" +
                                        "O " + animal.getNome() + " MORREU! \n\n\n\n\n");
                                seresVivos.remove(serVivo);
                                this.ultimoVivo = animal;
                                seresVivos.remove(animal);
                                Thread.sleep(2000);
                                return false;
                            }
                        }
                        if (serVivo instanceof Animal && serVivo != animal) {  // evitar que o animal coma a si mesmo
                            if (comerAnimal(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                                this.ultimoVivo = serVivo;
                                seresVivos.remove(serVivo);
                                Thread.sleep(2000);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : O animal tem um grau de defesa superior ao ataque do animal\n\n\n\n\n");
                                ((Animal) animal).setFome(true);
                                Thread.sleep(2000);
                                return false;
                            }
                        }
                    }
                    System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                            " nao conseguiu comer nenhum inseto ou animal\nMOTIVO : Nao existem insetos ou animais disponiveis no meio ambiente\n\n\n\n\n");
                    Thread.sleep(2000);
                }
                if ((((Animal) animal).getDieta()) == DietaAnimal.HERBIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Planta) {
                            if (comerPlanta(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                Thread.sleep(2000);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : A planta tem um grau de defesa superior a inteligencia do animal\n\n\n\n\n");
                                Thread.sleep(2000);
                                return false;
                            }
                        }
                    }
                    System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() +
                            " nao conseguiu comer nenhuma planta\nMOTIVO : Nao existem plantas disponiveis no meio ambiente\n\n\n\n\n");
                    Thread.sleep(2000);
                    return false;
                }
                if ((((Animal) animal).getDieta()) == DietaAnimal.OMNIVORO) {
                    for (SerVivo serVivo : this.seresVivos) {
                        if (serVivo instanceof Planta) {
                            if (comerPlanta(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                                seresVivos.remove(serVivo);
                                ((Animal) animal).setFome(false);
                                Thread.sleep(2000);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer a planta " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : A planta tem um grau de defesa superior a inteligencia do animal\n\n\n\n\n");
                                Thread.sleep(2000);
                                return false;
                            }
                        }
                        if (serVivo instanceof Animal && serVivo != animal) {  // evitar que o animal coma a si mesmo
                            if (comerAnimal(animal, serVivo)){
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " comeu o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\n\n\n\n\n");
                                this.ultimoVivo = serVivo;
                                seresVivos.remove(serVivo);
                                Thread.sleep(2000);
                                return true;
                            }
                            else{
                                System.out.println("O animal " + animal.getNome() + " da especie " +
                                        animal.getEspecie() + " nao conseguiu comer o animal " + serVivo.getNome() +
                                        "da especie " + serVivo.getEspecie() + "\nMOTIVO : O animal tem um grau de defesa superior ao ataque do animal\n\n\n\n\n");
                                ((Animal) animal).setFome(true);
                                Thread.sleep(2000);
                                return false;
                            }
                        }
                    }
                }

            } else
                System.out.println("O animal " + animal.getNome() + " da especie " + animal.getEspecie() + " esta de barriga cheia!\n\n\n\n\n");
            ((Animal) animal).setFome(true);
            Thread.sleep(2000);
            return false;
        }
        System.out.println("O ser vivo fornecido nao e da classe Animal\n\n\n\n\n");
        Thread.sleep(2000);
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

    public void insetoChateia() throws InterruptedException {
        Random rd = new Random();
        cleanConsole();
        int ramdom = rd.nextInt(3);
        if (ramdom == 0)
            System.out.println("Bzzzz bzzzz\n\n\n\n\n");
        if (ramdom == 1)
            System.out.println("Tic tic tic tic\n\n\n\n\n");
        if (ramdom == 2)
            System.out.println("Pssssssss\n\n\n\n\n");
        Thread.sleep(2000);
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

    private int randomSerVivo(String tipoSerVivo) throws InterruptedException {
        ArrayList<SerVivo> filtrados = new ArrayList<>();

        for (SerVivo ser : seresVivos) {
            switch (tipoSerVivo) {
                case "Animal":
                    if (ser instanceof Animal) filtrados.add(ser);
                    break;
                case "Planta":
                    if (ser instanceof Planta) filtrados.add(ser);
                    break;
                case "Inseto":
                    if (ser instanceof Inseto) filtrados.add(ser);
                    break;
                default:
                    System.out.println("Tipo de ser vivo invalido\n\n\n\n\n");
                    Thread.sleep(2000);
                    return -1;
            }
        }

        if (filtrados.isEmpty()) {
            System.out.println("Nenhum ser do tipo '" + tipoSerVivo + "' disponível.\n\n\n\n\n");
            Thread.sleep(2000);
            return -1;
        }

        Random rd = new Random();
        SerVivo escolhido = filtrados.get(rd.nextInt(filtrados.size()));
        return seresVivos.indexOf(escolhido);
    }

    private void acaoPlanta(int acao) throws InterruptedException {
        int index = randomSerVivo("Planta");
        if (index == -1)
            return;
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

    private void acaoAnimal(int acao) throws InterruptedException {
        int index = randomSerVivo("Animal");
        if (index == -1)
            return;
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

    private void catastrofe(int acao) throws InterruptedException {
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
                System.out.println("Acao invalida para catastrofe");
        }
    }

    private void thanos() throws InterruptedException {
        int indexPlanta = randomSerVivo("Planta");
        int indexAnimal = randomSerVivo("Animal");
        if (indexPlanta == -1 && indexAnimal == -1)
            return;
        cleanConsole();
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
                "Metade da populacao de plantas e animais foi morta por uma Erupcao Vulcanica\n\n\n\n\n");
        System.out.println("                                               =:                               ");
        System.out.println("                                       .@:    .@:                               ");
        System.out.println("                                        .@+.  :@    .#@.                        ");
        System.out.println("                                 ...     ...       =@:                         ");
        System.out.println("                              -@#-.=@=.     ..==.. .                           ");
        System.out.println("                           .@@: .   -@. .. +@-..=@:                            ");
        System.out.println("                          :@.     .=@::@@##@@.   :@                            ");
        System.out.println("                          :@    .+@-@@:.    =@   =@                            ");
        System.out.println("                          .@+  .:%@:.       %*   @#                            ");
        System.out.println("                           .@=@@-.      .+@*:    @=                            ");
        System.out.println("                          .@%:.      .*@@@@-     .%%.                          ");
        System.out.println("                         =@.      :%@+.   .@+.     :@.                         ");
        System.out.println("                        .@.    .@@-         +@-    .@:                         ");
        System.out.println("                        :@            .@@##@#:@.   .@:                         ");
        System.out.println("                        :@        .-%@-..   :@*.   .@                          ");
        System.out.println("                        :@      .@#:..       .=@.  @#                          ");
        System.out.println("                        :@             .#@@.  .## .@.                          ");
        System.out.println("                        .@.         .*@*...%@@@+. -@.                          ");
        System.out.println("                         -@.                     -@.                           ");
        System.out.println("                          .@%.                 .%%                             ");
        System.out.println("                            .@#.              :@-                              ");
        System.out.println("                              -@-.           +@.                               ");
        Thread.sleep(2000);
    }

    public void simulador(int dias) throws InterruptedException {
        while (dias >= 0){ // roda os dias todos
            dia.dia++;
            Thread.sleep(2000);
            cleanConsole();
            System.out.println("Um novo dia comeca no " + this.nome + "\n");
            System.out.println("Animais vivos : \n");
            for (SerVivo serVivo : this.seresVivos){ // lista apenas nomes e especie para evitar demasiada info e mete todos os animais com fome
                System.out.println(serVivo.getNome() + " " + serVivo.getEspecie());
                if (serVivo instanceof Animal)
                    ((Animal) serVivo).setFome(true);
            }
            Thread.sleep(2000);
            int momentos = 3; // o dia esta dividido em três momentos (manhã, tarde e noite)
            while (momentos > 0){
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
            }
            // final do dia
            cleanConsole();
            System.out.println("Fim do dia\nAnimais com fome tentam comer!\n\n");
            Thread.sleep(1000);
            animaisComFomeTentamComer(dias);
            cleanConsole();
            int animaisInsetosCounter = 0;
            for (SerVivo serVivo : this.seresVivos){
                if (serVivo instanceof Animal || serVivo instanceof Inseto)
                    animaisInsetosCounter++;
            }
            if (animaisInsetosCounter > 0){
                System.out.println("Seres que sobreviveram a mais um dia:\n");
                for (SerVivo serVivo : this.seresVivos) // lista apenas nomes e especie para evitar demasiada info
                    System.out.println(serVivo.getNome() + " " + serVivo.getEspecie());
            }
            else{
                cleanConsole();
                System.out.println(
                        "                  _.-`''`-._\n" +
                        "                ,`          `.    __________________________ \n" +
                        "                | ,._-'''-.  |   |         MORRERAM         |\n" +
                        "                | |,-.  ,-.| |   |          TODOS           |\n" +
                        "                |/'  `-|  < |    |           !!!            |\n" +
                        "                 \\    (_)   /    `------------------------'\n" +
                        "                  \\  ____  /\n" +
                        "                   \\ `--` /\n" +
                        "            _.--`/'|`-..-'|\\''''`-.\n" +
                        "         ,-'    /  |`._,' / \\      \\\n" +
                        "        |      /   \\,/``\\/   \\    | \\\n" +
                        "        |  |   '>   |\\,/|   <'   ,'  \\\n" +
                        "        |  `/^)\\    |/`\\|    /   /    \\\n" +
                        "       /   / /  \\   |   |   /   |      \\\n" +
                        "      /   / ,``\\ \\  \\   /  /    |       \\\n" +
                        "      '   |    |  \\  \\ /  /     |\\_      \\\n" +
                        "     /   ,| _.'    \\ | | |__...-'` |      \\\n" +
                        "    /   / `. |      |`````         |       \\\n" +
                        "   |   /  ,`')      |              |\\       |\n" +
                        "   |    ,` ,/\\      |            _,:''`,    |\n" +
                        " ---\\,,.-'`---------|          _/  ,` , \\ ,'------------\n" +
                        "                    |_.------''/ /; ,`  |/\n" +
                        "                               `' ```'''");
                Thread.sleep(2000);
                System.out.println("Ultimo a morrer foi :");
                this.ultimoVivo.exibirDetalhes();
                System.out.println("\n\n\n\n\n");
                Thread.sleep(2000);
                return;
            }
            dias--;
        }
    }

    private void animaisComFomeTentamComer(int dias) throws InterruptedException {
        ArrayList<SerVivo> mortos = new ArrayList<>();
        cleanConsole();
        System.out.println("Animais com fome tentam se alimentar uma última vez hoje!");

        for (SerVivo ser : new ArrayList<>(seresVivos)) {
            if (ser instanceof Animal) {
                Animal animal = (Animal) ser;
                if (animal.isFome()) {
                    boolean conseguiuComer = animalCome(seresVivos.indexOf(ser));
                    if (!conseguiuComer) {
                        this.ultimoVivo = ser;
                        mortos.add(ser);
                        System.out.println(
                                        "                 -|- \n" +
                                        "              .-'~~~`-. \n" +
                                        "            .'         `. \n" +
                                        "            |  R  I  P  | \n" +
                                        "            |           | \n" +
                                        "          \\\\|           |// \n\n\n"
                        );
                        Thread.sleep(1500);
                    }
                }
            }
        }

        for (SerVivo morto : mortos) {
            seresVivos.remove(morto);
        }
    }

    public void cleanConsole(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Dia atual: " + dia.dia + "\n\n");
    }

    public class dia {
        public static int dia = 0;
    }

}

