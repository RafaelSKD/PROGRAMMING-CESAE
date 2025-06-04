package Ficha8;

import Objetos.Funcionario;

// The ex09 class demonstrates the usage of the Funcionario class.
// It creates a Funcionario object, displays initial information, applies a salary increase,
// and then displays the updated information.

public class ex09 {
    public static void main(String[] args) {
        // Create a new employee with name, email, department, and salary
        Funcionario funcionario = new Funcionario("Jaquim", "jaquim@email.pt", "informatica", 1000.);

        // Display initial employee details
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Salario: " + funcionario.getSalario());

        System.out.println("-----------------------------");

        // Apply a 10% salary increase
        funcionario.aumentarSalario(10);

        // Display updated employee details
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Email: " + funcionario.getEmail());
        System.out.println("Departamento: " + funcionario.getDepartamento());
        System.out.println("Salario: " + funcionario.getSalario());
    }
}
