package Ficha9;

import Objetos.ContaBancaria;

// The ex02 class demonstrates advanced operations using the ContaBancaria class (Ficha 2).
// It includes deposits, loan requests, transfers, and loan repayments, with both valid and invalid scenarios.

public class ex02 {
    public static void main(String[] args) {
        // Creating accounts for Rafael, Maria, and João
        ContaBancaria rafael = new ContaBancaria(123456789, "Rafael");
        ContaBancaria maria = new ContaBancaria(987654321, "Maria");
        ContaBancaria joao = new ContaBancaria(456789123, "João");

        // Initial deposits
        rafael.depositar(1000.0);
        maria.depositar(500.0);
        joao.depositar(2000.0);

        // Loan requests
        maria.pedirEmprestimo(300.0);  // Invalid: exceeds allowed loan margin
        joao.pedirEmprestimo(900.0);   // Valid: within allowed margin and no existing debt

        // Transfers
        rafael.transferencia(maria, 200.0);     // Valid transfer
        rafael.transferencia(joao, 1500.0);     // Invalid transfer: insufficient balance

        // Loan repayments
        joao.amortizarEmprestimo(500.0);        // Valid partial repayment
        rafael.amortizarEmprestimo(100.0);      // Invalid: Rafael has no loan
        maria.amortizarEmprestimo(100.0);       // Invalid: Maria has no loan
    }
}
