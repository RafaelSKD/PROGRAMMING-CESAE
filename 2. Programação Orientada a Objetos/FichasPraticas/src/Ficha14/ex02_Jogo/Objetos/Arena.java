package Ficha14.ex02_Jogo.Objetos;

import java.util.ArrayList;

import static java.lang.Thread.sleep;

public class Arena {
    private ArrayList<NPC> npc = new ArrayList<>();
    private Personagem personagem;

    public Arena() {
    }

    public void addNPC(NPC npc) {
        this.npc.add(npc);
    }

    public void addPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public void arena() throws InterruptedException {
        while (true){
            int flag = 1;
            for (NPC npc : this.npc){
                while (npc.getVida() > 0 && ((Personagem) personagem).getVida() > 0){
                    if (flag == 1){
                        cleanConsole();
                        System.out.println("Personagem " + personagem.getNome() + " ataca com " + personagem.getForca() + " de forca o npc " + npc.getNome());
                        npc.setVida(npc.getVida() - personagem.getForca());
                        System.out.println("NPC " + npc.getNome() + " ficou com " + npc.getVida() + " de vida");
                        sleep(3000);
                    }
                    if (flag == -1){
                        cleanConsole();
                        System.out.println("NPC " + npc.getNome() + " ataca com " + npc.getForca() + " de forca o personagem " + personagem.getNome());
                        personagem.setVida(personagem.getVida() - npc.getForca());
                        System.out.println("Personagem " + personagem.getNome() + " ficou com " + personagem.getVida() + " de vida");
                        sleep(3000);
                    }
                    flag *= -1;
                }
                if (npc.getVida() <= 0) {
                    cleanConsole();
                    System.out.println("NPC " + npc.getNome() + " foi derrotado!");
                    sleep(3000);
                }
                if (((Personagem) personagem).getVida() > 0) {
                    cleanConsole();
                    System.out.println("Parabens " + personagem.getCategoria() + " " + personagem.getNome() + ", ganhou o combate contra um " +
                            npc.getNome() + " com o uso de " + personagem.getArma());
                    personagem.setNivel(personagem.getNivel() + 1);
                    personagem.setForca((int) (personagem.getForca() * 1.1));
                    personagem.setVida(100);
                    sleep(3000);
                }
            }
            int npcVivos = 0;
            for (NPC npc : this.npc){
                if (npc.getVida() > 0) {
                    npcVivos++;
                }
            }
            if (npcVivos == 0) {
                cleanConsole();
                System.out.println("Todos os NPCs foram derrotados! O jogo acabou.");
                break;
            }
        }
    }

    private void cleanConsole() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");;
    }
}
