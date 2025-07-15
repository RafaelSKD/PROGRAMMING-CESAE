package parteA.gestaoBancaria;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parteA.atletas.Atleta;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria contaBancaria;
    ContaBancaria contaBancariaControlo;

    @BeforeEach
    void setUp() {
        contaBancaria = new ContaBancaria("titular", 2000, 1999, "pt", "iban");
        contaBancariaControlo = new ContaBancaria("titularControlo", 5000, 2025, "es", "ibanControlo");
    }

    /**
     * Testes a getters.
     */
    @Test
    void getTitularTest() {
        assertEquals("titular", contaBancaria.getTitular());

        // CONTROLO
        assertEquals("titularControlo", contaBancariaControlo.getTitular());
    }

    @Test
    void getSaldoTest() {
        assertEquals(2000, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void getAnoCriacaoTest() {
        assertEquals(1999, contaBancaria.getAnoCriacao());

        // CONTROLO
        assertEquals(2025, contaBancariaControlo.getAnoCriacao());
    }

    @Test
    void getPaisTest() {
        assertEquals("pt", contaBancaria.getPais());

        // CONTROLO
        assertEquals("es", contaBancariaControlo.getPais());
    }

    @Test
    void getIbanTest() {
        assertEquals("iban", contaBancaria.getIban());

        // CONTROLO
        assertEquals("ibanControlo", contaBancariaControlo.getIban());
    }

    /**
     * Deposita o valor especificado, adicionando-o ao saldo.
     *
     * param valor O valor a depositar
     */
    @Test
    void depositarValidTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.depositar(500);
        assertEquals(2500, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.depositar(1000);
        assertEquals(6000, contaBancariaControlo.getSaldo());
    }

    @Test
    void depositarInvalidTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.depositar(-500);
        assertEquals(1500, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancaria.depositar(-1000);
        assertEquals(4000, contaBancaria.getSaldo());
    }

    /**
     * Levanta o valor especificado do saldo, mas apenas se o saldo
     * for suficiente para cobrir essa quantia. Caso contrário, não faz nada.
     *
     * param valor O valor que se pretende levantar
     */
    @Test
    void levantarValidTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.levantar(500);
        assertEquals(1500, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.levantar(1000);
        assertEquals(4000, contaBancariaControlo.getSaldo());
    }

    @Test
    void levantarValidMaxTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.levantar(2000);
        assertEquals(0, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.levantar(5000);
        assertEquals(0, contaBancariaControlo.getSaldo());
    }

    @Test
    void levantarValidMinTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.levantar(0);
        assertEquals(2000, contaBancaria.getSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.levantar(0);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    /**
     * Transfere o valor especificado desta conta para a conta de destino,
     * desde que esta conta tenha saldo suficiente para isso.
     * Se não houver saldo suficiente, a transferência não é efectuada.
     *
     * param destino A conta de destino que receberá o valor
     * param valor   O valor a transferir
     */
    @Test
    void transferirValidTest() {
        ContaBancaria contaTemp = new ContaBancaria("titular", 10000, 1999, "pt", "iban");

        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.transferir(contaTemp, 1000);
        assertEquals(1000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.transferir(contaTemp, 2000);
        assertEquals(3000, contaBancariaControlo.getSaldo());
    }

    @Test
    void transferirValidMaxTest() {
        ContaBancaria contaTemp = new ContaBancaria("titular", 10000, 1999, "pt", "iban");
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.transferir(contaTemp, 2000);
        assertEquals(0, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.transferir(contaTemp, 5000);
        assertEquals(0, contaBancariaControlo.getSaldo());
    }

    @Test
    void transferirValidMinTest() {
        ContaBancaria contaTemp = new ContaBancaria("titular", 10000, 1999, "pt", "iban");
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.transferir(contaTemp, 0);
        assertEquals(2000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.transferir(contaTemp, 0);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void transferirInvalidNegTest() {
        ContaBancaria contaTemp = new ContaBancaria("titular", 10000, 1999, "pt", "iban");
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.transferir(contaTemp, -1000);
        assertEquals(2000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.transferir(contaTemp, -1);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void transferirInvalidTest() {
        ContaBancaria contaTemp = new ContaBancaria("titular", 10000, 1999, "pt", "iban");
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.transferir(contaTemp, 3000);
        assertEquals(2000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.transferir(contaTemp, 6000);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void transferirInvalidSameAccountTest() {
        assertThrows(IllegalArgumentException.class, () -> contaBancaria.transferir(contaBancaria, 100));

        // Controlo
        assertThrows(IllegalArgumentException.class, () -> contaBancariaControlo.transferir(contaBancariaControlo, 1000));
    }

    /**
     * Aplica um rendimento mensal ao saldo, tendo em conta a taxa especificada.
     * Por exemplo, uma taxa de 0.01 equivale a 1% de rendimento.
     *
     * param taxa A taxa de rendimento (ex.: 0.01 = 1%)
     */
    @Test
    void aplicarRendimentoMensalValidTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.aplicarRendimentoMensal(0.10);
        assertEquals(2200, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.aplicarRendimentoMensal(0.50);
        assertEquals(7500, contaBancariaControlo.getSaldo());
    }

    @Test
    void aplicarRendimentoMensalInvalidTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.aplicarRendimentoMensal(-10);
        assertEquals(2000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.aplicarRendimentoMensal(-1);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void aplicarRendimentoMensalZeroTest() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.aplicarRendimentoMensal(0);
        assertEquals(2000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.aplicarRendimentoMensal(0);
        assertEquals(5000, contaBancariaControlo.getSaldo());
    }

    @Test
    void aplicarRendimentoMensal200Test() {
        assertEquals(2000, contaBancaria.getSaldo());
        contaBancaria.aplicarRendimentoMensal(2);
        assertEquals(6000, contaBancaria.getSaldo());

        // Controlo

        assertEquals(5000, contaBancariaControlo.getSaldo());
        contaBancariaControlo.aplicarRendimentoMensal(2);
        assertEquals(15000, contaBancariaControlo.getSaldo());
    }

    /**
     * Retorna o saldo atual da conta.
     * return O valor numérico do saldo
     */
    @Test
    void consultarSaldoValidTest() {
        assertEquals(2000, contaBancaria.consultarSaldo());

        // CONTROLO
        assertEquals(5000, contaBancariaControlo.consultarSaldo());
    }

    /**
     * Gera um resumo textual com as principais informações da conta,
     * incluindo o titular, IBAN, país, ano de criação e saldo atual.
     * return Uma String que descreve os atributos principais da conta
     */
    @Test
    void gerarResumoConta() {
        assertEquals("Titular: titular, IBAN: iban, País: pt, AnoCriação: 1999, Saldo: 2000.0", contaBancaria.gerarResumoConta());

        //CONTROLO
        assertEquals("Titular: titularControlo, IBAN: ibanControlo, País: es, AnoCriação: 2025, Saldo: 5000.0", contaBancariaControlo.gerarResumoConta());
    }
}