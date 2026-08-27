package br.senai.df.zerodropout.model;

public class Aluno {
    // 1. Atributos (as informações que todo aluno terá)
    private String matricula;
    private String nome;
    private double notaDiagnostica;

    // 2. Construtor (usado para criar um novo aluno com os dados)
    public Aluno(String matricula, String nome, double notaDiagnostica) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaDiagnostica = notaDiagnostica;
    }

    // 3. Métodos Getters (para conseguir ler os dados do aluno)
    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaDiagnostica() {
        return notaDiagnostica;
    }
}



