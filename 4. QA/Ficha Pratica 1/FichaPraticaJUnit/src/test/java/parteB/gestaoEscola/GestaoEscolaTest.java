package parteB.gestaoEscola;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class GestaoEscolaTest {
    Aluno al;
    Aluno alc;

    Escola es;
    Escola esc;

    Professor pf;
    Professor pfc;

    @BeforeEach
    void setUp() {
        // criar Aluno e Controlo
        al = new Aluno(1, "Rafael", 1997, "5", "PT", "casa", "email", "91");
        alc = new Aluno(2, "Simba", 2020, "0", "CAO", "casota", "nao", "00");

        // criar Escola e Controlo
        es = new Escola();
        esc = new Escola();

        // criar Professor e Controlo
        pf = new Professor(1, "Vitor", "java", "email", "91");
        pfc = new Professor(2, "substituto", "substituir", "email@", "96");
    }

    ////////////////////////////////////////////////////////////////////////////////////////Testes aos getters
    ////////////////////////////////////////////////////////////////////////////////////////Professor
    @Test
    void getIdProfessorTest() {
        assertEquals(1, pf.getIdProfessor());

        //Controlo
        assertEquals(2, pfc.getIdProfessor());
    }

    @Test
    void getNomeTest() {
        assertEquals("Vitor", pf.getNome());

        // Controlo
        assertEquals("substituto", pfc.getNome());
    }

    @Test
    void getEspecialidadeTest() {
        assertEquals("java", pf.getEspecialidade());

        // Controlo
        assertEquals("substituir", pfc.getEspecialidade());
    }

    @Test
    void getEmailTest() {
        assertEquals("email", pf.getEmail());

        // Controlo
        assertEquals("email@", pfc.getEmail());
    }

    @Test
    void getTelefoneTest() {
        assertEquals("91", pf.getTelefone());

        // Controlo
        assertEquals("96", pfc.getTelefone());
    }

    ////////////////////////////////////////////////////////////////////////////////////////Aluno
    @Test
    void getAnoNascimentoTest() {
        assertEquals(1997, al.getAnoNascimento());

        // Controlo
        assertEquals(2020, alc.getAnoNascimento());
    }

    @Test
    void getHabilitacaoLiterariaTest() {
        assertEquals("5", al.getHabilitacaoLiteraria());

        // Controlo
        assertEquals("0", alc.getHabilitacaoLiteraria());
    }

    @Test
    void getNacionalidadeTest() {
        assertEquals("PT", al.getNacionalidade());

        // Controlo
        assertEquals("CAO", alc.getNacionalidade());
    }

    @Test
    void getMoradaTest() {
        assertEquals("casa", al.getMorada());

        // Controlo
        assertEquals("casota", alc.getMorada());
    }

    @Test
    void getEmailAlunoTest() {
        assertEquals("email", al.getEmail());

        // Controlo
        assertEquals("nao", alc.getEmail());
    }

    @Test
    void getTelefoneAlunoTest() {
        assertEquals("91", al.getTelefone());

        // Controlo
        assertEquals("00", alc.getTelefone());
    }

    @Test
    void getNotasTest() {
        assertNotNull(al.getNotas());
        assertTrue(al.getNotas().isEmpty());

        // Controlo
        assertNotNull(alc.getNotas());
        assertTrue(alc.getNotas().isEmpty());
    }

    @Test
    void getNomeAlunoTest() {
        assertEquals("Rafael", al.getNome());

        // Controlo
        assertEquals("Simba", alc.getNome());
    }


    ////////////////////////////////////////////////////////////////////////////////////////Escola
    @Test
    void getAlunos() {
        assertNotNull(es.getAlunos());
        assertTrue(es.getAlunos().isEmpty());

        // Controlo
        assertNotNull(esc.getAlunos());
        assertTrue(esc.getAlunos().isEmpty());
    }

    @Test
    void getProfessores() {
        assertNotNull(es.getProfessores());
        assertTrue(es.getProfessores().isEmpty());

        // Controlo
        assertNotNull(esc.getProfessores());
        assertTrue(esc.getProfessores().isEmpty());
    }

    @Test
    /**
     * Adiciona um aluno à escola.
     *
     * @param aluno O aluno a adicionar.
     */
    void adicionarAlunoTest(){
        assertEquals(0, es.numeroTotalAlunos());
        es.adicionarAluno(al);
        assertEquals(1, es.numeroTotalAlunos());

        //Controlo
        assertEquals(0, esc.numeroTotalAlunos());
        esc.adicionarAluno(alc);
        assertEquals(1, esc.numeroTotalAlunos());
        esc.adicionarAluno(al);
        assertEquals(2, esc.numeroTotalAlunos());
    }

    @Test
    void adicionarAlunoIgualTest(){
        assertEquals(0, es.numeroTotalAlunos());
        es.adicionarAluno(al);
        assertEquals(1, es.numeroTotalAlunos());
        es.adicionarAluno(al);
        assertEquals(1, es.numeroTotalAlunos());

        //Controlo
        assertEquals(0, esc.numeroTotalAlunos());
        esc.adicionarAluno(alc);
        assertEquals(1, esc.numeroTotalAlunos());
        esc.adicionarAluno(alc);
        assertEquals(1, esc.numeroTotalAlunos());
        esc.adicionarAluno(al);
        assertEquals(2, esc.numeroTotalAlunos());
    }

    ////////////////////////////////////////////////////////////////////////////////////////Testes Escola

    @Test
    /**
     * Adiciona um professor à escola.
     *
     * @param professor O professor a adicionar.
     */
    void adicionarProfessorTest() {
        assertEquals(0, es.numeroTotalProfessores());
        es.adicionarProfessor(pf);
        assertEquals(1, es.numeroTotalProfessores());

        //Controlo
        assertEquals(0, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pfc);
        assertEquals(1, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pf);
        assertEquals(2, esc.numeroTotalProfessores());
    }

    @Test
    void adicionarProfessorIgualTest() {
        assertEquals(0, es.numeroTotalProfessores());
        es.adicionarProfessor(pf);
        assertEquals(1, es.numeroTotalProfessores());
        es.adicionarProfessor(pf);
        assertEquals(1, es.numeroTotalProfessores());

        //Controlo
        assertEquals(0, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pfc);
        assertEquals(1, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pfc);
        assertEquals(1, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pf);
        assertEquals(2, esc.numeroTotalProfessores());
        esc.adicionarProfessor(pf);
        assertEquals(2, esc.numeroTotalProfessores());
    }

    @Test
    /**
     * Pesquisa um aluno pelo número de aluno.
     *
     * @param numeroAluno O número do aluno.
     * @return O aluno encontrado ou null se não existir.
     */
    void pesquisarAlunoPorNumeroTest() {
        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        assertNull(es.pesquisarAlunoPorNumero(0));
        assertEquals(al, es.pesquisarAlunoPorNumero(1));
        assertEquals(alc, es.pesquisarAlunoPorNumero(2));
    }

    @Test
    /**
     * Pesquisa um professor pelo ID.
     *
     * @param idProfessor O ID do professor.
     * @return O professor encontrado ou null se não existir.
     */
    void pesquisarProfessorPorIdTest() {
        es.adicionarProfessor(pf);
        es.adicionarProfessor(pfc);

        assertNull(es.pesquisarProfessorPorId(0));
        assertEquals(pf, es.pesquisarProfessorPorId(1));
        assertEquals(pfc, es.pesquisarProfessorPorId(2));
    }

    @Test
    /**
     * Obtém o aluno com a média mais alta.
     *
     * @return O melhor aluno ou null se não existirem alunos.
     */
    void obterMelhorAlunoTest() {
        assertNull(es.obterMelhorAluno());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        al.adicionarNota(10);
        al.adicionarNota(20);
        al.adicionarNota(10);
        al.adicionarNota(15);
        alc.adicionarNota(10);
        alc.adicionarNota(10);
        alc.adicionarNota(10);
        alc.adicionarNota(15);

        assertEquals(al, es.obterMelhorAluno());

        alc.adicionarNota(2000);

        assertEquals(alc, es.obterMelhorAluno());
    }

    @Test
    void obterMelhorAlunoSemNotasTest() {
        assertNull(es.obterMelhorAluno());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        assertNull(es.obterMelhorAluno());
    }

    @Test
    void obterMelhorAlunoMesmasNotasTest() {
        assertNull(es.obterMelhorAluno());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        al.adicionarNota(10);
        alc.adicionarNota(10);

        assertThrows(IllegalStateException.class, () -> es.obterMelhorAluno());
    }

    @Test
    /**
     * Obtém a lista de alunos com média inferior à nota mínima (reprovados).
     *
     * @param notaMinima A nota mínima para aprovação.
     * @return Lista de alunos reprovados.
     */
    void alunosReprovadosTest() {
        //vazio
        assertTrue(es.alunosReprovados(10).isEmpty());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        //sem notas
        assertFalse(es.alunosReprovados(10).contains(al));
        assertFalse(es.alunosReprovados(10).contains(alc));

        al.adicionarNota(9);
        alc.adicionarNota(10);

        // com notas, apenas 1 inferior a 10
        assertTrue(es.alunosReprovados(10).contains(al));
        assertFalse(es.alunosReprovados(10).contains(alc));

        al.adicionarNota(11);

        //subir a media para 10 para sair dos reprovados
        assertFalse(es.alunosReprovados(10).contains(al));
    }

    @Test
    /**
     * Obtém a lista de alunos de uma nacionalidade específica.
     *
     * @param nacionalidade A nacionalidade a filtrar.
     * @return Lista de alunos da nacionalidade.
     */
    void alunosPorNacionalidadeTest() {
        //vazio
        assertTrue(es.alunosPorNacionalidade("PT").isEmpty());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);

        //com Nacionalidade
        assertTrue(es.alunosPorNacionalidade("PT").contains(al));
        assertFalse(es.alunosPorNacionalidade("PT").contains(alc));

        assertFalse(es.alunosPorNacionalidade("CAO").contains(al));
        assertTrue(es.alunosPorNacionalidade("CAO").contains(alc));

        //Sem match
        assertTrue(es.alunosPorNacionalidade("qqcoisa").isEmpty());
    }

    @Test
    /**
     * Obtém a lista de professores de uma determinada especialidade.
     *
     * @param especialidade A especialidade a filtrar.
     * @return Lista de professores da especialidade.
     */
    void professoresPorEspecialidadeTest() {
        //vazio
        assertTrue(es.professoresPorEspecialidade("java").isEmpty());

        es.adicionarProfessor(pf);
        es.adicionarProfessor(pfc);

        //com Nacionalidade
        assertTrue(es.professoresPorEspecialidade("java").contains(pf));
        assertFalse(es.professoresPorEspecialidade("java").contains(pfc));

        assertFalse(es.professoresPorEspecialidade("substituir").contains(pf));
        assertTrue(es.professoresPorEspecialidade("substituir").contains(pfc));

        //Sem match
        assertTrue(es.professoresPorEspecialidade("C").isEmpty());
    }

    @Test
    /**
     * Devolve o número total de alunos na escola.
     *
     * @return Quantidade de alunos.
     */
    void numeroTotalAlunosTest() {
        assertEquals(0, es.numeroTotalAlunos());
        es.adicionarAluno(al);
        assertEquals(1, es.numeroTotalAlunos());
        es.adicionarAluno(alc);
        assertEquals(2, es.numeroTotalAlunos());
    }

    @Test
    /**
     * Devolve o número total de professores na escola.
     *
     * @return Quantidade de professores.
     */
    void numeroTotalProfessoresTest() {
        assertEquals(0, es.numeroTotalProfessores());
        es.adicionarProfessor(pf);
        assertEquals(1, es.numeroTotalProfessores());
        es.adicionarProfessor(pfc);
        assertEquals(2, es.numeroTotalProfessores());
    }

    @Test
    /**
     * Devolve o número total de pessoas na escola (alunos e professores).
     *
     * @return Quantidade total de pessoas.
     */
    void numeroTotalPessoasTest() {
        assertEquals(0, es.numeroTotalPessoas());
        es.adicionarAluno(al);
        assertEquals(1, es.numeroTotalPessoas());
        es.adicionarAluno(alc);
        assertEquals(2, es.numeroTotalPessoas());
        es.adicionarProfessor(pf);
        assertEquals(3, es.numeroTotalPessoas());
        es.adicionarProfessor(pfc);
        assertEquals(4, es.numeroTotalPessoas());
    }

    @Test
    /**
     * Remove um aluno com base no seu número.
     *
     * @param numeroAluno O número do aluno a remover.
     * @return true se o aluno foi removido, false se não encontrado.
     */
    void removerAlunoPorNumeroTest() {
        assertEquals(0, es.numeroTotalPessoas());

        es.adicionarAluno(al);
        es.adicionarAluno(alc);
        assertEquals(2, es.numeroTotalPessoas());

        // Remove 'al'
        es.removerAlunoPorNumero(1);
        assertEquals(1, es.numeroTotalPessoas());
        assertFalse(es.getAlunos().contains(al));
        assertTrue(es.getAlunos().contains(alc));

        // remove 'alc'
        es.adicionarAluno(al);
        es.removerAlunoPorNumero(2); // alc
        assertEquals(1, es.numeroTotalPessoas());
        assertTrue(es.getAlunos().contains(al));
        assertFalse(es.getAlunos().contains(alc));

        // remover um que nao existe
        es.removerAlunoPorNumero(3);
        assertEquals(1, es.numeroTotalPessoas());
    }

    @Test
    /**
     * Remove um professor com base no seu ID.
     *
     * @param idProfessor O ID do professor a remover.
     * @return true se o professor foi removido, false se não encontrado.
     */
    void removerProfessorPorIdTest() {
        assertEquals(0, es.numeroTotalPessoas());

        es.adicionarProfessor(pf);
        es.adicionarProfessor(pfc);
        assertEquals(2, es.numeroTotalPessoas());

        // Remove pf
        es.removerProfessorPorId(1);
        assertEquals(1, es.numeroTotalPessoas());
        assertFalse(es.getProfessores().contains(pf));
        assertTrue(es.getProfessores().contains(pfc));

        // remove pfc
        es.adicionarProfessor(pf);
        es.removerProfessorPorId(2);
        assertEquals(1, es.numeroTotalPessoas());
        assertTrue(es.getProfessores().contains(pf));
        assertFalse(es.getProfessores().contains(pfc));
    }

    ////////////////////////////////////////////////////////////////////////////////////////Testes Aluno

    @Test
    /**
     * Adiciona uma nova nota ao aluno.
     */
    void adicionarNotaTest() {
        assertTrue(al.getNotas().isEmpty());
        al.adicionarNota(10);
        assertFalse(al.getNotas().isEmpty());
        assertTrue(al.getNotas().contains(10.0));
    }

    @Test
    /**
     * Calcula a média das notas.
     */
    void calcularMediaTest() {
        assertEquals(0, al.calcularMedia());

        al.adicionarNota(5);
        al.adicionarNota(15);
        al.adicionarNota(25);

        assertEquals(15, al.calcularMedia());
    }

    @Test
    /**
     * Retorna a nota mais alta.
     */
    void notaMaisAltaTest() {
        assertEquals(0, al.notaMaisAlta());

        al.adicionarNota(5);
        al.adicionarNota(15);
        al.adicionarNota(25);

        assertEquals(25, al.calcularMedia());
    }

    @Test
    /**
     * Retorna a nota mais baixa.
     */
    void notaMaisBaixaTest() {
        assertEquals(0, al.notaMaisBaixa());

        al.adicionarNota(5);
        al.adicionarNota(15);
        al.adicionarNota(25);

        assertEquals(5, al.notaMaisBaixa());
    }
}
