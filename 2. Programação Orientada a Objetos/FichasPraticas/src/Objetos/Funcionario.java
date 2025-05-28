// The Funcionario class represents an employee with attributes such as name, email,
// department, and salary. It allows updating the department and increasing the salary
// by a given percentage.

package Objetos;

public class Funcionario {
    private String nome;             // Employee's name
    private String email;            // Employee's email
    private String departamento;     // Department the employee works in
    private double salario;          // Employee's current salary

    // Setter to update the department of the employee
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Getter for the employee's name
    public String getNome() {
        return nome;
    }

    // Getter for the employee's email
    public String getEmail() {
        return email;
    }

    // Getter for the employee's department
    public String getDepartamento() {
        return departamento;
    }

    // Getter for the employee's salary
    public double getSalario() {
        return salario;
    }

    // Constructor to initialize all attributes of the employee
    public Funcionario(String nome, String email, String departamento, double salario) {
        this.nome = nome;
        this.email = email;
        this.departamento = departamento;
        this.salario = salario;
    }

    // Increases the employee's salary by a given percentage
    public void aumentarSalario(double percentagem) {
        this.salario = this.salario + (this.salario * (percentagem / 100));
    }
}
