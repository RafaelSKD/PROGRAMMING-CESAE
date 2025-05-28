package Objetos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MusicPlayer {
    private ArrayList<Musica> programacao = new ArrayList<>();

    public void addMusica(Musica musica) {
        this.programacao.add(musica);
    }

    public void trocarPosicaoMusicas(int index1, int index2) {
        Musica musica1 = this.programacao.get(index1);
        Musica musica2 = this.programacao.get(index2);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, musica1);
    }

    public void trocarPosicaoMusicas(Musica musica1, Musica musica2) {
        int index1 = this.programacao.indexOf(musica1);
        int index2 = this.programacao.indexOf(musica2);

        Musica temp = this.programacao.get(index1);

        this.programacao.set(index1, musica2);
        this.programacao.set(index2, temp);
    }

    public void removerMusica(int index) {
        this.programacao.remove(index);
    }

    public void removerMusica(Musica musica) {
        this.programacao.remove(musica);
    }

    public void removerTodasAsMusicas() {
        this.programacao.clear();
    }

    public void imprimirRelatorio() {
        System.out.println("Programacao Atual: Relatorio\n");
        int i = 0;
        for (Musica musicaAtual : this.programacao)
            musicaAtual.exibirDetalhes(i++);
    }

    public void duracao(){
        int segundos = 0, horas = 0, minutos = 0;
        for (Musica musicaAtual : this.programacao){
                segundos += musicaAtual.getDuracao();
        }

        horas=segundos/3600;
        segundos=segundos%3600;

        minutos=segundos/60;
        segundos=segundos%60;

        System.out.println("O total de duracao da playList e de : " + horas + ":" + minutos + ":" + segundos + '\n');

    }

}
