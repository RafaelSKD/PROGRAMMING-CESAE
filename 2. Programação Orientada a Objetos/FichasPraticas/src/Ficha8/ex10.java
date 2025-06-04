package Ficha8;

import Objetos.ContaBancaria;

// The ex10 class demonstrates operations on multiple bank accounts using the ContaBancaria class.
// It covers deposit, withdrawal, and transfer operations, and prints account balances at each step.

public class ex10 {
    public static void main(String[] args) {
        // Create three bank accounts with IBAN and account holder name
        ContaBancaria conta1 = new ContaBancaria(123456, "João Silva");
        ContaBancaria conta2 = new ContaBancaria(654321, "Maria Santos");
        ContaBancaria conta3 = new ContaBancaria(111222, "Pedro Costa");

        // Print initial balances (all should be zero)
        imprimirSaldo(conta1.getSaldo(), conta2.getSaldo(), conta3.getSaldo());

        // Deposit money into each account
        conta1.depositar(500.0);
        conta2.depositar(300.0);
        conta3.depositar(1000.0);

        // Print balances after deposits
        imprimirSaldo(conta1.getSaldo(), conta2.getSaldo(), conta3.getSaldo());

        // Attempt withdrawals
        conta1.levantar(200.0);       // Valid withdrawal
        conta2.levantar(400.0);       // Insufficient funds

        // Print balances after withdrawals
        imprimirSaldo(conta1.getSaldo(), conta2.getSaldo(), conta3.getSaldo());

        // Attempt transfers
        conta2.transferencia(conta3, 50.0); // Should fail due to insufficient funds
        conta1.transferencia(conta2, 100.0); // Should succeed

        // Print final balances
        imprimirSaldo(conta1.getSaldo(), conta2.getSaldo(), conta3.getSaldo());
    }

    // Method to print the balance of all three accounts
    public static void imprimirSaldo(double conta1, double conta2, double conta3) {
        System.out.println("\nSaldo da conta 1: " + conta1);
        System.out.println("Saldo da conta 2: " + conta2);
        System.out.println("Saldo da conta 3: " + conta3 + "\n");
    }
}
