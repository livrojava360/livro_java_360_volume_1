package br.senai.df.zerodropout.model;

import java.util.ArrayList;
import java.util.List;

public class Turma {
// 1. Atributos da Turma
    private String codigoTurma;
    private String nomeCurso;
    private List<Aluno> alunos; // Lista que vai guardar vários Alunos

    // 2. Construtor
    public Turma(String codigoTurma, String nomeCurso) {
        this.codigoTurma = codigoTurma;
        this.nomeCurso = nomeCurso;
        this.alunos = new ArrayList<>(); // Inicializa a lista vazia
    }

    // 3. Método para adicionar um aluno à turma
    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    // 4. Métodos Getters (para ler as informações)
    public String getCodigoTurma() {
        return codigoTurma;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
