package FichasPraticas.FichaPratica3.Ex01.Unit;



/*A classe Unit representa uma unidade de combate do jogo e possui uma estratégia de ataque. O construtor da
classe recebe uma implementação de AttackStrategy e o método performAttack executa o comportamento de
ataque correspondente.*/

import FichasPraticas.FichaPratica3.Ex01.Strategy.AttackStrategy;

// Classe que utiliza o padrão Strategy
public class Unit {
    private AttackStrategy attackStrategy;

    public Unit(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }

    public void performAttack() {
        attackStrategy.attack();
    }
}
