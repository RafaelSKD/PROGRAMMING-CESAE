package Ficha14.ex02_Jogo;

import Ficha14.ex02_Jogo.Enum.Categoria;
import Ficha14.ex02_Jogo.Objetos.Arena;
import Ficha14.ex02_Jogo.Objetos.NPC;
import Ficha14.ex02_Jogo.Objetos.Personagem;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Personagem heroi = new Personagem("Thoran", 100, 20, 5, Categoria.GUERREIRO, "Espada Longa");

        NPC goblin = new NPC("Goblin Selvagem", 100, 5);
        NPC lobo = new NPC("Lobo das Sombras", 100, 7);
        NPC aldeao = new NPC("Aldeão Curioso", 100, 2);

        Arena arena = new Arena();

        arena.addPersonagem(heroi);
        arena.addNPC(goblin);
        arena.addNPC(lobo);
        arena.addNPC(aldeao);

        arena.arena();
    }
}
