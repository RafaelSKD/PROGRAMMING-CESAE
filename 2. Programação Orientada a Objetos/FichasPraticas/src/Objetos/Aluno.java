// The Aluno class represents a student with basic personal and academic information.
// It includes methods for accessing and updating student data, handling birthdays,
// and checking whether the student is approved based on their average grade.

package Objetos;

public class Aluno {
    private String nome;     // Student's name
    private int idade;       // Student's age
    private String email;    // Student's email address
    private String curso;    // Course the student is enrolled in
    private double media;    // Student's grade average

    // Getter for the student's name
    public String getNome() {
        return nome;
    }

    // Getter for the student's age
    public int getIdade() {
        return idade;
    }

    // Setter to update the student's course
    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Setter to update the student's average grade
    public void setMedia(double media) {
        this.media = media;
    }

    // Getter for the student's email
    public String getEmail() {
        return email;
    }

    // Getter for the student's course
    public String getCurso() {
        return curso;
    }

    // Getter for the student's average grade
    public double getMedia() {
        return media;
    }

    // Constructor to initialize all student attributes
    public Aluno(String nome, int idade, String email, String curso, double media) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.curso = curso;
        this.media = media;
    }

    // Increases the student's age by 1 (used for birthdays)
    public void felizAniversario() {
        this.idade += 1;
    }

    // Determines if the student is approved (passing grade is above 9.5)
    public boolean situacaoAprovacao() {
        if (this.media > 9.5)
            return true;
        return false;
    }
}
