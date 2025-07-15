package parteA.atletas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AtletaTest {

    Atleta atleta;
    Atleta atletaControlo;

    @BeforeEach
    void setUp() {
        atleta = new Atleta("atleta", 28, "modalidade", "clube");
        atletaControlo = new Atleta("atletaControlo", 28, "modalidadeControlo", "clubeControlo");
    }

    @Test
    void getNome() {
    }

    @Test
    void getIdade() {
    }

    @Test
    void getModalidade() {
    }

    @Test
    void getClube() {
    }

    @Test
    void getTotalMedalhas() {
    }

    @Test
    void getRecorde() {
    }

    @Test
    void getTotalHorasTreino() {
    }

    @Test
    void competir() {
    }

    @Test
    void treinar() {
    }

    @Test
    void adicionarMedalha() {
    }

    @Test
    void atualizarRecorde() {
    }

    @Test
    void mudarClube() {
    }

    @Test
    void descansar() {
    }

    @Test
    void gerarPerfilAtleta() {
    }
}