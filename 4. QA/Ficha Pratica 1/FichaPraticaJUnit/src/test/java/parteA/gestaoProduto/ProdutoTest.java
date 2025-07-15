package parteA.gestaoProduto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import parteA.gestaoBancaria.ContaBancaria;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    Produto pt;
    Produto ptc;

    @BeforeEach
    void setUp() {
        pt = new Produto("produto", 100, 2, "cat", "marca");
        ptc = new Produto("produto2", 10, 1, "cat2", "marca2");
    }

    /**
     * Testes a getters.
     */
    @Test
    void getNomeTest() {
        assertEquals("produto", pt.getNome());

        // CONTROLO
        assertEquals("produto2", ptc.getNome());
    }

    @Test
    void getPrecoBaseTest() {
        assertEquals(100, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
    }

    @Test
    void getStockTest() {
        assertEquals(2, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
    }

    @Test
    void getCategoriaTest() {
        assertEquals("cat", pt.getCategoria());

        // CONTROLO
        assertEquals("cat2", ptc.getCategoria());
    }

    @Test
    void getMarcaTest() {
        assertEquals("marca", pt.getMarca());

        // CONTROLO
        assertEquals("marca2", ptc.getMarca());
    }

    /**
     * Atualiza o preço base do produto, substituindo o preço anterior pelo novo.
     *
     * param novoPreco O novo preço base que se pretende definir
     */
    @Test
    void actualizarPrecoBaseValidTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.actualizarPrecoBase(10);
        assertEquals(10, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.actualizarPrecoBase(500);
        assertEquals(500, ptc.getPrecoBase());
    }

    @Test
    void actualizarPrecoBaseInvalidTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.actualizarPrecoBase(-10);
        assertEquals(100, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.actualizarPrecoBase(-500);
        assertEquals(10, ptc.getPrecoBase());
    }

    @Test
    void actualizarPrecoBaseSameTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.actualizarPrecoBase(100);
        assertEquals(100, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.actualizarPrecoBase(10);
        assertEquals(10, ptc.getPrecoBase());
    }

    @Test
    void actualizarPrecoBaseZeroTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.actualizarPrecoBase(0);
        assertEquals(0, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.actualizarPrecoBase(0);
        assertEquals(0, ptc.getPrecoBase());
    }

    /**
     * Aplica um desconto ao preço base do produto, de acordo com a percentagem fornecida.
     * <p>
     * Exemplo de funcionamento desejado:
     * <pre>
     *   precoBase = precoBase * (1 - percentagem);
     * </pre>
     *
     * param percentagem A percentagem de desconto a aplicar (ex.: 0.20 = 20%)
     */
    @Test
    void aplicarDescontoValidTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.aplicarDesconto(0.10);
        assertEquals(90, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.aplicarDesconto(0.20);
        assertEquals(8, ptc.getPrecoBase());
    }

    @Test
    void aplicarDescontoInvalidTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.aplicarDesconto(-0.10);
        assertEquals(100, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.aplicarDesconto(-0.20);
        assertEquals(10, ptc.getPrecoBase());
    }

    /**
     * Calcula o preço final do produto após eventuais alterações
     * (como o desconto aplicado através de aplicarDesconto(double)).
     *
     * @return O preço final atual do produto
     */
    @Test
    void calcularPrecoFinalValidTest() {
        assertEquals(100, pt.getPrecoBase());
        pt.aplicarDesconto(0.10);
        assertEquals(90, pt.getPrecoBase());

        // CONTROLO
        assertEquals(10, ptc.getPrecoBase());
        ptc.aplicarDesconto(0.20);
        assertEquals(8, ptc.getPrecoBase());
    }

    /**
     * Adiciona uma quantidade de produtos ao stock atual.
     *
     * param quantidade A quantidade a adicionar ao stock
     */
    @Test
    void adicionarStockValidTest() {
        assertEquals(2, pt.getStock());
        pt.adicionarStock(8);
        assertEquals(10, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
        ptc.adicionarStock(9);
        assertEquals(10, ptc.getStock());
    }

    @Test
    void adicionarStockInvalidTest() {
        assertEquals(2, pt.getStock());
        pt.adicionarStock(-8);
        assertEquals(2, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
        ptc.adicionarStock(-9);
        assertEquals(1, ptc.getStock());
    }

    /**
     * Remove uma quantidade de produtos do stock atual, se houver stock suficiente.
     * Caso o stock seja insuficiente, a operação não é efectuada.
     *
     * param quantidade A quantidade a remover do stock
     */
    @Test
    void removerStockValidTest() {
        assertEquals(2, pt.getStock());
        pt.removerStock(1);
        assertEquals(1, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
        ptc.removerStock(1);
        assertEquals(0, ptc.getStock());
    }

    @Test
    void removerStockZeroTest() {
        assertEquals(2, pt.getStock());
        pt.removerStock(2);
        assertEquals(0, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
        ptc.removerStock(1);
        assertEquals(0, ptc.getStock());
    }

    @Test
    void removerStockInvalidTest() {
        assertEquals(2, pt.getStock());
        pt.removerStock(5);
        assertEquals(2, pt.getStock());

        // CONTROLO
        assertEquals(1, ptc.getStock());
        ptc.removerStock(2);
        assertEquals(1, ptc.getStock());
    }

    @Test
    void gerarDescricaoProduto() {
        assertEquals("Produto: produto, Marca: marca, Categoria: cat, PreçoBase: 100.0, Stock: 2", pt.gerarDescricaoProduto());

        //CONTROLO
        assertEquals("Produto: produto2, Marca: marca2, Categoria: cat2, PreçoBase: 10.0, Stock: 1", ptc.gerarDescricaoProduto());
    }

    @Test
    /**
     * Calcula o preço final do produto após eventuais alterações
     * (como o desconto aplicado através de {@link #aplicarDesconto(double)}).
     *
     * @return O preço final atual do produto
     */
    void calcularPrecoFinalTest() {
        assertEquals(100, pt.calcularPrecoFinal());

        //CONTROLO
        assertEquals(10, ptc.calcularPrecoFinal());
    }
}