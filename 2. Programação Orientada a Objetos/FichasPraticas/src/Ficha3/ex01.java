package Ficha3;

import Objetos.MusicPlayer;
import Objetos.Musica;

public class ex01 {
    public static void main(String[] args) {
        Musica m1 = new Musica("Hallowed Be Thy Name", "Heavy Metal", "Iron Maiden", 431);       // 7:11
        Musica m2 = new Musica("Back in Black", "Hard Rock", "AC/DC", 255);                      // 4:15
        Musica m3 = new Musica("Smells Like Teen Spirit", "Grunge", "Nirvana", 301);             // 5:01
        Musica m4 = new Musica("Freak on a Leash", "Nu Metal", "Korn", 250);                     // 4:10
        Musica m5 = new Musica("Master of Puppets", "Thrash Metal", "Metallica", 515);           // 8:35
        Musica m6 = new Musica("Chop Suey!", "Alternative/Nu Metal", "System of a Down", 210);   // 3:30

        MusicPlayer mp3 = new MusicPlayer();

        mp3.addMusica(m1);
        mp3.addMusica(m2);
        mp3.addMusica(m3);
        mp3.addMusica(m4);
        mp3.addMusica(m5);
        mp3.addMusica(m6);

        mp3.trocarPosicaoMusicas(0, 5);

        mp3.removerMusica(2);

        mp3.duracao();

        mp3.removerTodasAsMusicas();

        mp3.duracao();
    }
}
