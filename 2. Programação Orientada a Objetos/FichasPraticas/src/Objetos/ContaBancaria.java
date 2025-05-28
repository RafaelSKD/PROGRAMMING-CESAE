// The ContaBancaria class represents a bank account with basic operations such as deposit, withdrawal,
// transfer, and features like loans and debt repayment.
// It supports credit margin management and tracks opening year and account debt.

package Objetos;

public class ContaBancaria {
    // Basic attributes (Ficha 1)
    private int iban;                 // Bank account number (simplified as int here)
    private String titular;          // Account holder's name
    private double saldo = 0.0;      // Current account balance

    // Extended attributes (Ficha 2)
    private int anoDeAbertura = 2025;        // Account opening year
    private double margemDeEmprestimo = 0.5; // Loan margin (50% of current balance)
    private double divida = 0;               // Current debt amount

    // Constructor initializing account with IBAN and account holder
    public ContaBancaria(int iban, String titular) {
        this.iban = iban;
        this.titular = titular;
    }

    // Getter for current balance
    public double getSaldo() {
        return saldo;
    }

    // Deposits money into the account if the value is positive
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposit of " + valor + " completed successfully to account: " + this.iban);
        }
    }

    // Withdraws money from the account if there's enough balance
    public void levantar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Withdrawal of " + valor + " completed successfully.");
        } else {
            System.out.println("Insufficient balance. Withdrawal not completed.");
        }
    }

    // Transfers money to another account if there's enough balance
    public void transferencia(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("\nTransfer of " + valor + " from account: " + this.iban + " to account " + contaDestino.iban + " completed successfully.");
            contaDestino.depositar(valor); // Deposit into the destination account
        } else {
            System.out.println("Insufficient balance. Transfer not completed.");
        }
    }

    // Requests a loan if conditions are met: no existing debt and within allowed margin
    public void pedirEmprestimo(double valor) {
        if (valor > 0 && valor <= (this.saldo * this.margemDeEmprestimo) && this.divida == 0) {
            this.divida += valor;
            this.saldo += valor;
            System.out.println("Loan of " + valor + " granted successfully. Current debt: " + this.divida);
        } else {
            System.out.println("Loan not granted. Check requested amount or existing debt.");
        }
    }

    // Repays part or all of the loan if the amount is valid and sufficient balance exists
    public void amortizarEmprestimo(double valor) {
        if (valor > 0 && valor <= this.divida) {
            this.divida -= valor;
            this.saldo -= valor;
            System.out.println("Loan repayment of " + valor + " completed successfully. Remaining debt: " + this.divida);
        } else {
            System.out.println("Repayment not completed. Check the amount or if debt exists.");
        }
    }
}
