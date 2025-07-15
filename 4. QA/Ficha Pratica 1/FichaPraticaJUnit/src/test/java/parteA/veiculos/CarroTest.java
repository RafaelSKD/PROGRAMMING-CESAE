package parteA.veiculos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parteA.gestaoProduto.Produto;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    Carro c;
    Carro cc;

    @BeforeEach
    void setUp() {
        c = new Carro("marca", "modelo", 2000, 500, 3000, TipoCombustivel.DIESEL, 10);
        cc = new Carro("marca2", "modelo2", 1000, 100, 1000, TipoCombustivel.GASOLINA, 5);
    }

    /**
     * Testes a getters.
     */
    @Test
    void getMarcaTest() {
        assertEquals("marca", c.getMarca());

        // CONTROLO
        assertEquals("marca2", cc.getMarca());
    }

    @Test
    void getModeloTest() {
        assertEquals("modelo", c.getModelo());

        // CONTROLO
        assertEquals("modelo2", cc.getModelo());
    }

    @Test
    void getAnoFabricoTest() {
        assertEquals(2000, c.getAnoFabrico());

        // CONTROLO
        assertEquals(1000, cc.getAnoFabrico());
    }

    @Test
    void getPotenciaCvTest() {
        assertEquals(500, c.getPotenciaCv());

        // CONTROLO
        assertEquals(100, cc.getPotenciaCv());
    }

    @Test
    void getCcTest() {
        assertEquals(3000, c.getCc());

        // CONTROLO
        assertEquals(1000, cc.getCc());
    }

    @Test
    void getCombustivelTest() {
        assertEquals(TipoCombustivel.DIESEL, c.getCombustivel());

        // CONTROLO
        assertEquals(TipoCombustivel.GASOLINA, cc.getCombustivel());
    }

    @Test
    void getConsumoL100KmTest() {
        assertEquals(10, c.getConsumoL100Km());

        // CONTROLO
        assertEquals(5, cc.getConsumoL100Km());
    }

    /**
     * Calcula a idade atual do carro.
     *
     * @return Idade do carro em anos
     */
    @Test
    void idadeTest() {
        assertEquals(25, c.idade());

        //CONTROLO
        assertEquals(1025, cc.idade());
    }

    /**
     * Liga o carro, simulando o som e comportamento com base nas suas
     * características como idade, tipo de combustível e potência.
     */
    @Test
    void ligarTest() {
        //???
    }

    /**
     * Compara este carro com outro e determina o vencedor de uma corrida
     * com base na potência, cilindrada e ano de fabrico.
     *
     * @param adversario Carro adversário na corrida
     * @return O carro vencedor ou {@code null} em caso de empate total
     */
    @Test
    void corridaLoseCvTest() {
        Carro teste = new Carro("marca", "modelo", 2000, 5000, 3000, TipoCombustivel.DIESEL, 10);

        assertEquals(teste, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1000, 1000, 1000, TipoCombustivel.GASOLINA, 5);

        assertEquals(teste2, cc.corrida(teste2));
    }

    @Test
    void corridaWinCvTest() {
        Carro teste = new Carro("marca", "modelo", 2000, 50, 3000, TipoCombustivel.DIESEL, 10);

        assertEquals(c, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1000, 10, 1000, TipoCombustivel.GASOLINA, 5);

        assertEquals(cc, cc.corrida(teste2));
    }

    @Test
    void corridaLoseCcTest() {
        Carro teste = new Carro("marca", "modelo", 2000, 500, 30000, TipoCombustivel.DIESEL, 10);

        assertEquals(teste, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1000, 100, 10000, TipoCombustivel.GASOLINA, 5);

        assertEquals(teste2, cc.corrida(teste2));
    }

    @Test
    void corridaWinCcTest() {
        Carro teste = new Carro("marca", "modelo", 2000, 500, 300, TipoCombustivel.DIESEL, 10);

        assertEquals(c, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1000, 100, 100, TipoCombustivel.GASOLINA, 5);

        assertEquals(cc, cc.corrida(teste2));
    }

    @Test
    void corridaLoseYearTest() {
        Carro teste = new Carro("marca", "modelo", 2001, 500, 3000, TipoCombustivel.DIESEL, 10);

        assertEquals(teste, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1001, 100, 1000, TipoCombustivel.GASOLINA, 5);

        assertEquals(teste2, cc.corrida(teste2));
    }

    @Test
    void corridaWinYearTest() {
        Carro teste = new Carro("marca", "modelo", 200, 500, 3000, TipoCombustivel.DIESEL, 10);

        assertEquals(c, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 100, 100, 1000, TipoCombustivel.GASOLINA, 5);
        assertEquals(cc, cc.corrida(teste2));
    }

    @Test
    void corridaTieTest() {
        Carro teste = new Carro("marca", "modelo", 2000, 500, 3000, TipoCombustivel.DIESEL, 10);

        assertEquals(null, c.corrida(teste));

        //CONTROLO
        Carro teste2 = new Carro("marca2", "modelo2", 1000, 100, 1000, TipoCombustivel.GASOLINA, 5);

        assertEquals(null, cc.corrida(teste2));
    }

    @Test
    void corridaSameCarTest() {
        assertThrows(IllegalArgumentException.class, () -> c.corrida(c));

        //CONTROLO
        assertThrows(IllegalArgumentException.class, () -> cc.corrida(cc));
    }

    /**
     * Calcula o consumo de combustível numa viagem, com base na distância percorrida.
     *
     * @param kms Distância da viagem em quilómetros
     * @return Quantidade estimada de litros consumidos
     */
    @Test
    void calcularConsumoViagemValidTest() {
        assertEquals(10, c.calcularConsumoViagem(100));

        //CONTROLO
        assertEquals(5, cc.calcularConsumoViagem(100));
    }

    @Test
    void calcularConsumoViagemZeroTest() {
        assertEquals(0, c.calcularConsumoViagem(0));

        //CONTROLO
        assertEquals(0, cc.calcularConsumoViagem(0));
    }

    @Test
    void calcularConsumoViagemInvalidTest() {
        assertThrows(IllegalArgumentException.class, () -> c.calcularConsumoViagem(-100));

        //CONTROLO
        assertThrows(IllegalArgumentException.class, () -> cc.calcularConsumoViagem(-100));
    }

    /**
     * Exibe no terminal os detalhes principais do carro: marca, modelo e ano de fabrico.
     */
    @Test
    void exibirDetalhes() {
        // ???
    }
}